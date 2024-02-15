
class Student extends Person{
    final static double scholarship=36660.00;
    private double gpa;
    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }
    public void setGpa(double gpa1){
        this.gpa=gpa1;
    }
    public double getGpa(){
        return gpa;
    }
    public String getPosition(){
        return "Student";
    }
    @Override
    public String toString(){
        return "Student: "+super.toString();
    }
    public double getPaymentAmount(){
        if(getGpa()>2.67){
            return scholarship;
        }
        else{
            return 0.00;
        }
    }
}