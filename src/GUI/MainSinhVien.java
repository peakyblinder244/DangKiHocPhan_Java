/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import service.GiaoVuService;
import service.SinhVienService;

import javax.swing.*;

/**
 *
 * @author lhqua
 */
public class MainSinhVien extends javax.swing.JFrame {
    private GiaoVuService giaoVuService = new GiaoVuService();
    private SinhVienService sinhVienService = new SinhVienService();
    /**
     * Creates new form MainSinhVien
     */
    public MainSinhVien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        content = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        xinChao = new javax.swing.JLabel();
        tenId = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        taiKhoan = new javax.swing.JMenu();
        xemThongTinTaiKhoan = new javax.swing.JMenuItem();
        thayDoiThongTin = new javax.swing.JMenuItem();
        quanLyMatKhau = new javax.swing.JMenuItem();
        dangXuat = new javax.swing.JMenuItem();
        thoat = new javax.swing.JMenuItem();
        dangKiHocPhan = new javax.swing.JMenu();
        xemLichHoc = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xinChao.setText("Xin chào");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(xinChao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tenId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(911, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tenId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xinChao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(394, Short.MAX_VALUE))
        );

        content.addTab("Trang Trủ", jPanel1);

        taiKhoan.setText("Tài Khoản");

        xemThongTinTaiKhoan.setText("Xem Thông Tin Tài Khoản");
        xemThongTinTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemThongTinTaiKhoanActionPerformed(evt);
            }
        });
        taiKhoan.add(xemThongTinTaiKhoan);

        thayDoiThongTin.setText("Thay Đổi Thông Tin");
        thayDoiThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thayDoiThongTinActionPerformed(evt);
            }
        });
        taiKhoan.add(thayDoiThongTin);

        quanLyMatKhau.setText("Đổi Mật Khẩu");
        quanLyMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyMatKhauActionPerformed(evt);
            }
        });
        taiKhoan.add(quanLyMatKhau);

        dangXuat.setText("Đăng Xuất");
        dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangXuatActionPerformed(evt);
            }
        });
        taiKhoan.add(dangXuat);

        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        taiKhoan.add(thoat);

        jMenuBar1.add(taiKhoan);

        dangKiHocPhan.setText("Đăng Kí Học Phần");
        dangKiHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangKiHocPhanMouseClicked(evt);
            }
        });
        jMenuBar1.add(dangKiHocPhan);

        xemLichHoc.setText("Xem Lịch Học");
        xemLichHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xemLichHocMouseClicked(evt);
            }
        });
        jMenuBar1.add(xemLichHoc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void xemThongTinTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {
        ThongTinTaiKhoan thongTinTaiKhoan = new ThongTinTaiKhoan();
        thongTinTaiKhoan.show();
        content.removeAll();
        content.add("Thông Tin Tài Khoản", thongTinTaiKhoan);
        //thongTinTaiKhoan.ResetForm
    }

    private void thayDoiThongTinActionPerformed(java.awt.event.ActionEvent evt) {
//        ThayDoiThongTin thayDoiThongTin = new ThayDoiThongTin();
//        thayDoiThongTin.show();
        JFrame frame = new ThayDoiThongTin();
        frame.setResizable(false);
        frame.setTitle("Đăng Nhập");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void quanLyMatKhauActionPerformed(java.awt.event.ActionEvent evt) {
//        DoiMatKhau doiMatKhau = new DoiMatKhau();
//        doiMatKhau.show();
        JFrame frame = new DoiMatKhau();
        frame.setResizable(false);
        frame.setTitle("Đăng Nhập");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void dangXuatActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
//        DangNhap dangNhap = new DangNhap();
//        dangNhap.setVisible(true);
        JFrame frame = new DangNhap();
        frame.setTitle("Đăng Nhập");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);
    }

    private void dangKiHocPhanMouseClicked(java.awt.event.MouseEvent evt) {
       //new FormDangKiHocPhan().setVisible(true);
        JFrame frame = new FormDangKiHocPhan();
        frame.setResizable(false);
        frame.setTitle("Đăng Nhập");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void xemLichHocMouseClicked(java.awt.event.MouseEvent evt) {
        //new FormDanhSachHocPhanDaDangKi().setVisible(true);
        JFrame frame = new FormDanhSachHocPhanDaDangKi();
        frame.setResizable(false);
        frame.setTitle("Đăng Nhập");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainSinhVien().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private javax.swing.JTabbedPane content;
    private javax.swing.JMenu dangKiHocPhan;
    private javax.swing.JMenuItem dangXuat;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem quanLyMatKhau;
    private javax.swing.JMenu taiKhoan;
    private javax.swing.JLabel tenId;
    private javax.swing.JMenuItem thayDoiThongTin;
    private javax.swing.JMenuItem thoat;
    private javax.swing.JMenu xemLichHoc;
    private javax.swing.JMenuItem xemThongTinTaiKhoan;
    private javax.swing.JLabel xinChao;
    // End of variables declaration
}
