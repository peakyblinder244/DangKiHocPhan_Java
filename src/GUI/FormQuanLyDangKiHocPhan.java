/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import model.Hocki;
import model.Thoigiandkhp;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.sql.Date;

import static GUI.DangNhap.giaoVuService;

/**
 *
 * @author lhqua
 */
public class FormQuanLyDangKiHocPhan extends javax.swing.JPanel {
    private Thoigiandkhp thoigiandkhpChon = null;

    private Hocki hocki = null;
    /**
     * Creates new form FormQuanLyDangKiHocPhan
     */
    public FormQuanLyDangKiHocPhan(Hocki hockiHienTai) {
        hocki = hockiHienTai;
        initComponents();
        capNhatDanhSachDangKiHocPhan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tieuDeDangKiHocPhan = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        danhSachDangKiHocPhan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        themDangKiHocPhan = new javax.swing.JButton();
        suaDangKiHocPhan = new javax.swing.JButton();
        lamMoiDanhSach = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        tenDangKiHocPhan = new javax.swing.JLabel();
        layTenDangKiHocPhan = new javax.swing.JTextField();
        tenNamHoc = new javax.swing.JLabel();
        layNgayBatDau = new javax.swing.JTextField();
        ngayBatDau = new javax.swing.JLabel();
        layNamHoc = new javax.swing.JTextField();
        ngayKetThuc = new javax.swing.JLabel();
        layNgayKetThuc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        tieuDeDangKiHocPhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tieuDeDangKiHocPhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tieuDeDangKiHocPhan.setText("Quản Lý Đăng Kí Học Phần");
        tieuDeDangKiHocPhan.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(321, 321, 321)
                                .addComponent(tieuDeDangKiHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tieuDeDangKiHocPhan, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addContainerGap())
        );

        danhSachDangKiHocPhan.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Tên Học Kì Đăng Kí", "Ngày Bắt Đầu", "Ngày Kết Thúc"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        danhSachDangKiHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                danhSachDangKiHocPhanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(danhSachDangKiHocPhan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );

