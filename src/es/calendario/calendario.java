/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.calendario;

/**
 *
 * @author Utente
 */
public class calendario {
    private final int giorno;
    private final int mese;
    private final int anno;

    public calendario(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    
    public int calcolaNumero(){
        int gennaio = 31;
        int febbraio = 28;
        int marzo = 31;
        int aprile = 30;
        int maggio = 31;
        int giugno = 30;
        int luglio = 31;
        int agosto = 31;
        int settembre = 30;
        int ottobre = 31;
        int novembre = 30;
        int giorni = 0;
        
        if(anno % 4 == 0 && anno % 100 != 0 && anno % 400 != 0)
            febbraio = 29;
        
        switch (mese) {
            case 1 : giorni = giorno;
            case 2 : giorni = giorno + gennaio;
            case 3 : giorni = giorno + febbraio + gennaio;
            case 4 : giorni = giorno + marzo + febbraio + gennaio;
            case 5 : giorni = giorno + aprile + marzo + febbraio + gennaio;
            case 6 : giorni = giorno + maggio + aprile + marzo + febbraio + gennaio;
            case 7 : giorni = giorno + giugno + maggio + aprile + marzo + febbraio + gennaio;
            case 8 : giorni = giorno + luglio + giugno + maggio + aprile + marzo + febbraio + gennaio;
            case 9 : giorni = giorno + agosto + luglio + giugno + maggio + aprile + marzo + febbraio + gennaio;
            case 10 : giorni = giorno + settembre + agosto + luglio + giugno + maggio + aprile + marzo + febbraio + gennaio;
            case 11 : giorni = giorno + ottobre + settembre + agosto + luglio + giugno + maggio + aprile + marzo + febbraio + gennaio;
            case 12 : giorni = giorno + novembre + ottobre + settembre + agosto + luglio + giugno + maggio + aprile + marzo + febbraio + gennaio;
            default : {
            }
        }
        
        return giorni;
    }
    
    public String calcolaGiorno(){
        int x = 0;
        int t = calcolaNumero();
        String nomGiorno = "";
        
        x = anno + (anno - 1) / 4 - (anno - 1) / 100 + (anno - 1) / 400 + t;
        
        switch(x % 7){
            case 0 : {    
                nomGiorno = "Sabato";
            }
            case 1 : {
                nomGiorno = "Domenica";
            }
            case 2 : {
                nomGiorno = "Lunedi";
            }
            case 3 : {
                nomGiorno = "Martedi";
            }
            case 4 : {
                nomGiorno = "Mercoledi";
            }
            case 5 : {
                nomGiorno = "Giovedi";
            }
            case 6 : {
                nomGiorno = "Venerdi";
            }
        }
        return nomGiorno;
    }
    
}