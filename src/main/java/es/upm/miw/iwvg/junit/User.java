package es.upm.miw.iwvg.junit;

public class User {

    private int number;

    private String name;

    private String familyName;
    
    private String secondFamilyName;

    public User(int number, String name, String familyName) {
        this.number = number;
        this.name = this.formatName(name);
        this.familyName = this.format(familyName);
    }
    
    public User(int number, String name, String familyName, String secondFamilyName) {
        this(number, name, familyName);
        this.secondFamilyName = this.format(secondFamilyName);
    }
    
    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }
    
    private String formatName(String string) {
        String[] words = string.split(" ");
        String name = "";
        for (String word : words) {
            name += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        name = name.trim();
        return name;
    }

    public String fullName() {
        return this.name + " " + this.familyName + " " + this.secondFamilyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getSecondFamilyName() {
        return this.secondFamilyName;
    }

}
