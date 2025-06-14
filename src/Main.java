public class Main {
    public static void main(String[] args) {
        Adres adres=new Adres("Rzeszow","Rejtana","15c","55-665");
        Student student=new Student("Jan Nowakowski",23,adres,"jk5341",1,"IiE");
        System.out.println(student.toString());
    }
}