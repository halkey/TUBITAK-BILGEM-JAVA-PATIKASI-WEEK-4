package com.patikadev.View;

import javax.swing.*;

public class HotelManagamentGUI extends JFrame {

    private JPanel wrapper;
    private JTextField fld_hotelName;
    private JTextField fld_hotelLocation;
    private JTextField fld_hotelAddress;
    private JTextField fld_hotelPhone;
    private JTextField fld_hotelMail;
    private JTextField fld_hotelStar;
    private JCheckBox cbx_wifi;
    private JCheckBox cbx_swimPool;
    private JCheckBox cbx_spa;
    private JCheckBox cbx_fitness;
    private JCheckBox cbx_hotelConcierge;
    private JCheckBox cbx_roomServices;
    private JCheckBox cbx_freeCarPark;
    private JComboBox cmb_hostelType;
    private JButton btn_hotelAdd;
    private JTabbedPane tbdpn_hotelManagement;
    private JComboBox cmb_roomType;
    private JComboBox cmb_hotelName;
    private JTextField fld_bedNum;
    private JTextField fld_squareMeters;
    private JCheckBox cbx_tv;
    private JCheckBox cbx_projection;
    private JCheckBox cbx_till;
    private JCheckBox cbx_miniBar;
    private JCheckBox cbx_gameConsole;
    private JButton btn_roomAdd;

    private void createUIComponents() {
          }

public HotelManagamentGUI(){
    add(wrapper);
    setSize(900,600);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setResizable(false);
    setVisible(true);
}
}
