/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

/**
 *
 * @author USER
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        
        start(); // Memanggil metode start untuk melakukan pengaturan awal dan menyiapkan event listener
    }
    
    ArrayList<String> kotaFavorit = new ArrayList<>();;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCuaca = new javax.swing.JLabel();
        labelIkon = new javax.swing.JLabel();
        textFieldKota = new javax.swing.JTextField();
        comboBoxFavorit = new javax.swing.JComboBox<>();
        buttonCek = new javax.swing.JButton();
        buttonFavorit = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        buttonMuat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCuaca = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Cek Cuaca Sederhana");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Masukkan Kota");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pilih Favorit");

        labelCuaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCuaca.setText("Cuaca : ");

        labelIkon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelIkon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textFieldKota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comboBoxFavorit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonCek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCek.setText("Cek Cuaca");

        buttonFavorit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonFavorit.setText("Tambah Favorit");

        buttonSimpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonSimpan.setText("Simpan Data");

        buttonMuat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonMuat.setText("Muat Data");

        tableCuaca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kota", "Cuaca", "Suhu (°C)"
            }
        ));
        jScrollPane1.setViewportView(tableCuaca);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCuaca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonMuat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxFavorit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldKota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonCek, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonFavorit, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxFavorit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCek)
                    .addComponent(buttonFavorit))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCuaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelIkon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSimpan)
                    .addComponent(buttonMuat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void simpanDataCuaca() {
        try (FileWriter writer = new FileWriter("data_cuaca.csv", true)) { // Membuka FileWriter untuk menulis data cuaca ke file CSV
            DefaultTableModel tableModel = (DefaultTableModel) tableCuaca.getModel(); // Mengambil model tabel dari komponen GUI
            for (int i = 0; i < tableModel.getRowCount(); i++) { // Iterasi melalui semua baris tabel
                String city = tableModel.getValueAt(i, 0).toString(); // Mendapatkan nama kota dari kolom pertama
                String weather = tableModel.getValueAt(i, 1).toString(); // Mendapatkan cuaca dari kolom kedua
                String temp = tableModel.getValueAt(i, 2).toString(); // Mendapatkan suhu dari kolom ketiga
                writer.append(city).append(",").append(weather).append(",").append(temp).append("\n"); // Menulis data ke file
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke CSV"); // Menampilkan pesan sukses
        } catch (IOException e) {
            e.printStackTrace(); // Menangani pengecualian IO
        }
    }
    
    private void muatDataCuaca() {
        File file = new File("data_cuaca.csv");

        try {
            if (!file.exists()) { // Memeriksa apakah file ada
                file.createNewFile(); // Membuat file baru jika tidak ada
                try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                    writer.println("Kota,Cuaca,Suhu (°C)"); // Menulis header untuk file CSV
                }
                JOptionPane.showMessageDialog(this, "File data_cuaca.csv berhasil dibuat."); // Menampilkan pesan sukses
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // Membaca data dari file CSV
                DefaultTableModel tableModel = (DefaultTableModel) tableCuaca.getModel(); // Mengambil model tabel
                String line;
                tableModel.setRowCount(0); // Menghapus semua baris yang ada di tabel
                while ((line = reader.readLine()) != null) { // Membaca setiap baris
                    String[] data = line.split(","); // Memisahkan data berdasarkan koma
                    tableModel.addRow(data); // Menambahkan baris ke model tabel
                }
                JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari CSV"); // Menampilkan pesan sukses
            }
        } catch (IOException e) {
            e.printStackTrace(); // Menangani pengecualian IO
        }
    }
    
    private void getCuaca(String city) {
        String apiKey = "042ec8689a1d1dfaba84af0c6e14d088"; // Kunci API untuk OpenWeatherMap
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric"; // URL untuk meminta data cuaca

        try {
            URL url = new URL(urlString); // Membuat objek URL dari string
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // Membuka koneksi HTTP
            conn.setRequestMethod("GET"); // Mengatur metode permintaan ke GET
            conn.connect(); // Melakukan koneksi

            int responseCode = conn.getResponseCode(); // Mendapatkan kode respons
            if (responseCode == 200) { // Memeriksa apakah permintaan berhasil
                InputStream inputStream = conn.getInputStream(); // Mendapatkan aliran input dari koneksi
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // Membaca data dari aliran input
                StringBuilder stringBuilder = new StringBuilder(); // Membuat StringBuilder untuk menyimpan data
                String line;
                while ((line = reader.readLine()) != null) { // Membaca setiap baris
                    stringBuilder.append(line); // Menambahkan baris ke StringBuilder
                }

                JSONObject json = new JSONObject(stringBuilder.toString()); // Mengonversi string menjadi objek JSON
                String weather = json.getJSONArray("weather").getJSONObject(0).getString("main"); // Mendapatkan kondisi cuaca
                String icon = json.getJSONArray("weather").getJSONObject(0).getString("icon"); // Mendapatkan ikon cuaca
                double temp = json.getJSONObject("main").getDouble("temp"); // Mendapatkan suhu

                String translatedWeather = terjemahkanCuaca(weather); // Menerjemahkan kondisi cuaca
                labelCuaca.setText("Cuaca : " + translatedWeather + " (" + temp + "°C)"); // Menampilkan kondisi cuaca di label

                String iconUrl = "http://openweathermap.org/img/wn/" + icon + "@2x.png"; // URL ikon cuaca
                ImageIcon iconImage = new ImageIcon(new URL(iconUrl)); // Membuat objek ImageIcon dari URL
                labelIkon.setIcon(iconImage); // Mengatur ikon cuaca di label

                DefaultTableModel tableModel = (DefaultTableModel) tableCuaca.getModel(); // Mengambil model tabel
                tableModel.addRow(new Object[]{city, translatedWeather, temp}); // Menambahkan data cuaca ke tabel
            } else {
                labelCuaca.setText("Kota tidak ditemukan."); // Menampilkan pesan jika kota tidak ditemukan
            }
        } catch (Exception e) {
            e.printStackTrace(); // Menangani pengecualian
        }
    }
    
    private void tambahKotaFavorit() {
        String city = textFieldKota.getText(); // Mendapatkan nama kota dari text field
        if (!city.isEmpty() && !kotaFavorit.contains(city)) { // Memeriksa apakah kota tidak kosong dan belum ada di daftar favorit
            kotaFavorit.add(city); // Menambahkan kota ke daftar favorit
            comboBoxFavorit.addItem(city); // Menambahkan kota ke combo box favorit
            JOptionPane.showMessageDialog(this, "Kota " + city + " ditambahkan ke favorit."); // Menampilkan pesan sukses
        } else if (kotaFavorit.contains(city)) {
            JOptionPane.showMessageDialog(this, "Kota " + city + " sudah ada di favorit."); // Menampilkan pesan jika kota sudah ada
        }
    }
    
    private void simpanFavorit() {
        try (FileWriter writer = new FileWriter("kota_favorit.txt")) { // Membuka FileWriter untuk menyimpan kota favorit
            for (String city : kotaFavorit) {
                writer.write(city + "\n"); // Menulis setiap kota ke file
            }
        } catch (IOException e) {
            e.printStackTrace(); // Menangani pengecualian IO
        }
    }

    private void muatFavorit() {
        File file = new File("kota_favorit.txt");

        try {
            if (!file.exists()) { // Memeriksa apakah file favorit ada
                file.createNewFile(); // Membuat file baru jika tidak ada
                JOptionPane.showMessageDialog(this, "File kota_favorit.txt berhasil dibuat."); // Menampilkan pesan sukses
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // Membaca data dari file kota favorit
                String line;
                kotaFavorit.clear(); // Menghapus daftar kota favorit yang ada
                comboBoxFavorit.removeAllItems(); // Menghapus semua item dari combo box
                while ((line = reader.readLine()) != null) { // Membaca setiap baris
                    kotaFavorit.add(line); // Menambahkan kota ke daftar favorit
                    comboBoxFavorit.addItem(line); // Menambahkan kota ke combo box favorit
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Menangani pengecualian IO
        }
    }

    private String terjemahkanCuaca(String weather) {
        switch (weather.toLowerCase()) { // Menerjemahkan kondisi cuaca ke bahasa Indonesia
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
                return weather; // Mengembalikan kondisi cuaca asli jika tidak ada terjemahan
        }
    }
    
    private void start() {
        muatFavorit(); // Memuat daftar kota favorit saat aplikasi dimulai
        Runtime.getRuntime().addShutdownHook(new Thread(() -> { // Menambahkan hook untuk menyimpan favorit saat aplikasi ditutup
            simpanFavorit();
        }));
        
        // Mendapatkan item yang dipilih dari comboBoxFavorit
        String comboBox = (String) comboBoxFavorit.getSelectedItem();

        // Mengecek apakah item yang dipilih tidak kosong
        if (!comboBox.isEmpty()) {
            // Memanggil metode getCuaca dengan parameter item yang dipilih
            getCuaca(comboBox);
        }

        // Menambahkan ItemListener pada comboBoxFavorit
        comboBoxFavorit.addItemListener(e -> {
            // Mengecek apakah state dari event adalah SELECTED (item dipilih)
            if (e.getStateChange() == ItemEvent.SELECTED) {
                // Mendapatkan item yang dipilih sebagai kota
                String city = (String) comboBoxFavorit.getSelectedItem();
                // Memanggil metode getCuaca dengan kota yang dipilih
                getCuaca(city);
            }
        });

        // Menambahkan ActionListener pada buttonCek
        buttonCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mendapatkan teks dari textFieldKota
                String textField = textFieldKota.getText();
                // Mendapatkan item yang dipilih dari comboBoxFavorit
                String comboBox = (String) comboBoxFavorit.getSelectedItem();

                // Mengecek apakah textFieldKota tidak kosong
                if (!textField.isEmpty()) {
                    // Memanggil metode getCuaca dengan parameter dari textFieldKota
                    getCuaca(textField);
                } else if (comboBox.isEmpty()) {
                    // Menampilkan pesan error jika kedua input kosong
                    JOptionPane.showMessageDialog(null, "Kota harus terisi!");
                }
            }
        });


        buttonFavorit.addActionListener(new ActionListener() { // Menambahkan aksi untuk tombol tambah kota favorit
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahKotaFavorit(); // Memanggil metode untuk menambahkan kota favorit
            }
        });

        buttonSimpan.addActionListener(new ActionListener() { // Menambahkan aksi untuk tombol simpan data cuaca
            @Override
            public void actionPerformed(ActionEvent e) {
                simpanDataCuaca(); // Memanggil metode untuk menyimpan data cuaca
            }
        });
        
        buttonMuat.addActionListener(new ActionListener() { // Menambahkan aksi untuk tombol muat data cuaca
            @Override
            public void actionPerformed(ActionEvent e) {
                muatDataCuaca(); // Memanggil metode untuk memuat data cuaca
            }
        });
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCek;
    private javax.swing.JButton buttonFavorit;
    private javax.swing.JButton buttonMuat;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JComboBox<String> comboBoxFavorit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCuaca;
    private javax.swing.JLabel labelIkon;
    private javax.swing.JTable tableCuaca;
    private javax.swing.JTextField textFieldKota;
    // End of variables declaration//GEN-END:variables
}

//042ec8689a1d1dfaba84af0c6e14d088