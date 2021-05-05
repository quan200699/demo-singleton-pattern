package com.codegym;

public class DBConnection {
    private static final DBConnection INSTANCE = new DBConnection();

    private DBConnection(){
        System.out.println("Khởi tạo kết nối đến cơ sở dữ liệu");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Khởi tạo thành công");
    }

    public static DBConnection getINSTANCE() {
        return INSTANCE;
    }

    public void getAllData(){
        System.out.println("Đây là dữ liệu từ DB");
    }
}
