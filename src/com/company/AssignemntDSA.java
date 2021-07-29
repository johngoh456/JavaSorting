package com.company;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class AssignemntDSA extends javax.swing.JFrame {

    Node root;
    String output="";
    int size=0;
    public AssignemntDSA() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultArea = new javax.swing.JTextArea();
        Insert = new javax.swing.JButton();
        NoV = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DV = new javax.swing.JTextField();
        Max_Value = new javax.swing.JButton();
        In_Order = new javax.swing.JButton();
        Pre_Order = new javax.swing.JButton();
        Post_Order = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Show:");

        ResultArea.setColumns(20);
        ResultArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        ResultArea.setRows(5);
        jScrollPane1.setViewportView(ResultArea);

        Insert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        NoV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoVActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Number of Variable:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Delete Value:");

        DV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Max_Value.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Max_Value.setText("Max Value");
        Max_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Max_ValueActionPerformed(evt);
            }
        });

        In_Order.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        In_Order.setText("In Order");
        In_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_OrderActionPerformed(evt);
            }
        });

        Pre_Order.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pre_Order.setText("Pre Order");
        Pre_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pre_OrderActionPerformed(evt);
            }
        });

        Post_Order.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Post_Order.setText("Post Order");
        Post_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Post_OrderActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Max_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel5)
                                                                .addComponent(Pre_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(33, 33, 33)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(In_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Post_Order))
                                                        .addGap(52, 52, 52))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(89, 89, 89)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel1)
                                                                .addComponent(NoV, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(95, 95, 95)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(Delete))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(DV, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(Insert)
                                                .addGap(28, 28, 28)
                                                .addComponent(Reset)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(NoV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Insert)
                                                        .addComponent(Reset))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Max_Value)
                                                        .addComponent(In_Order))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Pre_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Post_Order))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Delete)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        int input;

        try{
            input = Integer.parseInt(NoV.getText());

            insertvalue(input);
            ResultArea.setText("The value are: " + output);
            NoV.setText("");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "Invalid input.", "Dialog",JOptionPane.ERROR_MESSAGE);
            NoV.setText("");
        }
    }//GEN-LAST:event_InsertActionPerformed

    private void NoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoVActionPerformed

    }//GEN-LAST:event_NoVActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
            remove(Integer.parseInt(DV.getText()));
            String check = "\n" + DV.getText();
            output = output.replace(check,"");
            ResultArea.setText("The value are: " + output);
            DV.setText("");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "Invalid input.", "Dialog",JOptionPane.ERROR_MESSAGE);
            DV.setText("");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void Max_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Max_ValueActionPerformed
        ResultArea.setText("");
        ResultArea.append("Maximum value is: \n"+MaxValue(root));
    }//GEN-LAST:event_Max_ValueActionPerformed

    private void In_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_OrderActionPerformed
        ResultArea.setText("");
        ResultArea.append("In order value are: \n");
        inorder(root);
    }//GEN-LAST:event_In_OrderActionPerformed

    private void Pre_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pre_OrderActionPerformed
        ResultArea.setText("");
        ResultArea.append("Pre order value are: \n");
        preorder(root);
    }//GEN-LAST:event_Pre_OrderActionPerformed

    private void Post_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Post_OrderActionPerformed
        ResultArea.setText("");
        ResultArea.append("Post order value are: \n");
        postorder(root);
    }//GEN-LAST:event_Post_OrderActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        root=null;
        ResultArea.setText("");
        output ="";
    }//GEN-LAST:event_ResetActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignemntDSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AssignemntDSA().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DV;
    private javax.swing.JButton Delete;
    private javax.swing.JButton In_Order;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Max_Value;
    private javax.swing.JTextField NoV;
    private javax.swing.JButton Post_Order;
    private javax.swing.JButton Pre_Order;
    private javax.swing.JButton Reset;
    private javax.swing.JTextArea ResultArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    int MaxValue(Node focusNode) {

        if (focusNode == null)
            return Integer.MIN_VALUE;

        int Max = focusNode.value;
        int lMax = MaxValue(focusNode.leftchild);
        int rMax = MaxValue(focusNode.rightchild);

        if (lMax > Max)
            Max = lMax;
        if (rMax > Max)
            Max = rMax;
        return Max;

    }

    void insertvalue(int value){
        Node newnode= new Node(value);

        if(root==null){
            root=newnode;

        }else{
            Node tempnode=root;//temporary to focus value.
            Node parent;
            while(true){//recursive approach. to add value into leftchild and right child.
                parent =tempnode;
                if(value<tempnode.value){//tempnode.value is act like a reference,
                    // Switch focus to the left child
                    tempnode=tempnode.leftchild;
                    if(tempnode==null){
                        parent.leftchild=newnode;
                        output += "\n" + value ;
                        return;
                    }
                }else if(value>tempnode.value){
                    tempnode=tempnode.rightchild;
                    if(tempnode==null){
                        parent.rightchild=newnode;
                        output += "\n" + value ;
                        return;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(), "Value duplicated.", "Dialog",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        output += "\n" + value ;
    }


    void inorder(Node focusNode) {

        if (focusNode != null) {

            // Traverse the left node

            inorder(focusNode.leftchild);

            // Visit the currently focused on node

            ResultArea.append(Integer.toString(focusNode.value)+"\n");
            // Traverse the right node

            inorder(focusNode.rightchild);

        }

    }


    @Override
    public void remove(int value){
        // First part is to switch the focus to the delete value target.
        // four condition , left child empty, right child empty,bothchild empty,both child has value.
        //reset all the value to root, start searching from the root,then proceed to delete the nodes.
        Node tempnode=root;
        Node parent=root;
        boolean isitaleftchild=true;
        while(tempnode.value!=value){//switch the focus to the target.
            parent=tempnode;
            if(value<tempnode.value){//if the value we want to delete is smaller <focus value, means the delete target is  at the leftchild, switch focus to left child.
                isitaleftchild=true;
                tempnode=tempnode.leftchild;
            }else{
                isitaleftchild=false;//if larger value means its at the rightchild , switch focus to right child.
                tempnode=tempnode.rightchild;
            }
            if(tempnode==null)

                return;
        }
        if(tempnode.leftchild==null&&tempnode.rightchild==null){//condition one , if the delete target have no children.
            if(tempnode==root){
                root=null;
            }
            else if(isitaleftchild){
                parent.leftchild=null;
            }
            else
                parent.rightchild=null;
        }
        else if(tempnode.rightchild==null){// condition two,if the delete target , rightchild is null
            if(tempnode==root)
                root=tempnode.leftchild;
            else if(isitaleftchild)
                parent.leftchild=tempnode.leftchild;
            else
                parent.rightchild=tempnode.leftchild;
        }
        else if(tempnode.leftchild==null){//condition three, if the delete target, leftchild is null
            if(tempnode==root)
                root=tempnode.rightchild;
            else if(isitaleftchild)
                parent.leftchild=tempnode.rightchild;
            else parent.rightchild=tempnode.rightchild;
        }
        else{
            Node replacement=getreplacementnode(tempnode);//condition four, if the delete target has both left and right children.
            if(tempnode==root){
                root=replacement;
            }else if(isitaleftchild)
                parent.leftchild=replacement;
            else
                parent.rightchild=replacement;
            replacement.leftchild=tempnode.leftchild;
        }

    }
    Node getreplacementnode(Node replacednode){//method to replace deleted value.
        Node replacementparent=replacednode;//50
        Node replacement=replacednode;//50
        Node tempnode=replacednode.rightchild;//75
        while(tempnode!=null){
            replacementparent=replacement;//25//75//50
            replacement=tempnode;//30//85//75
            tempnode=tempnode.leftchild;//15//null//null
        }
        if(replacement!=replacednode.rightchild){
            replacementparent.leftchild=replacement.rightchild;
            replacement.rightchild=replacednode.rightchild;
        }
        return replacement;
    }


    void preorder(Node focusNode) {

        if (focusNode != null) {

            ResultArea.append(Integer.toString(focusNode.value)+"\n");

            preorder(focusNode.leftchild);
            preorder(focusNode.rightchild);

        }

    }

    void postorder(Node focusNode) {

        if (focusNode != null) {

            postorder(focusNode.leftchild);
            postorder(focusNode.rightchild);

            ResultArea.append(Integer.toString(focusNode.value)+"\n");

        }

    }


    class Node{
        int value;

        Node leftchild;
        Node rightchild;

        Node( int value){

            this.value=value;
        }
    }
}