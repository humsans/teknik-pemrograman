class KonversiTipeData {
    static short methodOne(long l){ // deklarasi fungsi
        int i = (int) l; // proses konversi tipe data dari long --> int
        return (short)i; // kembalian nilai dengan tipe data berubah dari int --> short
    }
    public static void main(String[] args){
        double d = 10.25; 
        float f = (float) d; // proses konversi tipe data dari double --> float, untuk var baru
        byte b = (byte) methodOne((long) f); // pemanggilan fungsi, untuk proses perubahan tipe data
        System.out.println(b);
}
}

