/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pradeep Kumara
 */
class Cachbalance {
    private int id;
    private int deposite,withdrawal;
    private String reason,date;
    
    public Cachbalance(String reason,String date,int deposite,int withdrawal){
//        this.id=id;
        this.reason=reason;
        this.date=date;
        this.deposite=deposite;
        this.withdrawal=withdrawal;
    }
    
    public String getreason(){
        return reason;
    }
    public String getdate(){
        return date;
    }
    public int getdeposite(){
        return deposite;
    }
    public int getwithdrawal(){
        return withdrawal;
    }
}
