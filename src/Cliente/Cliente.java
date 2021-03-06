package Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class Cliente extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread hilo;

    public Cliente() {
        initComponents();
        lbFecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_mensaje = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrans = new javax.swing.JTable();
        btn_enviar = new javax.swing.JButton();
        txtSaldo = new javax.swing.JTextField();
        btnArray = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArray = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        lbFecha = new javax.swing.JLabel();
        lbhora = new javax.swing.JLabel();
        txt_Trama = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        btn_Transaccion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        combo_Trans = new javax.swing.JComboBox<>();
        lb_Establecimiento = new javax.swing.JLabel();
        lb_Numero = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTrans);

        btn_enviar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen2.png"))); // NOI18N
        btn_enviar.setText("Consultar Saldo");
        btn_enviar.setBorderPainted(false);
        btn_enviar.setContentAreaFilled(false);
        btn_enviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_enviar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen2.png"))); // NOI18N
        btn_enviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        btn_enviar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btnArray.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnArray.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N
        btnArray.setText("Cargar Array");
        btnArray.setBorderPainted(false);
        btnArray.setContentAreaFilled(false);
        btnArray.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArray.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cargar.png"))); // NOI18N
        btnArray.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cargar.png"))); // NOI18N
        btnArray.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrayActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de cuenta");

        txtArray.setColumns(20);
        txtArray.setRows(5);
        jScrollPane2.setViewportView(txtArray);

        jLabel3.setText("Saldo Actual");

        jLabel4.setText("Transaccion");

        txtDeposito.setText("00.00");

        btnDepositar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deposito1.png"))); // NOI18N
        btnDepositar.setText("Depositar");
        btnDepositar.setBorderPainted(false);
        btnDepositar.setContentAreaFilled(false);
        btnDepositar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDepositar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deposito1.png"))); // NOI18N
        btnDepositar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deposito2.png"))); // NOI18N
        btnDepositar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnRetiro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRetiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/retiro_cafe.png"))); // NOI18N
        btnRetiro.setText("Retiro");
        btnRetiro.setBorderPainted(false);
        btnRetiro.setContentAreaFilled(false);
        btnRetiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetiro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/retiro_cafe.png"))); // NOI18N
        btnRetiro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/retiro_verde.png"))); // NOI18N
        btnRetiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        lbFecha.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(51, 51, 255));
        lbFecha.setText("DD/MM/YY");

        lbhora.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbhora.setForeground(new java.awt.Color(51, 51, 255));
        lbhora.setText("00:00");

        btnCapturar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCapturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grabg.png"))); // NOI18N
        btnCapturar.setText("Capturar Datos");
        btnCapturar.setBorderPainted(false);
        btnCapturar.setContentAreaFilled(false);
        btnCapturar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapturar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grabg.png"))); // NOI18N
        btnCapturar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grabp.png"))); // NOI18N
        btnCapturar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarActionPerformed(evt);
            }
        });

        btn_Transaccion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_Transaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Trans.png"))); // NOI18N
        btn_Transaccion.setText("Transaccionar");
        btn_Transaccion.setBorderPainted(false);
        btn_Transaccion.setContentAreaFilled(false);
        btn_Transaccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Transaccion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Trancs.png"))); // NOI18N
        btn_Transaccion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Trancs.png"))); // NOI18N
        btn_Transaccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Transaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TransaccionActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setText("Tipo de Transaccion");

        combo_Trans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta", "Deposito", "Retiro", "Transferencia" }));
        combo_Trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_TransActionPerformed(evt);
            }
        });

        lb_Establecimiento.setBackground(new java.awt.Color(0, 102, 102));
        lb_Establecimiento.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lb_Establecimiento.setForeground(new java.awt.Color(0, 153, 0));
        lb_Establecimiento.setText("BANCO-REPTILIANO");

        lb_Numero.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        lb_Numero.setForeground(new java.awt.Color(255, 0, 0));
        lb_Numero.setText("0");

        jLabel5.setForeground(new java.awt.Color(0, 204, 102));
        jLabel5.setText("EL DINERO ES DINERO");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("No.");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Estado de las Transacciones:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_mensaje)
                            .addComponent(txtSaldo)
                            .addComponent(txtDeposito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(lbhora, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lb_Establecimiento))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(txt_Trama, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnCapturar))
                                .addGap(30, 30, 30)
                                .addComponent(combo_Trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(lb_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btn_Transaccion)
                        .addGap(18, 18, 18)
                        .addComponent(btn_enviar)
                        .addGap(32, 32, 32)
                        .addComponent(btnDepositar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetiro)
                        .addGap(51, 51, 51)
                        .addComponent(btnArray)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_Establecimiento)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(lbFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbhora)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(combo_Trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txt_Trama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCapturar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Transaccion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_enviar)
                        .addComponent(btnDepositar)
                        .addComponent(btnRetiro)
                        .addComponent(btnArray)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//boton que realiza la funcion de consultar saldo
    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        try {
            transaccion();
            Socket socket = new Socket("127.0.0.1", 5050);
            DataOutputStream enviar_datos = new DataOutputStream(socket.getOutputStream());
            enviar_datos.writeUTF("select * from Clientes where cuenta =" + txt_mensaje.getText());
            DataInputStream recibir_datos = new DataInputStream(socket.getInputStream());

            String mensaje = recibir_datos.readUTF();

            // campo.append("\n" + mensaje);
            String string = mensaje.replace("[", "").replace("]", "");
            String[] partes = string.split(",");
            System.out.println(partes[2].replace(" ", ""));
            txtSaldo.setText(partes[2].replace(" ", ""));

        } catch (IOException e) {
            txtSaldo.setText("Cuenta invalida");
            System.out.println(e);

        }

    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btnArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArrayActionPerformed

        try {
            Socket socket = new Socket("10.0.0.10", 5050);
            DataOutputStream enviar_datos = new DataOutputStream(socket.getOutputStream());
            //   String txt_mensage = null;
            // enviar_datos.writeUTF("select * from Clientes where cuenta = " + txt_mensaje.getText());
            enviar_datos.writeUTF("select * from Clientes ");
            DataInputStream recibir_datos = new DataInputStream(socket.getInputStream());

            String mensaje = recibir_datos.readUTF();
            System.out.println(mensaje);
            //txtArray.append(mensaje.replace("[", "").replace("]", "\n"));

            String Cadena = mensaje.replace("[", "").replace("]", "\n");
            // System.out.println("Esta es la cadena: " + Cadena);
            String separador = ", ";

            String[] arreglo = Cadena.split(separador);
            DefaultTableModel model = new DefaultTableModel();
            List<String> al = new ArrayList<>();
            al = Arrays.asList(arreglo);
            for (String s : al) {
                System.out.println(s);
            }

            model.addColumn("Cuenta");
            model.addColumn("Nombre del Cliente");
            model.addColumn("Saldo Actual");
            model.addRow(new Object[]{arreglo[0], arreglo[1], arreglo[2]});

            tblTrans.setModel(model);

        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnArrayActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        try {
            transaccion();
            Socket socket = new Socket("127.0.0.1", 5050);
            DataOutputStream enviar_datos = new DataOutputStream(socket.getOutputStream());
            enviar_datos.writeUTF("update Clientes set Saldo = Saldo + " + txtDeposito.getText() + " where Cuenta = " + txt_mensaje.getText());
            DataInputStream recibir_datos = new DataInputStream(socket.getInputStream());
            String mensaje = recibir_datos.readUTF();

            // campo.append("\n" + mensaje);
            // txtSaldo.setText(mensaje);
            consultarSaldo();

        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        try {
            transaccion();
            Socket socket = new Socket("127.0.0.1", 5050);
            DataOutputStream enviar_datos = new DataOutputStream(socket.getOutputStream());
            enviar_datos.writeUTF("update Clientes set Saldo = Saldo - " + txtDeposito.getText() + " where Cuenta = " + txt_mensaje.getText());
            DataInputStream recibir_datos = new DataInputStream(socket.getInputStream());
            String mensaje = recibir_datos.readUTF();

            // campo.append("\n" + mensaje);
            txtSaldo.setText(mensaje);
            consultarSaldo();

        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        String establecimiento = "0000012345";
        numerodeTransaccion();
        String tipoTran = combo_Trans.getSelectedItem().toString();
        String TipoTranN = tipoTran.replace("Consulta", "00").replace("Deposito", "01").replace("Retiro", "02").replace("Transferencia", "03");
        String numero = lb_Numero.getText();
        String txtformateado = String.format("%5s", numero).replace(" ", "0");

        String deposito = txtDeposito.getText();
        String depositoformateado = String.format("%10s", deposito).replace(" ", "0");
        System.out.println(depositoformateado);

        txt_Trama.setText(TipoTranN + establecimiento + lbFecha.getText().replace("/", "") + lbhora.getText().replace(":", "") + txt_mensaje.getText() + depositoformateado + txtformateado);

    }//GEN-LAST:event_btnCapturarActionPerformed

    private void combo_TransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_TransActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_combo_TransActionPerformed

    private void btn_TransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransaccionActionPerformed
        transaccion();
    }//GEN-LAST:event_btn_TransaccionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Cliente().setVisible(true);
        });
    }

    public void transaccion() {
        try {
            Socket socket = new Socket("127.0.0.1", 5050);
            String establecimiento = "0000012345";
            numerodeTransaccion();
            String tipoTran = combo_Trans.getSelectedItem().toString();
            String TipoTranN = tipoTran.replace("Consulta", "00").replace("Deposito", "01").replace("Retiro", "02").replace("Transferencia", "03");
            String numero = lb_Numero.getText();
            String txtformateado = String.format("%5s", numero).replace(" ", "0");
            String deposito = txtDeposito.getText();
            String depositoformateado = String.format("%11s", deposito).replace(" ", "0");
            //System.out.println(depositoformateado);
            DataOutputStream enviar_datos = new DataOutputStream(socket.getOutputStream());
            enviar_datos.writeUTF("EXEC dbo.sp_cargatrama '" + TipoTranN + establecimiento + lbFecha.getText().replace("/", "") + lbhora.getText().replace(":", "") + txt_mensaje.getText() + depositoformateado.replace(".", "") + txtformateado + "'");
            DataInputStream recibir_datos = new DataInputStream(socket.getInputStream());
            String mensaje = recibir_datos.readUTF();
            DefaultTableModel modelo = new DefaultTableModel();

            String tipo_tran = mensaje.substring(1, 3);
            String estble = mensaje.substring(4, 13);
            String fecha_trx = mensaje.substring(13, 19);
            String hora_h = mensaje.substring(19, 21);
            String hora_min = mensaje.substring(21, 23);
            String hora_seg = mensaje.substring(23, 25);
            String cta = mensaje.substring(26, 35);
            String monto = mensaje.substring(37, 45);
            String num_trx = mensaje.substring(46, 50);
            String estado = mensaje.substring(50, 52).replace("00", "Valida").replace("01", "Invalida");
            ArrayList<Object> nombrecolumna = new ArrayList<Object>();
            nombrecolumna.add("Tipo de Transaccion");
            nombrecolumna.add("Establecimiento");
            nombrecolumna.add("Fecha");
            nombrecolumna.add("Hora");
            nombrecolumna.add("Cuenta");
            nombrecolumna.add("Monto");
            nombrecolumna.add("Numero Tran");
            nombrecolumna.add("Estado");
            for (Object columna : nombrecolumna) {
                modelo.addColumn(columna);

            }
            this.tblTrans.setModel(modelo);
            ArrayList<Object[]> datos = new ArrayList<Object[]>();
            Object[] informacion1 = new Object[]{tipo_tran, estble, fecha_trx, hora_h + ":" + hora_min +                ":" + hora_seg, cta, monto, num_trx, estado};
            datos.add(informacion1);
            for(Object []DatoPersonal: datos){
            modelo.addRow(DatoPersonal);
            }
            tblTrans.setModel(modelo);
            
        } catch (IOException e) {
            System.out.println(e);

        }

    }

    public void numerodeTransaccion() {
        String valor1 = lb_Numero.getText();
        String valor2 = "1";
        int num_a = Integer.parseInt(valor1);
        int num_b = Integer.parseInt(valor2);
        int suma = num_a + num_b;
        String label = suma + "";
        lb_Numero.setText(label);
    }

    public void consultarSaldo() {
        try {
            Socket socket = new Socket("10.0.0.10", 5050);
            DataOutputStream enviar_datos = new DataOutputStream(socket.getOutputStream());
            enviar_datos.writeUTF("select * from Clientes where cuenta = " + txt_mensaje.getText());
            DataInputStream recibir_datos = new DataInputStream(socket.getInputStream());
            String mensaje = recibir_datos.readUTF();

            // campo.append("\n" + mensaje);
            txtSaldo.setText(mensaje);

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static String fecha() {

        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YY");

        return formatofecha.format(fecha);

    }

    /**
     *
     */
    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArray;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btn_Transaccion;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JComboBox<String> combo_Trans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lb_Establecimiento;
    private javax.swing.JLabel lb_Numero;
    private javax.swing.JLabel lbhora;
    private javax.swing.JTable tblTrans;
    private javax.swing.JTextArea txtArray;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txt_Trama;
    private javax.swing.JTextField txt_mensaje;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {

            hora();
            lbhora.setText(hora + ":" + minutos + ":" + segundos);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
