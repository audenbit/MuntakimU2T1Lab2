public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("debbie", 420);
        debbie.greeting("Fiad");
        debbie.favoriteNumber(69);
        debbie.weather();

        int awesomeNums = debbie.addNumbers(13,420,69);
        System.out.println("The sum of 13, 420, and 69 is " + awesomeNums);

        double fiveFtToM = debbie.convertFeetToMeters(5);
        System.out.println("Five feet is " + fiveFtToM + " meters");

        System.out.println(debbie.goodbye());

        debbie.compareDec(4.5);
        System.out.println(debbie.favFood());

    }
}
