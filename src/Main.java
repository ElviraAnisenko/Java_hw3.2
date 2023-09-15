public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKilograms = 98;
        double heightInMetres = 1.87;
        int index = service.calculate(weightInKilograms, heightInMetres);
        System.out.println();
        System.out.println("Ваш ИМТ равен " + index);
    }
}

