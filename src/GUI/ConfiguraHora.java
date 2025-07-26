/**
 *
 * @author Greivin
 */
package GUI;

public class ConfiguraHora extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConfiguraHora.class.getName());

    public ConfiguraHora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabTitulo = new javax.swing.JLabel();
        LabHoras = new javax.swing.JLabel();
        LabMinutos = new javax.swing.JLabel();
        LabSegundos = new javax.swing.JLabel();
        SpinnerHoras = new javax.swing.JSpinner();
        SpinnerMinutos = new javax.swing.JSpinner();
        SpinnerSegundos = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        LabTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabTitulo.setText("Cambiar Hora");

        LabHoras.setText("Horas");

        LabMinutos.setText("Minutos");

        LabSegundos.setText("Segundos");

        SpinnerHoras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        SpinnerMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        SpinnerSegundos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SpinnerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(SpinnerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(SpinnerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addComponent(LabTitulo))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(LabHoras)
                            .addGap(66, 66, 66)
                            .addComponent(LabMinutos)
                            .addGap(73, 73, 73)
                            .addComponent(LabSegundos))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(LabTitulo)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabHoras)
                    .addComponent(LabMinutos)
                    .addComponent(LabSegundos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabHoras;
    private javax.swing.JLabel LabMinutos;
    private javax.swing.JLabel LabSegundos;
    private javax.swing.JLabel LabTitulo;
    private javax.swing.JSpinner SpinnerHoras;
    private javax.swing.JSpinner SpinnerMinutos;
    private javax.swing.JSpinner SpinnerSegundos;
    // End of variables declaration//GEN-END:variables
}
