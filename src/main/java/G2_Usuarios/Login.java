/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package G2_Usuarios;

import condominio.Conexion;
import condominio.Principal;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JoisH
 */
public class Login extends javax.swing.JFrame {

    ValidarLogin validar;

    private int intentosFallidos = 0;
    Conexion connection = new Conexion();

    /**
     * Creates new form Login1
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);

        setResizable(false);//no miximizar

        setResizable(false);//no miximizar
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

    }

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
        jLabel3 = new javax.swing.JLabel();
        jTFContraseñaUsuario = new javax.swing.JPasswordField();
        jTFUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLBIniciarSesion1 = new javax.swing.JLabel();
        jLBResetearContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAutoscrolls(true);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setName(""); // NOI18N
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Iniciar sesión");
        jLabel1.setAutoscrolls(true);
        jLabel1.setDoubleBuffered(true);
        jLabel1.setFocusCycleRoot(true);
        jLabel1.setFocusTraversalPolicyProvider(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Usuario");
        jLabel2.setAutoscrolls(true);
        jLabel2.setDoubleBuffered(true);
        jLabel2.setFocusCycleRoot(true);
        jLabel2.setFocusTraversalPolicyProvider(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña");
        jLabel3.setAutoscrolls(true);
        jLabel3.setDoubleBuffered(true);
        jLabel3.setFocusCycleRoot(true);
        jLabel3.setFocusTraversalPolicyProvider(true);

        jTFContraseñaUsuario.setBorder(null);
        jTFContraseñaUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jTFContraseñaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFContraseñaUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTFContraseñaUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTFContraseñaUsuarioMouseExited(evt);
            }
        });
        jTFContraseñaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFContraseñaUsuarioActionPerformed(evt);
            }
        });
        jTFContraseñaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFContraseñaUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFContraseñaUsuarioKeyTyped(evt);
            }
        });

        jTFUsuario.setBorder(null);
        jTFUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jTFUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTFUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTFUsuarioMouseExited(evt);
            }
        });
        jTFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioActionPerformed(evt);
            }
        });
        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFUsuarioKeyTyped(evt);
            }
        });

        jSeparator1.setAutoscrolls(true);
        jSeparator1.setDoubleBuffered(true);
        jSeparator1.setFocusCycleRoot(true);
        jSeparator1.setFocusTraversalPolicyProvider(true);
        jSeparator1.setFocusable(true);
        jSeparator1.setInheritsPopupMenu(true);

        jLBIniciarSesion1.setBackground(new java.awt.Color(255, 255, 255));
        jLBIniciarSesion1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLBIniciarSesion1.setText("                     Iniciar sesión");
        jLBIniciarSesion1.setAutoscrolls(true);
        jLBIniciarSesion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLBIniciarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLBIniciarSesion1.setDoubleBuffered(true);
        jLBIniciarSesion1.setFocusCycleRoot(true);
        jLBIniciarSesion1.setFocusTraversalPolicyProvider(true);
        jLBIniciarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBIniciarSesion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBIniciarSesion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBIniciarSesion1MouseExited(evt);
            }
        });

        jLBResetearContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jLBResetearContraseña.setText("¿Olvidó su contraseña?");
        jLBResetearContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBResetearContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBResetearContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBResetearContraseñaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLBIniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLBResetearContraseña)
                        .addGap(131, 131, 131))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(194, 194, 194)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFContraseñaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLBIniciarSesion1)
                .addGap(30, 30, 30)
                .addComponent(jLBResetearContraseña)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLBResetearContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBResetearContraseñaMouseExited

        // Configura la propiedad de opacidad del color de fondo
        jLBResetearContraseña.setOpaque(true);

        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLBResetearContraseñaMouseExited

    private void jLBResetearContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBResetearContraseñaMouseEntered

        // Configura la propiedad de opacidad del color de fondo
        jLBResetearContraseña.setOpaque(true);

        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLBResetearContraseñaMouseEntered

    private void jLBResetearContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBResetearContraseñaMouseClicked
        setVisible(false);
        ResetearContraseña frame = new ResetearContraseña();

        frame.setVisible(true);

    }//GEN-LAST:event_jLBResetearContraseñaMouseClicked

    private void jLBIniciarSesion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBIniciarSesion1MouseExited

        // Configura la propiedad de opacidad del color de fondo
        jLBIniciarSesion1.setOpaque(true);

        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jLBIniciarSesion1MouseExited

    private void jLBIniciarSesion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBIniciarSesion1MouseEntered

        // Configura la propiedad de opacidad del color de fondo
        jLBIniciarSesion1.setOpaque(true);

        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLBIniciarSesion1MouseEntered

    private void jLBIniciarSesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBIniciarSesion1MouseClicked
// Establece la conexión a la base de datos
        Connection connection = null;

        if (jTFUsuario.getText().equals("") || jTFContraseñaUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese usuario y contraseña");
        } else


try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/condominio", "root", "");

            // Obtén los valores del usuario y la contraseña ingresados
            String usuario = jTFUsuario.getText();
            String contraseña = jTFContraseñaUsuario.getText();

            // Consulta SQL para verificar las credenciales
            String selectQuery = "SELECT * FROM usuario WHERE usuario = ? AND contrasenia = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, contraseña);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Las credenciales son correctas, bienvenido al sistema
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema ");
                setVisible(false);
                // Modulos
                Principal frame = new Principal();
                frame.setVisible(true);
                //Se guardan las credenciales con las cuales se ingreso al sistema
                SessionManager.iniciarSesion(usuario, contraseña);
                System.out.println("Usuario inició sesión: " + SessionManager.getUsuario());
                System.out.println("Contraseña del usuario: " + SessionManager.getContrasenia());

            } else {
                // Las credenciales son incorrectas
                intentosFallidos++;

                if (intentosFallidos >= 3) {
                    jTFUsuario.setText("");
                    jTFContraseñaUsuario.setText("");
                    bloquearSistemaPorMinuto();
                    intentosFallidos = 0;
                    jTFUsuario.setEnabled(true);
                    jTFContraseñaUsuario.setEnabled(true);
                    jLBIniciarSesion1.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales equivocadas");
                    jTFUsuario.setText("");
                    jTFContraseñaUsuario.setText("");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_jLBIniciarSesion1MouseClicked

    private void jTFUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioKeyTyped
        jTFUsuario.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isDigit(c) && c != 'ñ' && c != 'Ñ' && c != '_' && c != '.') {
                    Toolkit.getDefaultToolkit().beep(); // Emite un sonido de alerta
                    e.consume();
                }
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_SPACE) {
                    Toolkit.getDefaultToolkit().beep(); // Emite un sonido de alerta
                    e.consume();
                }
            }
        });
    }//GEN-LAST:event_jTFUsuarioKeyTyped

    private void jTFUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioKeyReleased

    }//GEN-LAST:event_jTFUsuarioKeyReleased

    private void jTFUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioKeyPressed
        jTFUsuario.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isDigit(c) && c != 'ñ' && c != 'Ñ' && c != '_' && c != '.') {
                    Toolkit.getDefaultToolkit().beep(); // Emite un sonido de alerta
                    e.consume();
                }
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_SPACE) {
                    Toolkit.getDefaultToolkit().beep(); // Emite un sonido de alerta
                    e.consume();
                }
            }
        });
    }//GEN-LAST:event_jTFUsuarioKeyPressed

    private void jTFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsuarioActionPerformed


    }//GEN-LAST:event_jTFUsuarioActionPerformed

    private void jTFUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFUsuarioMouseExited
        setCursor(Cursor.getDefaultCursor());

    }//GEN-LAST:event_jTFUsuarioMouseExited

    private void jTFUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFUsuarioMouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    }//GEN-LAST:event_jTFUsuarioMouseEntered

    private void jTFUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsuarioMouseClicked

    private void jTFContraseñaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFContraseñaUsuarioKeyTyped
        jTFContraseñaUsuario.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isDigit(c) && c != '.' && c != '-' && c != '*' && c != '/' && c != '_' && c != 'ñ' && c != 'Ñ') {
                    Toolkit.getDefaultToolkit().beep(); // Emite un sonido de alerta
                    e.consume();

                }
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_SPACE) {
                    Toolkit.getDefaultToolkit().beep(); // Emite un sonido de alerta
                    e.consume();
                }
            }
        });
    }//GEN-LAST:event_jTFContraseñaUsuarioKeyTyped

    private void jTFContraseñaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFContraseñaUsuarioKeyPressed
        //parra regresar a la normalidad

        jTFContraseñaUsuario.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isDigit(c) && c != '.' && c != '-' && c != '*' && c != '/' && c != '_' && c != 'ñ' && c != 'Ñ') {
                    Toolkit.getDefaultToolkit().beep(); // Emite un sonido de alerta
                    e.consume();

                }
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_SPACE) {
                    Toolkit.getDefaultToolkit().beep(); // Emite un sonido de alerta
                    e.consume();
                }
            }
        });
    }//GEN-LAST:event_jTFContraseñaUsuarioKeyPressed

    private void jTFContraseñaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFContraseñaUsuarioActionPerformed
        //  validar.validatePassword(jPasswordField1);
    }//GEN-LAST:event_jTFContraseñaUsuarioActionPerformed

    private void jTFContraseñaUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaUsuarioMouseExited
        setCursor(Cursor.getDefaultCursor());

    }//GEN-LAST:event_jTFContraseñaUsuarioMouseExited

    private void jTFContraseñaUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaUsuarioMouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    }//GEN-LAST:event_jTFContraseñaUsuarioMouseEntered

    private void jTFContraseñaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaUsuarioMouseClicked


    }//GEN-LAST:event_jTFContraseñaUsuarioMouseClicked

    private void bloquearSistemaPorMinuto() {
        BloqueoVentana bloqueoVentana = new BloqueoVentana(this); // "this" es la instancia de tu JFrame principal
        bloqueoVentana.setVisible(true); // Muestra la ventana de bloqueo

        // Deshabilita los campos de entrada en la ventana principal
        jTFUsuario.setEnabled(false);
        jTFContraseñaUsuario.setEnabled(false);
        jLBIniciarSesion1.setEnabled(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLBIniciarSesion1;
    private javax.swing.JLabel jLBResetearContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jTFContraseñaUsuario;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
