public class volume {
    public static void main(String[] args) {
        String pilihan = JOptionPane.showInputDialog("MENGHITUNG VOLUME BANGUN RUANG \na. bola \nb. tabung \nc. kerucut \npilih bangun mana yang akan anda hitung (gunakan a / b / c) : ");
        DecimalFormat deFormat = new DecimalFormat("#.0");
        if ("a".equals(pilihan)) {
            float nilai = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai jari-jari atau r (cm) : "));
            float bola = (((4f  22f  (nilai*nilai*nilai))/3f))/7f;
            JOptionPane.showMessageDialog(null, "volume bola tersebut adalah "+deFormat.format(bola)+" cm\u00B3");
        }
        else if ("b".equals(pilihan)) {
            float nilaiR = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai jari-jari atau r (cm) : "));
            float nilaiT = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai tinggi atau t (cm) : "));
            float tabung = ((4f  22f (nilaiR*nilaiR) * nilaiT)/3f)/7f;
            JOptionPane.showMessageDialog(null, "volume tabung tersebut adalah "+deFormat.format(tabung)+" cm\u00B3");
        }
        else if ("c".equals(pilihan)) {
            float nilaiR = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai jari-jari atau r (cm) : "));
            float nilaiT = Float.parseFloat(JOptionPane.showInputDialog("masukkan nilai tinggi atau t (cm) : "));
            float kerucut = ((22f  nilaiR  nilaiR * nilaiT)/3f)/7f;
            JOptionPane.showMessageDialog(null, "volume kerucut tersebut adalah "+deFormat.format(kerucut)+" cm\u00B3");
        }
        else {
            JOptionPane.showMessageDialog(null, "masukkan input yang benar!");
        }
    }
}