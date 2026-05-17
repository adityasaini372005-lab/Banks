//Encapsulation
class Account{
   public String name;
   protected String email;
   private String passward;

   //getters & setters
   public String getPassward(){
    return this.passward;
   }
   public void setPassward(String pass){
    this.passward=pass;
   }
}

public class Bank {
    
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name="Apna College";
        account1.email="apnacollege@gmail.com";
        account1.setPassward("abcd");
        System.out.println(account1.getPassward());
    }
}
