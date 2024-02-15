abstract class Person implements Comparable<Person>, Payable{
    private int id;

    private String name;
    private String surname;
    static int idCount = 1;

    public Person(){
        id=idCount++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    public void setName(String person_name){
        this.name=person_name;
    }
    public void setSurname(String person_surname){
        this.surname=person_surname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    @Override
    public String toString(){
        return getId() + ". " + getName() +" "+ getSurname();
    }
    public int compareTo(Person person1){
        return Double.compare(this.getPaymentAmount(), person1.getPaymentAmount());
    }
}