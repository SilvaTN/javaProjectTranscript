package model;

public class Transcript {
    //TODO: Design specification for this method
    //REQUIRES: 4 >= grade >= 0
    //MODIFIES: this
    //EFFECTS: adds course and grade to transcript
    public void addGrade(String course, double grade){ }

    //TODO: Design specification for this method
    // This method should return course name and grade in some consistent String format
    //REQUIRES: course must be in transcript
    //MODIFIES: nothing
    //EFFECTS: returns course and grade for that course
    public String getCourseAndGrade(String course){ return null; }

    //TODO: Design specification for this method
    //REQUIRES: transcript must not be empty
    //MODIFIES: nothing
    //EFFECTS: prints the transcript
    public void printTranscript(){ }

    //TODO: Design specification for this method
    //REQUIRES: this must have at least one recorded grade
    //MODIFIES: nothing
    //EFFECTS: calculates GPA and returns it
    public double getGPA(){ return 0.0; }
}