        themDangKiHocPhan.setText("Thêm");
        themDangKiHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themDangKiHocPhanActionPerformed(evt);
            }
        });

        suaDangKiHocPhan.setText("Sửa");
        suaDangKiHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaDangKiHocPhanActionPerformed(evt);
            }
        });

        lamMoiDanhSach.setText("Làm Mới");
        lamMoiDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamMoiDanhSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(themDangKiHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lamMoiDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(suaDangKiHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(themDangKiHocPhan)
                                        .addComponent(lamMoiDanhSach))
                                .addGap(18, 18, 18)
                                .addComponent(suaDangKiHocPhan)
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        tenDangKiHocPhan.setText("Tên Kì Đăng Kí Học Phần");

        tenNamHoc.setText("Năm Học");

        ngayBatDau.setText("Ngày Bắt Đầu");

        ngayKetThuc.setText("Ngày Kết Thúc");

        jLabel1.setText("YYYY-MM-DD");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tenDangKiHocPhan)
                                        .addComponent(tenNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(layTenDangKiHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(layNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(ngayKetThuc)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jLabel1))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(layNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(ngayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(layNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tenDangKiHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(layTenDangKiHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ngayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(layNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tenNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(layNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ngayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(layNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void themDangKiHocPhanActionPerformed(java.awt.event.ActionEvent evt) {
        String strNull = "";
        String tenDangKiHocPhan = layTenDangKiHocPhan.getText();
        String strNamHoc = layNamHoc.getText();
        String ngayBatDau = layNgayBatDau.getText();
        String ngayKetThuc = layNgayKetThuc.getText();
        int namHoc = 0;
        try {
            namHoc = Integer.parseInt(strNamHoc);
        }catch (Exception e){
            System.err.println(e);
            namHoc = 0;
        }
        if(ngayBatDau.equals(strNull) || ngayKetThuc.equals(strNull)) {
            JOptionPane.showMessageDialog(null, "Không Được Để Trống Các Ô Dữ Liệu!!");
            this.ResetForm();
            return;
        }
        if(ngayBatDau.charAt(4) != '-'|| ngayKetThuc.charAt(7) != '-' ){
            JOptionPane.showMessageDialog(null, "Ngày nhập sai !!");
            this.ResetForm();
            return;
        }
        Date dateBatDau = Date.valueOf(ngayBatDau);
        Date dateKetThuc = Date.valueOf(ngayKetThuc);
        Hocki hockiTmp = giaoVuService.layThongTinHocKiHienTai(hocki.getTenHocKi(),hocki.getNamHoc());
        Thoigiandkhp thoigiandkhpMoi = null;
        if(hockiTmp != null) {
            thoigiandkhpMoi = new Thoigiandkhp(dateBatDau, dateKetThuc,hockiTmp );
        }
        else{
            JOptionPane.showMessageDialog(null, "Không Tồn Tại Học Kì Cần Thêm, Cần Tạo Học Kì Trước Để Set");
            this.ResetForm();
            return;
        }
        if(giaoVuService.themThoiGianDKHP(thoigiandkhpMoi)){
            JOptionPane.showMessageDialog(this, "Thêm Thành Công ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            capNhatDanhSachDangKiHocPhan();
        }
        else{
            JOptionPane.showMessageDialog(null, "Lỗi Không Thêm Được!! Dữ Liệu Có Thể Đã Tồn Tại!!");
            this.ResetForm();
        }
    }

    private void suaDangKiHocPhanActionPerformed(java.awt.event.ActionEvent evt) {
        String strNull = "";
        String tenDangKiHocPhan = layTenDangKiHocPhan.getText();
        String strNamHoc = layNamHoc.getText();
        String ngayBatDau = layNgayBatDau.getText();
        String ngayKetThuc = layNgayKetThuc.getText();
        int namHoc = 0;
        try {
            namHoc = Integer.parseInt(strNamHoc);
        }catch (Exception e){
            System.err.println(e);
            namHoc = 0;
        }
        if(ngayBatDau.equals(strNull) || ngayKetThuc.equals(strNull)) {
            JOptionPane.showMessageDialog(null, "Không Được Để Trống Các Ô Dữ Liệu!!");
            this.ResetForm();
            return;
        }
        if(ngayBatDau.charAt(4) != '-'|| ngayKetThuc.charAt(7) != '-' ){
            JOptionPane.showMessageDialog(null, "Ngày nhập sai !! Mời Nhập Lại!!");
            this.ResetForm();
            return;
        }
        Date dateBatDau = Date.valueOf(ngayBatDau);
        Date dateKetThuc = Date.valueOf(ngayKetThuc);
        thoigiandkhpChon.setNgayBatDau(dateBatDau);
        thoigiandkhpChon.setNgayKetThuc(dateKetThuc);

        if(giaoVuService.capNhatThoiGianDKHP(thoigiandkhpChon)){
            JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            capNhatDanhSachDangKiHocPhan();
        }
        else{
            JOptionPane.showMessageDialog(null, "Lỗi Không Cập Nhật Được!! Mời Kiểm Tra Lại!!");
            this.ResetForm();
        }
    }

    private void lamMoiDanhSachActionPerformed(java.awt.event.ActionEvent evt) {
        capNhatDanhSachDangKiHocPhan();
        ResetForm();
    }

    private void danhSachDangKiHocPhanMouseClicked(java.awt.event.MouseEvent evt) {
        int dong = danhSachDangKiHocPhan.getSelectedRow();
        int[] cot = danhSachDangKiHocPhan.getSelectedColumns();
        String tenHocKi = String.valueOf(danhSachDangKiHocPhan.getValueAt(dong, 0));
        String ngayBatDau = String.valueOf(danhSachDangKiHocPhan.getValueAt(dong, 1));
        String ngayKetThuc = String.valueOf(danhSachDangKiHocPhan.getValueAt(dong, 2));


        thoigiandkhpChon = giaoVuService.layThongtinThoiGianDKHPHienTai(tenHocKi, hocki.getNamHoc());

        System.out.println(thoigiandkhpChon.toString());
        if (thoigiandkhpChon != null) {
            layTenDangKiHocPhan.setText(thoigiandkhpChon.getHocki().getTenHocKi());
            layNamHoc.setText(thoigiandkhpChon.getHocki().getNamHoc().toString());
            layNgayBatDau.setText(thoigiandkhpChon.getNgayBatDau().toString());
            layNgayKetThuc.setText(thoigiandkhpChon.getNgayKetThuc().toString());
        }
    }


    private void capNhatDanhSachDangKiHocPhan() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        danhSachDangKiHocPhan.setModel(defaultTableModel);
        defaultTableModel.addColumn("Tên Học Kì Đăng Kí");
        defaultTableModel.addColumn("Ngày Bắt Đầu");
        defaultTableModel.addColumn("Ngày Kết Thúc");
        if (hocki != null) {
            Thoigiandkhp thoigiandkhp = giaoVuService.layThongtinThoiGianDKHPHienTai(hocki.getTenHocKi(), hocki.getNamHoc());
            if (thoigiandkhp != null) {
                themDangKiHocPhan.setEnabled(false);
            }
            try {
                Object[] tmp = new Object[]{thoigiandkhp.getHocki().getTenHocKi(), thoigiandkhp.getNgayBatDau().toString(), thoigiandkhp.getNgayKetThuc().toString()};
                defaultTableModel.addRow(tmp);
            } catch (Exception e) {

            }
        }
    }

    public void ResetForm() {
        layTenDangKiHocPhan.setText(hocki.getTenHocKi());
        layNamHoc.setText(hocki.getNamHoc().toString());
        layNgayBatDau.setText("");
        layNgayKetThuc.setText("");
        thoigiandkhpChon = null;
    }
    // Variables declaration - do not modify
    private javax.swing.JTable danhSachDangKiHocPhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lamMoiDanhSach;
    private javax.swing.JTextField layNamHoc;
    private javax.swing.JTextField layNgayBatDau;
    private javax.swing.JTextField layNgayKetThuc;
    private javax.swing.JTextField layTenDangKiHocPhan;
    private javax.swing.JLabel ngayBatDau;
    private javax.swing.JLabel ngayKetThuc;
    private javax.swing.JButton suaDangKiHocPhan;
    private javax.swing.JLabel tenDangKiHocPhan;
    private javax.swing.JLabel tenNamHoc;
    private javax.swing.JButton themDangKiHocPhan;
    private javax.swing.JLabel tieuDeDangKiHocPhan;
    // End of variables declaration
}
