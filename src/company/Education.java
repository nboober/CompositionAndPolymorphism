package company;

import java.util.ArrayList;
import java.util.Collections;

public class Education {

    ArrayList<String> schools;

    public Education(){
        schools = new ArrayList<String>();
        setSchool();
    }


    public void setSchool(){
        Collections.addAll(schools, "UMD", "Duke", "Towson", "USC", "Berkley", "WVU", "MC", "Marshal", "UMBC", "NYU");
    }

    @Override
    public String toString(){
        String str = "";

        for(String school : schools){
            str += school + " ";
        }

        return "Schools Attended: " + str;
    }



}
