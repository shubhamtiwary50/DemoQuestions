package PracticeQuestionAnonymousClass;

public class Main {
    public static void main(String[] args) {
        String s1 = "Aaibhav";
        Name n1 = new Name() {
            @Override
            public boolean isStartingwithA(String name) {
                return name.charAt(0)=='A';
            }
        };
        System.out.println("n1.isStartingwithA(s1) = " + n1.isStartingwithA(s1));
    }
}

