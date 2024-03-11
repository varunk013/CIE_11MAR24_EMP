class Bonus {
    private int newsalary;
    private int salary;


    public Bonus(int  newsalary) {
        this. newsalary =  newsalary;
    }

    public void bonus() {
        System.out.println("Bonus Amount: " + (newsalary + salary));
    }
   
}
