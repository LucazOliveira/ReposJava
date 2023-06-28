package entities;
public class Produto {
    String nome;
    double preco;
    int quantidadeemestoque;
public double valoremestoque(){
    return preco*quantidadeemestoque;
}
public void adicionarprodutos(int quantidadeemestoque){
this.quantidadeemestoque +=quantidadeemestoque;
}
public void subtrairprodutos(int quantidadeemestoque){
    this.quantidadeemestoque -=quantidadeemestoque;
}
}
