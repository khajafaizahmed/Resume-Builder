package com.company;
import java.util.*;
/**
 * Faiz Ahmed, 
 * A program that builds a resume!
 */
public class Main
{
    public static void main(String[] args)
    {
        //Get the input from user
        System.out.println(buildResume());
    }

    static Object buildResume(){
        Scanner scanner = new Scanner(System.in);

        // Call methods for each resume section

        String name = getName(scanner);

        String sectionEducation = getEducation(scanner);

        String sectionContactInfo = getContactInfo(scanner);

        String sectionWorkExperience = getWorkExperience(scanner);

        String skills = getSkills(scanner);

        System.out.println("\nResume Of: " + name + "\n");

        System.out.println("Contact Info: " + sectionContactInfo);

        System.out.println("College: " + sectionEducation);

        System.out.println("Work Experience: " + sectionWorkExperience);
        scanner.close();
        return "Skills: " + skills;
    }
    // Name section
    public static String getName(Scanner getInput)
    {

        String name;
        System.out.print("Please enter your first and last name on one line: ");
        // give value to the that string
        name = getInput.nextLine();

        return name;
    }


    // Contact Info section
    public static String getContactInfo(Scanner getInput)
    {
        String contactInfo;
        System.out.print("Please enter your Contact Info: ");
        //give value to the that string
        contactInfo = getInput.nextLine();

        return contactInfo;
    }


    // Education section
    public static String getEducation(Scanner getInput)
    {
        String education;
        System.out.print("Please enter the college name: ");
        education = getInput.nextLine();
        System.out.print("Major: ");
        education += "\nMajor: " + getInput.nextLine();
        System.out.print("Graduation Year");
        education += "\nGraduation Year: " + getInput.nextLine();
        //give value to the that string


        if (education.equals("Harvard"))
        {
            System.out.print(" hahahaha");
        }

        return education;
    }

    // Work Experience section
    public static String getWorkExperience(Scanner getInput)
    {
        String workExperience;
        System.out.print("Please enter your Recent Work Experience: ");
                //give value to the that string
        workExperience = getInput.nextLine();

        return workExperience;
    }

    // Work Skills section
    public static String getSkills(Scanner getInput)
    {
        String skills;
        System.out.print("Please enter your skills: ");
                //give value to the that string
        skills = getInput.nextLine();

        return skills;
    }

}
