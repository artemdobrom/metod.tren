public class Phones {
    boolean IOs;
    int year;


    public void phonesAndroidOrIos() {
        if (IOs == true) {
            IOs();
        } else {
            android();
        }
    }
     public void android() {

        if ( IOs== false && year > 2015) {
            System.out.println("Установите облегчённую версию для Андроид" );
        } else {
            System.out.println("Установите обычное приложение для Андроид");
        }
    }

   public  void IOs() {

     if ( IOs ==true && year > 2015) {
         System.out.println("Установите облегчённую версию для iOs");
     } else {
         System.out.println("Установите обычное приложение для iOs");
     }

}
    }
