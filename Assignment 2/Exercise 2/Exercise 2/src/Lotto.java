public class Lotto {
    private int[] numbers;

    public Lotto() {
        numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = (int) (Math.random() * 9) + 1;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int calculateSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}