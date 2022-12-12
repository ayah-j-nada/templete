/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templete;

/**
 *
 * @author ideapad GAMING
 */
abstract class GraduationProcess {
    abstract void graduateRequest();
    abstract void colegePrinciple();
    private void studentAffors(){
        System.out.println("Student Affors");
    
    }
    
     private void financeDepartment(){
     System.out.println("Finance Department");
    }
     
     private void sroluationDepartment(){
         System.out.println("Sroluation Department");
    
    }
     
     final void Graduate(){
     graduateRequest();
     colegePrinciple();
     studentAffors();
     financeDepartment();
     sroluationDepartment();
     }
    
}
