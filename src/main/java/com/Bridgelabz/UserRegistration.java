package com.Bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    /**
     * Function for Checking the FirstName
     * @return True if matches regex pattern otherwise throws exception
     * @throws ValidationOfException
     */
    public boolean checkFirstname(String fName) throws ValidationOfException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", fName);
        if (check)
            return true;
        else
            throw new ValidationOfException("Invalid First name");
    }

    /**
     * Function for Checking the LastName
     * @return True if matches regex pattern otherwise throws exception
     * @throws ValidationOfException
     */
    public boolean checkLastName(String Lname) throws ValidationOfException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", Lname);
        if (check)
            return true;
        else
            throw new ValidationOfException("Invalid Last Name");
    }

    /**
     * Function for Checking the EmailID
     * @return True if matches regex pattern otherwise throws exception
     * @throws ValidationOfException
     */
    public boolean checkEmailId(String EmailId) throws ValidationOfException {
        boolean check = Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", EmailId);
        if (check)
            return true;
        else
            throw new ValidationOfException("Invalid Email id");
    }

    /**
     * Function for Checking the MobileNo
     * @return True if matches regex pattern otherwise throws exception
     * @throws ValidationOfException
     */
    public boolean checkMobileNo(String MobileNo) throws ValidationOfException {
        boolean check = Pattern.matches("^[1-9][0-9][1-9]{10}", MobileNo);
        if (check)
            return true;
        else
            throw new ValidationOfException("Invalid Phone number");
    }

    /**
     * Function for Checking the PassWord
     * @return True if matches regex pattern otherwise throws exception
     * @throws ValidationOfException
     */
    public boolean checkPassWord(String Password) throws ValidationOfException {
        boolean check = Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-z0-9!@#$%^&*()_+=-{};':<>,./?~`]).{8,}$",
                Password);
        if (check)
            return true;
        else
            throw new ValidationOfException("Invalid password");
    }

    public static void main(String[] args) throws ValidationOfException {
        UserRegistration registration = new UserRegistration();
        registration.checkFirstname("Sru"); // Throws invalid first name exception
        registration.checkLastName("Ma");  //Throws invalid last name exception
        registration.checkEmailId("@abc");  //Throws invalid EmailId exception
        registration.checkMobileNo("1245789");  //Throws invalid mobile number exception
        registration.checkPassWord("abvg");  //Throws invalid password exception


    }

}
