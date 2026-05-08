package com.workintech.developers;

public class HRManager extends Employee{
   private JuniorDeveloper [] juniorDevelopers;
   private MidDeveloper [] midDevelopers;
   private SeniorDeveloper [] seniorDevelopers;

   public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers  = new JuniorDeveloper[10];
        this.midDevelopers     = new MidDeveloper[10];
        this.seniorDevelopers  = new SeniorDeveloper[10];
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
       if(index < 0 || index >= juniorDevelopers.length){
           System.out.println("Geçersiz index");
       }else if(juniorDevelopers[index] == null){
           juniorDevelopers[index] = juniorDeveloper;
       }else{
           System.out.println("İndex zaten dolu");
       }
    }
    public void addEmployee(int index, MidDeveloper midDeveloper){
       if(index < 0 || index >= midDevelopers.length ){
           System.out.println("Geçersiz index");
       }else if(midDevelopers[index] == null){
           midDevelopers[index] = midDeveloper;
       }else{
           System.out.println("İndex zaten dolu");
       }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        if(index < 0 || index >= seniorDevelopers.length ){
            System.out.println("Geçersiz index");
        }else if(seniorDevelopers[index] == null){
            seniorDevelopers[index] = seniorDeveloper;
        }else{
            System.out.println("İndex zaten dolu");
        }
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }
}
