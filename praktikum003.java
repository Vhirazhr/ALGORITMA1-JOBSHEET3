public class praktikum003 {

    public static class PersegiPanjang {
        public int panjang;
        public int lebar;

        public PersegiPanjang(int p, int l) {
            panjang = p;
            lebar = l;
        }

        public void CetakInfo() {
            System.out.println("Persegi panjang, panjang: " + panjang + ", lebar: " + lebar);
        }
    }

    public static void main(String[] args) {
        PersegiPanjang[] arrayofPersegiPanjang = new PersegiPanjang[3];
    }
}
