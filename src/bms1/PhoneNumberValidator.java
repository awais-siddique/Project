/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bms1;

/**
 *
 * @author HP
 */
public class PhoneNumberValidator 
{
    public static boolean isValidPhoneNumberFormat(String phoneNumber) {
        // Check the length of the phone number
        if (phoneNumber.length() != 12) {
            return false;
        }

        // Check the positions of hyphen
        if (phoneNumber.charAt(4) != '-') {
            return false;
        }

        // Check if the rest are digits
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (i != 4 && !Character.isDigit(phoneNumber.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
