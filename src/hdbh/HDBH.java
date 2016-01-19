
package hdbh;

import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Scanner;




public class HDBH {
   
    
      public static void main(String[] args) {
        HDBH demo = new HDBH();
        demo.print();
}
    final private HashMap hashMap;
    final private JTable tbl;
    public HDBH() {
        String str[] = new String[15];
        DefaultTableModel tableModel = new DefaultTableModel(str, 1);
        tbl = new JTable(tableModel);
        String[] keys;
        keys = new String[]{
            "name","address","namesp","money","mhd",
            "ngay","thang","nam","phone","stt","sl","dg","ck","tiensau","tienchu"
        };
        hashMap = new HashMap();
        String[] values ;
        values = new String[15];
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập tên khách hàng : ");
        values[0] = nhap.nextLine();
        Object put = hashMap.put("name", values[0]);
        
        System.out.print("Nhập địa chỉ : ");
        values[1] = nhap.nextLine();
        Object put1 = hashMap.put("address", values[1]);
        
        System.out.print("Nhập số điện thoại : ");
        values[2] = nhap.nextLine();
        Object put2 = hashMap.put("phone",values[2]);

        
        System.out.print("Nhập tên sản phẩm: ");
        values[3] = nhap.nextLine();
        Object put3 = hashMap.put("namesp", values[3]);

        System.out.print("Nhập đơn vị tiền: ");
        values[4] = nhap.nextLine();
        Object put4 = hashMap.put("money", values[4]);

        System.out.print("Nhập số tiền bằng chữ: ");
        values[5] = nhap.nextLine();
        Object put5 = hashMap.put("tienchu", values[5]);        
        
        System.out.print("Nhập mã hóa đơn: ");
        values[6] = nhap.nextLine();
        Object put6 = hashMap.put("mhd", values[6]);
        
        System.out.println("");
        
        int[] values1;
        values1 = new int[10];
        
        System.out.print("Nhập ngày : ");
        values1[0]= nhap.nextInt();
        Object put7 = hashMap.put("ngay", values1[0]);
        
        System.out.print("Nhập tháng : ");
        values1[1] = nhap.nextInt();
        Object put8 = hashMap.put("thang", values1[1]);
        
        System.out.print("Nhập năm : ");
        values1[2] = nhap.nextInt();
        Object put9 = hashMap.put("nam", values1[2]);
        
        System.out.print("Nhập số thứ tự : ");
        values1[3] = nhap.nextInt();
        Object put10 = hashMap.put("stt", values1[3]);

        System.out.print("Nhập số lượng : ");
        values1[4] = nhap.nextInt();
        Object put11 = hashMap.put("sl", values1[4]);

        float[] values2;
        values2 = new float[10];  
        
        System.out.print("Nhập đơn giá : ");
        values2[0] = nhap.nextInt();
        Object put12 = hashMap.put("dg", values2[0]);
        
        System.out.print("Nhập triết khấu : ");
        values2[1] = nhap.nextInt();
        Object put13 = hashMap.put("ck", values2[1]);
        
        float ab=values1[4]*values2[0];
        Object put14=hashMap.put("tongc",ab);
        
        values2[2] =(ab/100)*values2[1];
        values2[3] = ab-values2[2];
               
        Object put15=hashMap.put("sales",values2[2]);
        Object put16=hashMap.put("tt",values2[3]);
        Object put17=hashMap.put("tiensau",values2[3]);
        System.out.println(hashMap);
}
    
     public void print() {
         System.err.println(" HKT Consultant ");
        //  reportExport("/home/longnt/testA4.jasper", hashMap,tbl.getModel(),true);
        reportExport("HDBH.jasper", hashMap, tbl.getModel(), false);        
    }

    private void reportExport(String filePathResource, HashMap hashMap, TableModel model, boolean flag) {
        ReportManager.getInstance().viewReport(filePathResource, hashMap, model, flag);
    }

}