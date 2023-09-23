package io.giovannymassuia;

public class StringTemplates {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        String template = STR. """
        {
            "firstName": "\{ firstName }",
            "lastName": "\{ lastName }"
        }
        """ ;

        System.out.println(template);
    }
}