/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bms1;

/**
 *
 * @author HP
 */
public class EmailValidator 
{
    public static boolean isValidEmail(String email) {
        // Check if "@" and "." are present
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        // Ensure "@" comes before "."
        if (atIndex > 0 && dotIndex > atIndex) {
            // Ensure there is at least one character before "@" and after "."
            if (atIndex > 1 && dotIndex < email.length() - 1) {
                return true;
            }
        }

        return false;
    }
}
