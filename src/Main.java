import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n1 = new Random().nextInt();
        int n2 = new Random().nextInt();
        int n3 = new Random().nextInt();
        int n4 = new Random().nextInt();
        int n5 = new Random().nextInt();
        String rand = String.valueOf(n1) + n2 + n3 + n4 + n5;
        System.out.println(rand);

        String rand2 = rand.replaceAll("1", "i");
        System.out.println(rand2);

        String rand3 = rand2.replaceAll("-", "");
        System.out.println(rand3);

        String rand4 = rand3.replaceAll("0", "o");
        System.out.println(rand4);

        String rand5 = rand4.replaceAll("6", "b");
        System.out.println(rand5);

        boolean rand6 = rand5.contains("23");
        System.out.println(rand6);

        System.out.println(rand5.indexOf("ob"));

        String lines = """
			        Protego Maxima!
			    Repello Inimicum \t\t!
			    Fianto Duri!    """;

        System.out.println(rand5.equals(rand)); // сравнение

        System.out.println(lines.toLowerCase() + "\n" + lines.toUpperCase());

        System.out.println(rand2.charAt(3)); // поиск по индексу

        int len1 = rand3.length();
        int len2 = rand4.length();
        System.out.println(len1>=len2);

        System.out.println(rand2.startsWith("3"));
        System.out.println(rand2.endsWith("10"));

        String lines_trimmed = lines.trim();
        System.out.println(lines_trimmed);

        System.out.println(rand2.isBlank());
        System.out.println(rand2.isEmpty());

        String part_of_rand5 = rand5.substring(1, 10);
        System.out.println(part_of_rand5);
        MeatHook();
    }
    public static void MeatHook() {
        StringBuilder pudge = new StringBuilder();
        pudge.append("BLINK TPOUT HOOK ROT REFRESH BLINK HOOK TAVERNA");
        int start = new Random().nextInt(0, 50);
        String mini_pudge = pudge.substring(start);
        StringBuilder monkey_king = new StringBuilder();
        monkey_king.append(mini_pudge);
        monkey_king.reverse();
        String kusok1 = String.valueOf(monkey_king.charAt(0));
        String kusok2 = String.valueOf(monkey_king.charAt(1));
        monkey_king.replace(0, 1, kusok2);
        monkey_king.replace(1, 2, kusok1);

        System.out.println(monkey_king);
    }
}