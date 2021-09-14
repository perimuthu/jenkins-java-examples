class Magazine {
  String language = "Tamil";
  public void mag_lang() {
    System.out.println("Language of Magazine is "+ language);
  }
}

class Weekly_mag extends Magazine {
  String mag_name;
  public Weekly_mag(String name) {
    mag_name=name;
  }
  public void show_mag_info() {
    System.out.println("Magazine name is "+ mag_name);
  }

} 


/** 
 * The HelloWorldApp class implements an application that simply prints "Hello World" to standard output.
 */
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World");
    System.out.println("This Change was made on Sep 10th 2021 for testing Git Jenkins");
    System.out.println("Hello world of Magazines !");
    Weekly_mag weekly_mag = new Weekly_mag("Kalki");
    weekly_mag.mag_lang();
    weekly_mag.show_mag_info();
  }
}
