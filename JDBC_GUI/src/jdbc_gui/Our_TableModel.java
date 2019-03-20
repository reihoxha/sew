/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reihox14
 */
public class Our_TableModel extends DefaultTableModel{
    int columnDisabled;
    public Our_TableModel(int columnDisabled){
        super();
        this.columnDisabled=columnDisabled;
    }
    @Override
    public boolean isCellEditable(int row,int column){
        if(column==columnDisabled){
            return false;
        }else{
        return true;
        }
    }
}
