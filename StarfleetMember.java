/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0809treetester;

/**
 *
 * @author Colin
 */
public class StarfleetMember implements Comparable<StarfleetMember>{
    private String name;
    private int rank;
    
    /**
     * Constructor
     * @param newName Character name
     * @param newRank Character rank
     */
    public StarfleetMember(String newName, int newRank)
    {
        name = newName;
        rank = newRank;
    }//end constructor
    
    /**
     * No-arg constructor
     */
    public StarfleetMember()
    {
        name = "Roc Ingersoll";
        rank = 0;
    }//end no-arg constructor
    
    /**
     * Change the person's name
     * @param newName The new name
     */
    public void changeName(String newName)
    {
        name = newName;
    }//end changeName
    
    /**
     * Increase the person's rank
     */
    public void promote()
    {
        rank++;
    }//end promote
    
    /**
     * Lowers the person's rank by 1 to a minimum of 0
     */
    public void demote()
    {
        if(rank > 0){
            rank--;
        } else{
            rank = 0;
        }//end if-else
    }//end demote
    /**
     * Gets the character's name
     * @return the character's name
     */
    public String getName()
    {
        return name;
    }//end getName
    
    /**
     * Returns the character's rank number
     * @return rank number
     */
    public int getRankNumber()
    {
        return rank;
    }//end getRank
    
    public String getRankTitle()
    {
        String rankTitle = "";
        switch (rank){
            case 20:    rankTitle = "Fleet Admiral";
                        break;
            case 19:    rankTitle = "Admiral";
                        break;
            case 18:    rankTitle = "Vice Admiral";
                        break;
            case 17:    rankTitle = "Rear Admiral";
                        break;
            case 16:    rankTitle = "Commodore";
                        break;
            case 15:    rankTitle = "Captain";
                        break;
            case 14:    rankTitle = "Commander";
                        break;
            case 13:    rankTitle = "Lieutenant";
                        break;
            case 12:    rankTitle = "Lieutenant Junior Grade";
                        break;
            case 11:    rankTitle = "Ensign";
                        break;
            case 10:    rankTitle = "Cadet";
                        break;
            case 9:     rankTitle = "Master Chief Petty Officer";
                        break;
            case 8:     rankTitle = "Senior Chief Petty Officer";
                        break;
            case 7:     rankTitle = "Chief Petty Officer";
                        break;
            case 6:     rankTitle = "Petty Officer First Class";
                        break;
            case 5:     rankTitle = "Petty Officer Second Class";
                        break;
            case 4:     rankTitle = "Petty Officer Third Class";
                        break;
            case 3:     rankTitle = "Crewman First Class";
                        break;
            case 2:     rankTitle = "Crewman Second Class";
                        break;
            case 1:     rankTitle = "Crewman Third Class";
                        break;
            default:    rankTitle = "Civilian Liason";
                        break;
        }//end switch
        return rankTitle;
    }//end getRankTotal
    
    /**
     * Compares two StarfleetMember objects
     * @param otherMember the StarfleetMember to be compared to
     * @return which one holds higher rank
     */
    @Override
    public int compareTo(StarfleetMember otherMember)
    {
        int comparison;
        if (rank > otherMember.getRankNumber()){
            comparison = 1;
        } else if (rank == otherMember.getRankNumber()){
            comparison = 0;
        } else {
            comparison = -1;
        }//end if-else
        return comparison;
    }//end compareTo
    
    /**
     * Determines if two StarfleetMembers are the same person
     * @param otherMember The other member to compare to
     * @return Whether they are the same
     */
    public boolean equals(StarfleetMember otherMember)
    {
        boolean areEqual = false;
        if (rank == otherMember.getRankNumber()&&
                name.equals(otherMember.getName())){
            areEqual = true;
        }//end if
        return areEqual;
    }//end equals
    
    /**
     * Converts the character name and rank to a string
     * @return The character's name and rank
     */
    @Override
    public String toString()
    {
        return this.getRankTitle() + name;
    }//end toString
}//end StarfleetMember
