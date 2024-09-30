public class Test {
    private int correct;
    private int wrong;

    public Test() {
        correct = 0;
        wrong = 0;
    }

    public void simulateQuestion(String question, String option1, String option2, boolean correctOption) {
        System.out.println(question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);

        System.out.print("Enter your answer (1 or 2): ");
        String input = System.console().readLine();

        if ((input.equals("1") && correctOption) || (input.equals("2") && !correctOption)) {
            correct++;
            System.out.println("Correct answer.");
        } else {
            wrong++;
            System.out.println("Wrong answer. The correct answer is: " + (correctOption ? option1 : option2));
        }
    }

    public void inputAnswer() {
        simulateQuestion("When was Java created?", "1995", "1991", false);
        simulateQuestion("What are object properties known as?", "behaviours", "data fields", false);
        simulateQuestion("When a method terminates, the values of its local variables are lost. True or false?", "true", "false", true);
        simulateQuestion("Non-static methods are typically called a ________ _______", "public method", "instance method", false);
        simulateQuestion("What is the minimum version number of Java Standard Edition that contains capabilities needed to develop desktop and server applications?", "8", "12", true);

        displayResults();
    }

    public void displayResults() {
        int totalQuestions = 5;
        double percentage = (double) correct / totalQuestions * 100;

        System.out.println("You scored " + correct + " out of " + totalQuestions + ".\nYour percentage is: " + String.format("%.2f", percentage) + "%");
    }
}