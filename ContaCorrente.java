public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public boolean sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque");
            return false;
        }
        if (valor > 10000) {
            System.out.println("Valor excede o limite de R$ 10.000 por operação");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        
        saldo -= valor;
        System.out.println("Saque realizado com sucesso");
        return true;
    }

    public boolean depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito");
            return false;
        }
        if (valor > 10000) {
            System.out.println("Valor excede o limite de R$ 10.000 por operação");
            return false;
        }

        saldo += valor;
        System.out.println("Depósito realizado com sucesso");
        return true;
    }

    public float consultarSaldo() {
        return saldo;
    }
} 