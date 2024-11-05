/**
 * @author MauricioCampos
 */

import java.util.ArrayList;
import java.util.List;

// Classe abstrata Carro
abstract class Carro {
    private String modelo;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public abstract void exibirInfo();
}

// Classe concreta para o carro da marca Ford
class Ford extends Carro {
    public Ford(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Ford - Modelo: " + getModelo() + ", Ano: " + getAno());
    }
}

// Classe concreta para o carro da marca Chevrolet
class Chevrolet extends Carro {
    public Chevrolet(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Chevrolet - Modelo: " + getModelo() + ", Ano: " + getAno());
    }
}

// Classe concreta para o carro da marca Toyota
class Toyota extends Carro {
    public Toyota(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Toyota - Modelo: " + getModelo() + ", Ano: " + getAno());
    }
}

// Classe concreta para o carro da marca Honda
class Honda extends Carro {
    public Honda(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Honda - Modelo: " + getModelo() + ", Ano: " + getAno());
    }
}

// Classe principal com a lista genérica
 class Main {
    public static void main(String[] args) {
        // Criando uma lista genérica que pode conter qualquer tipo de carro
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando diferentes carros na lista
        listaDeCarros.add(new Ford("Mustang", 2023));
        listaDeCarros.add(new Chevrolet("Camaro", 2022));
        listaDeCarros.add(new Toyota("Corolla", 2021));
        listaDeCarros.add(new Honda("Civic", 2020));

        // Exibindo as informações de cada carro na lista
        for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
        }
    }
}






