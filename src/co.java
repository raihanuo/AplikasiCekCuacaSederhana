/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONObject;
import javax.swing.table.DefaultTableModel;

public class co extends JFrame {

    private JTextField cityField;
    private JLabel weatherLabel, iconLabel;
    private JComboBox<String> favoriteCitiesComboBox;
    private ArrayList<String> favoriteCities;
    private DefaultTableModel tableModel;
    private JTable weatherTable;

    public co() {
        setTitle("Weather Checker");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cityField = new JTextField(15);
        JButton checkWeatherButton = new JButton("Cek Cuaca");
        JButton saveDataButton = new JButton("Simpan Data");
        JButton loadDataButton = new JButton("Muat Data");
        weatherLabel = new JLabel("Cuaca: ");
        iconLabel = new JLabel();
        favoriteCitiesComboBox = new JComboBox<>();
        favoriteCities = new ArrayList<>();
        
        String[] columnNames = {"Kota", "Cuaca", "Suhu (°C)"};
        tableModel = new DefaultTableModel(columnNames, 0);
        weatherTable = new JTable(tableModel);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(new JLabel("Masukkan Kota:"));
        panel.add(cityField);
        panel.add(new JLabel("Pilih Favorit:"));
        panel.add(favoriteCitiesComboBox);
        panel.add(checkWeatherButton);
        panel.add(new JLabel()); 
        panel.add(weatherLabel);
        panel.add(iconLabel);
        panel.add(saveDataButton);
        panel.add(loadDataButton);
        
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BorderLayout());
        tablePanel.add(new JScrollPane(weatherTable), BorderLayout.CENTER);
        
        add(panel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);
        
        checkWeatherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String city = cityField.getText();
                if (!city.isEmpty()) {
                    getWeather(city);
                }
            }
        });
        
        saveDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveWeatherData();
            }
        });
        
        loadDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadWeatherData();
            }
        });

        setVisible(true);
    }
    private void saveWeatherData() {
        try (FileWriter writer = new FileWriter("weather_data.csv", true)) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String city = tableModel.getValueAt(i, 0).toString();
                String weather = tableModel.getValueAt(i, 1).toString();
                String temp = tableModel.getValueAt(i, 2).toString();
                writer.append(city).append(",").append(weather).append(",").append(temp).append("\n");
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke CSV");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void loadWeatherData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("weather_data.csv"))) {
            String line;
            tableModel.setRowCount(0); 
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                tableModel.addRow(data);
            }
            JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari CSV");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void getWeather(String city) {
        String apiKey = "042ec8689a1d1dfaba84af0c6e14d088";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = conn.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                
                JSONObject json = new JSONObject(stringBuilder.toString());
                String weather = json.getJSONArray("weather").getJSONObject(0).getString("main");
                String icon = json.getJSONArray("weather").getJSONObject(0).getString("icon");
                double temp = json.getJSONObject("main").getDouble("temp");
                
                String translatedWeather = translateWeather(weather);
                weatherLabel.setText("Cuaca: " + translatedWeather + " (" + temp + "°C)");
                
                String iconUrl = "http://openweathermap.org/img/wn/" + icon + "@2x.png";
                ImageIcon iconImage = new ImageIcon(new URL(iconUrl));
                iconLabel.setIcon(iconImage);

                tableModel.addRow(new Object[]{city, translatedWeather, temp});
            } else {
                weatherLabel.setText("Kota tidak ditemukan.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String translateWeather(String weather) {
        switch (weather.toLowerCase()) {
            case "clear":
                return "Cerah";
            case "clouds":
                return "Berawan";
            case "rain":
                return "Hujan";
            case "snow":
                return "Salju";
            case "thunderstorm":
                return "Badai Petir";
            case "drizzle":
                return "Gerimis";
            case "mist":
                return "Kabut";
            default:
                return weather;
        }
    }


    public static void main(String[] args) {
        new co();
    }
}
