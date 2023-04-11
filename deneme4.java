public class deneme4 { // 1 2 3 4 5 6 7 8 9 11 13 15 ortak elemanlarının sayısını verir
    public static void main(String[] args) {
        int[] array1={3,11,15,13,4,5,7,8,4,5,7,8,2,3,2,3,4,5,7,8,9,11,15,13,4,5,7,8,9,11,15,13,9,11,15,13};
        int[] array2={6,2,3,4,5,1};
        System.out.println(ikiDizininBirlesimindekiElemanSayisi(array2,array1));
    }
    public static  int ikiDizininBirlesimindekiElemanSayisi(int [] array1,int [] array2) {
                int[] birlesim = new int[array1.length + array2.length];
                int sayac = 0;
                for (int i = 0; i < array1.length; i++) {
                    boolean zatenEklendiMi = false;
                    for (int j = 0; j < sayac; j++) {
                        if (birlesim[j] == array1[i]) {
                            zatenEklendiMi = true;
                            break;
                        }
                    }
                    if (!zatenEklendiMi) {
                        birlesim[sayac] = array1[i];
                        sayac++;
                    }
                }
                for (int i = 0; i < array2.length; i++) {
                    boolean zatenEklendiMi = false;
                    for (int j = 0; j < sayac; j++) {
                        if (birlesim[j] == array2[i]) {
                            zatenEklendiMi = true;
                            break;
                        }
                    }
                    if (!zatenEklendiMi) {
                        birlesim[sayac] = array2[i];
                        sayac++;
                    }
                }
        return sayac;
    }
}