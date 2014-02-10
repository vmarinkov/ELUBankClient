
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elena Koevska
 */
public class CurrencyPanel extends javax.swing.JPanel implements PropertyChangeListener {

    /**
     * A map with currency data. The keys are currency codes.
     */
    private HashMap<String, Currency> currencies = new HashMap();

    /**
     * Which currencies to display.
     */
    private String[] displayed = {"EUR", "USD", "GBP"};

    /**
     * Bid rate will be multiplied by this coefficient to get the ask rate.
     */
    private float askRateCoefficient = 1.05f;

    /**
     * Creates new form CurrencyPanel
     */
    public CurrencyPanel() {
        initComponents();
    }

    /**
     * Transforms currencies array to a HasMap for easier internal access.
     *
     * @param currencies array containing all currency data
     */
    public void setCurrencies(Currency[] currencies) {
        if (currencies != null && currencies.length > 0) {
            for (Currency currency : currencies) {
                this.currencies.put(currency.getCode(), currency);
            }
        }
    }

    /**
     * Sets which currencies should be displayed.
     *
     * @param codes array with currency codes e.g. "USD", "EUR"
     */
    public void setDisplayed(String[] codes) {
        this.displayed = codes;
    }

    /**
     * Sets the value of the ask rate coefficient
     *
     * @param newCoefficient new coefficient value
     */
    public void setAskRateCoefficient(float newCoefficient) {
        if (newCoefficient > 0) {
            askRateCoefficient = newCoefficient;
        }
    }

    /**
     * Used to update component's UI state when the main frame fires a property
     * change event.
     *
     * @param pce the change event's instance
     */
    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        if (pce.getPropertyName().equals("currencyData")) {
            // Set currencies list.
            setCurrencies(((Currency) pce.getNewValue()).getAllCurrencies());

            // Get currencies table model.
            DefaultTableModel model = (DefaultTableModel) currencyTable.getModel();

            // If we are not setting currencies for the first time first delete all.
            if (model.getRowCount() > 0) {
                model.getDataVector().removeAllElements();
            }

            // Populate table model.
            Currency current;
            int i = 0;
            for (String currencyCode : displayed) {
                current = this.currencies.get(currencyCode);

                // Add row.
                model.addRow(new Object[]{
                    current.getCode(),
                    current.getRate(),
                    (Float.parseFloat(current.getRate()) * askRateCoefficient)
                });
            }
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

        currencyPane = new javax.swing.JScrollPane();
        currencyTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(180, 76));
        setMinimumSize(new java.awt.Dimension(180, 76));

        currencyPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        currencyPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        currencyPane.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        currencyPane.setHorizontalScrollBar(null);
        currencyPane.setMaximumSize(new java.awt.Dimension(180, 76));
        currencyPane.setMinimumSize(new java.awt.Dimension(180, 76));
        currencyPane.setPreferredSize(new java.awt.Dimension(180, 76));

        currencyTable.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        currencyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Валута", "Купува", "Продава"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        currencyTable.setMaximumSize(new java.awt.Dimension(174, 70));
        currencyTable.setMinimumSize(new java.awt.Dimension(174, 70));
        currencyTable.setPreferredSize(new java.awt.Dimension(174, 70));
        currencyTable.getTableHeader().setResizingAllowed(false);
        currencyTable.getTableHeader().setReorderingAllowed(false);
        currencyTable.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 10));
        currencyPane.setViewportView(currencyTable);
        if (currencyTable.getColumnModel().getColumnCount() > 0) {
            currencyTable.getColumnModel().getColumn(0).setResizable(false);
            currencyTable.getColumnModel().getColumn(1).setResizable(false);
            currencyTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(currencyPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(currencyPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane currencyPane;
    private javax.swing.JTable currencyTable;
    // End of variables declaration//GEN-END:variables
}
