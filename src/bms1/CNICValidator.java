/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bms1;

/**
 *
 * @author HP
 */
public class CNICValidator 
{
    public static boolean isValidCNICFormat(String cnic) {
        // Check the length of the CNIC
        if (cnic.length() != 15) {
            return false;
        }
        
        // Check the positions of hyphens
        if (cnic.charAt(5) != '-' || cnic.charAt(13) != '-') {
            return false;
        }
        
        // Check if the rest are digits
        for (int i = 0; i < cnic.length(); i++) {
            if (i != 5 && i != 13 && !Character.isDigit(cnic.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}
