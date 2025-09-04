public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria() {
        this.saldo = 0.0;
    }
    public CuentaBancaria(double saldo) {
        if (saldo < 0.0) {
            this.saldo = saldo;;
        }else{
                this.saldo = saldo;
                System.out.println("Saldo inicial: " + this.saldo);


        }
    }

    public double getSaldo() {
return this.saldo;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor) {
if (valor > 0) {
    this.saldo += valor;
    } else {
        System.out.println("El valor a depositar debe ser positivo.");
    }
    }
    public void retirar(double valor) {
if (valor > 0 && valor <= this.saldo) {
    this.saldo -= valor;
    } else if (valor > this.saldo) {
    System.out.println("Fondos insuficientes o valor negativo.");
    } else  {
        System.out.println("El valor a retirar debe ser positivo.");
    }
    }
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + this.saldo);
    }
}



