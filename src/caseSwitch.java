public class caseSwitch  {

    public static void main(String[] args) {
        String input = "hgFh@gbBBT5e54&";
        String switched = switchCases(input);
        System.out.println(switched);
    }

    public static String switchCases(String input) {
        StringBuilder switchedString = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                switchedString.append(Character.toUpperCase(ch));
            } else {
                switchedString.append(Character.toLowerCase(ch));
            }
        }
        return switchedString.toString();
    }
}
