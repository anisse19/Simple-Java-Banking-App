import java.util.Date;//Para a data

class Transaction {
    String transactionId;
    Date TransactionDate;
    String type;//O tipo de transacçåo, Ex: Deposito, Levantamento, Trnaferéncia
    double amount;
    String sourceAccountId;
    /*String targetAccountId(optional, caso queira colocar as transacções) */

    void createTransaction(String type,double amount, String sourceAccountId){
    }//lógica para a transacção
    
}
