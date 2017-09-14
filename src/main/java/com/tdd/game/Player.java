package com.tdd.game;
import java.util.Arrays;

public class Player {
    public String playerName;
    String [] allowedPlayers = {"X","O"};


    public Player(String playerName){
        if(Arrays.asList(allowedPlayers).contains(playerName)){
            this.playerName=playerName;
        }
        else{
            this.playerName = "";
        }

    }
    public String getName() {
        return playerName;
    }

    public boolean validatePlayerName(){
        if(playerName.equals("X")|| playerName.equals("O")){
            return  true;
        }
        else
            return false;

    }
}
