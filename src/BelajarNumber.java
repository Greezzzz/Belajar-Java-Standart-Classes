import static java.lang.Integer.parseInt;

public class BelajarNumber {
    public static void main(String[] args) {

//        cara konversi tipe data bukan primitif
        Integer IntValue = 1000;

        long longValue = IntValue.longValue();
        System.out.println(longValue);

//        cara konversi tipe data primitif

        int Intnilai = 100;
        long LongNilai = (int) Intnilai;
        System.out.println(LongNilai);

//        cara konversi string ke number

        String nilai = "10000";

        int intNilai = parseInt(nilai);  //parseInt untuk tipe data primitif
        System.out.println(intNilai);

        Integer IntNilai = Integer.valueOf(nilai);  //valueof untuk tipe data bukan primitif
        System.out.println(IntNilai);
    }
}
