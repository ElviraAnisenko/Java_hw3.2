public class BmiService {
    public int calculate(int weightInKilograms, double heightInMetres) {
        int index;
        index = (int) (weightInKilograms / (heightInMetres * heightInMetres));
        return index;
    }
}
