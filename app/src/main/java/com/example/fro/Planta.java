package com.example.fro;

import java.util.Arrays;

public class Planta {
    /*!< Identificadores da planta */
    private String id; /*!< Representa a key do Map */
    private String apelido;
    private String nome; /*E o nome bonito da planta que sera mostrado, tipo "Sambaia" ou "Palmeira Rafia"*/

    /*!< Informacoes sobre cuidados da planta */
    private String comoPlantar;
    private String frequenciaDeRegamento;
    private String localAdequadoParaPlantio; /*!< Se deve ficar mais no sol ou nem tanto */
    private String poda;
    private String fertilizantesRecomendados;
    private String pragasComuns;

    /*!< Informacoes sobre a planta */
    private String altura;
    private String tempoDeVida;
    private String preco;
    private String outrasInformacoes;

    private String urlImagemPadrao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComoPlantar() {
        return comoPlantar;
    }

    public void setComoPlantar(String comoPlantar) {
        this.comoPlantar = comoPlantar;
    }

    public String getFrequenciaDeRegamento() {
        return frequenciaDeRegamento;
    }

    public void setFrequenciaDeRegamento(String frequenciaDeRegamento) {
        this.frequenciaDeRegamento = frequenciaDeRegamento;
    }

    public String getLocalAdequadoParaPlantio() {
        return localAdequadoParaPlantio;
    }

    public void setLocalAdequadoParaPlantio(String localAdequadoParaPlantio) {
        this.localAdequadoParaPlantio = localAdequadoParaPlantio;
    }

    public String getPragasComuns() {
        return pragasComuns;
    }

    public void setPragasComuns(String pragasComuns) {
        this.pragasComuns = pragasComuns;
    }

    public String getFertilizantesRecomendados() {
        return fertilizantesRecomendados;
    }

    public void setFertilizantesRecomendados(String fertilizantesRecomendados) {
        this.fertilizantesRecomendados = fertilizantesRecomendados;
    }

    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    public void setOutrasInformacoes(String outrasInformacoes) {
        this.outrasInformacoes = outrasInformacoes;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(String tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    public String getPoda() {
        return poda;
    }

    public void setPoda(String poda) {
        this.poda = poda;
    }

    public String getUrlImagemPadrao() {
        return urlImagemPadrao;
    }

    public void setUrlImagemPadrao(String urlImagemPadrao) {
        this.urlImagemPadrao = urlImagemPadrao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        String informacoesPlanta = "";
        if(comoPlantar != null && comoPlantar.equals("")) informacoesPlanta += "Como plantar?\n" + comoPlantar + "\n";
        if(frequenciaDeRegamento != null && !frequenciaDeRegamento.equals("")) informacoesPlanta += "\nQual a frequência de regamento?\n\n" + frequenciaDeRegamento + "\n\n";
        if(localAdequadoParaPlantio != null && !localAdequadoParaPlantio.equals("")) informacoesPlanta += "\nOnde devo plantar?\n\n" + localAdequadoParaPlantio + "\n\n";
        if(altura != null && !altura.equals("")) informacoesPlanta += "\nQual sua altura?\n\n" + altura + "\n\n";
        if(tempoDeVida != null && !tempoDeVida.equals("")) informacoesPlanta += "\nQual seu tempo de vida?\n\n" + tempoDeVida + "\n\n";
        if(poda != null && !poda.equals("")) informacoesPlanta += "\nComo funciona sua poda?\n\n" + poda + "\n\n\n";
        if(fertilizantesRecomendados != null && !fertilizantesRecomendados.equals("")) informacoesPlanta += "\nE a fertilização?\n\n" + fertilizantesRecomendados + "\n\n";
        if(pragasComuns != null && !pragasComuns.equals("")) informacoesPlanta += "\nPossui pragas? Quais e como afetam?\n\n" + pragasComuns + "\n\n";
        if(preco != null && !preco.equals("")) informacoesPlanta += "\nQual seu preço?\n\n" + preco + "\n\n";
        if(outrasInformacoes != null && !outrasInformacoes.equals("")) informacoesPlanta += "\nQuero outras informações!\n\n" + outrasInformacoes + "\n\n";
        return informacoesPlanta;
    }
}


