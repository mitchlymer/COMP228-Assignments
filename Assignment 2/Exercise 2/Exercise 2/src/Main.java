public class Main {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        System.out.print("Enter an integer number between 3 and 27: \n");
        String input = System.console().readLine();
        int userChoice = Integer.parseInt(input);

        int attempts = 0;
        boolean won = false;
        while (attempts < 5 && !won) {
            lotto = new Lotto();
            int sum = lotto.calculateSum();
            System.out.println("Lotto numbers are: " + lotto.getNumbers()[0] + " " + lotto.getNumbers()[1] + " " + lotto.getNumbers()[2]);
            if (sum == userChoice) {
                System.out.println("Winner!");
                won = true;
            } else {
                attempts++;
                System.out.println("Winning number was " + sum + ". You have " + (5 - attempts) + " attempts left.");
            }
        }

        if (!won) {
            System.out.println("Unfortunately you did not win.");
        }
    }
}