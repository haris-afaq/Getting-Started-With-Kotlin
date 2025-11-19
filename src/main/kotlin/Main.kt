package org.example

//Encapsulation example

fun main(){

   val bankAccount = BankAccount()
    bankAccount.setDepositBalance(5000.0)
    bankAccount.setAccountHolderName("Shehroz")
    println("Account Balance: ${bankAccount.getDepositBalance()}")
    println("Account Holder Name: ${bankAccount.getAccountHolderName()}")

}

class BankAccount {
    private var balance: Double = 0.0
    private var accountHolderName: String = ""

    // Setter
    fun setDepositBalance(amount: Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Ghareeb insan")
        }
    }

    // Getter
    fun getDepositBalance(): Double {
        return balance
    }


    //Setter Method for Account Holder

    fun setAccountHolderName(name: String){
        if(name.isNotEmpty()){
            accountHolderName=name
        }
        else{
            println("Name bhi du na bhai masti kiyu kar raha hai")
        }
    }

    //Getter Method of Account Holder

    fun getAccountHolderName(): String{
        return accountHolderName
    }
}
