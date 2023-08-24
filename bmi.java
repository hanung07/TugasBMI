public class bmi {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan nama (nama panggilan saja) : ");
        String beratAsli = JOptionPane.showInputDialog("Masukkan berat badan(kg) : ");
        String tinggiAsli = JOptionPane.showInputDialog("Masukkan tinggi badan(cm) : ");
        
        DecimalFormat numberFormat = new DecimalFormat("#.0");
        
        float beratPound = Float.parseFloat(beratAsli)*2.20462f;
        float tinggiInci = Float.parseFloat(tinggiAsli)/2.54f;
        
        float hasil = beratPound/(tinggiInci*tinggiInci)*703f;
        
        JOptionPane.showMessageDialog(null, "berat badan (pound) = "+numberFormat.format(beratPound)+"\ntinggi badan (inch) ="+numberFormat.format(tinggiInci));
        JOptionPane.showMessageDialog(null, "BMI ananda "+nama+" adalah "+numberFormat.format(hasil));
        
        if (hasil < 18.5) {
            JOptionPane.showMessageDialog(null, "anda kekurangan berat badan!");
        }
        else if (hasil >= 18.5 & hasil < 25) {
            JOptionPane.showMessageDialog(null, "berat badan anda normal!");
        }
        else if (hasil >= 25 & hasil < 30) {
            JOptionPane.showMessageDialog(null, "anda kelebihan berat badan!");
        }
        else {
            JOptionPane.showMessageDialog(null, "anda obesitas!");
        }
    }
}