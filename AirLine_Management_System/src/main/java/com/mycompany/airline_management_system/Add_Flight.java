/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.airline_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SAIKUMAR CHEREDDY
 */
public class Add_Flight extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_Flight
     */
    public Add_Flight() {
        initComponents();
        autoId();
    }
    Connection con;
    PreparedStatement pre;
    
    public void autoId(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_management","root","SriNidhee@16");
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            java.sql.Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("Select MAX(idFlight)from Flight");
            rs.next();
            if(rs.getString("MAX(idFlight)")==null){
                flightID.setText("FL001");
            }
            else {
                long id = Long.parseLong(rs.getString("MAX(idFlight)").substring(2,rs.getString("MAX(idFlight)").length()));
                id++;
                flightID.setText("FL"+String.format("%03d", id));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        flightID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        arrival = new javax.swing.JTextField();
        departure = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        seats = new javax.swing.JTextField();
        fare = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Flight ID");

        jLabel2.setText("FlightName");

        jLabel3.setText("Arrival");

        jLabel4.setText("Departure");

        jLabel5.setText("Date");

        jLabel6.setText("No. Seats Left");

        jLabel7.setText("Fare per person");

        jLabel8.setText("Time of Travel");

        fare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fareActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(flightID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(arrival)
                                    .addComponent(departure, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(seats, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(fare)
                                    .addComponent(time)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton1)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(flightID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fareActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Name=name.getText();
        String Arrival=arrival.getText();
        String Departure=departure.getText();
        String Seat=seats.getText();
        String Fee=fare.getText();
       
        String Time = time.getText();
        String FlightID = flightID.getText();
        
        DateFormat dt=new SimpleDateFormat("yyyy-MM-dd");
        String Date = dt.format(date.getDate());
        
        
        try {                                         
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_management","root","SriNidhee@16");
            pre = con.prepareStatement("Insert into flight(idFlight,FlightName,Arrival,Departure,Seats,Fare,Duration,Date)values(?,?,?,?,?,?,?,?)");
            pre.setString(1,FlightID);
            pre.setString(2,Name);
            pre.setString(3,Arrival);
            pre.setString(4,Departure);
            pre.setString(5,Seat);
            pre.setString(6,Fee);
            pre.setString(7,Time);
            pre.setString(8,Date);
            
            
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null,"Flight Added");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrival;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField departure;
    private javax.swing.JTextField fare;
    private javax.swing.JTextField flightID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField seats;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
