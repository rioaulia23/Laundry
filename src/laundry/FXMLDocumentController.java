/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;


import javafx.event.ActionEvent;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Rio Aulia Yahya
 */
public class FXMLDocumentController {

    @FXML
    private Button proses;

    @FXML
    private Label label;

    @FXML
    private TextField editnama;

    @FXML
    private TextField editalamat;

    @FXML
    private TextField editberatcucian;

    @FXML
    private TextField editnomortelpon;

    @FXML
    private Label paket;

    @FXML
    private RadioButton rdb1;

    @FXML
    private RadioButton rdb2;

    @FXML
    private RadioButton rdb3;

    @FXML
    private TextArea TA;

    @FXML
    private Button hapus;


    @FXML
    private TextField editpengambilan;
     @FXML
  
    void proses(ActionEvent event) {
        String paket;
        if(rdb1.isSelected()){
            paket = "Cuci Kering";}
        else if (rdb2.isSelected()){
            paket = "Cuci Kering Setrika";}
            else if (rdb3.isSelected()){
            paket = "Setrika";}
            else{
                paket = "";}
        if (!(rdb1.isSelected() || rdb3.isSelected() || rdb2.isSelected())){
            JOptionPane.showMessageDialog(null, "Harap Pilih Layanan");}
        else {
            int harga = 0;
            String Nama = editnama.getText();
            String Alamat = editalamat.getText();
            String Berat = editberatcucian.getText();
            String Tanggal = editpengambilan.getText();
            int hitung = Integer.parseInt(editberatcucian.getText());
            if (rdb1.isSelected()){
                harga = hitung*5000;}
            if(rdb3.isSelected()){
                harga = hitung*4000;}
            if(rdb2.isSelected()){
                harga = hitung*6000;
            }
            String nohp=editnomortelpon.getText();
            TA.setText("Nama :"+Nama+"\n Alamat :"+Alamat+"\n Berat Cucian:"+Berat+
                    "\n Telpon :"+nohp+"\n Total :"+harga);
            }
        }
        
        

    
 @FXML
    void hapus(ActionEvent event) {
    TA.setText("");
    editnama.setText("");
    editalamat.setText("");
    editberatcucian.setText("");
    editnomortelpon.setText("");
    rdb1.setSelected(false);
    rdb2.setSelected(false);
    rdb3.setSelected(false);
    editpengambilan.setText("");
        String harga = " ";
    }}


    
    
