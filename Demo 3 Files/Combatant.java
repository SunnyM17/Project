/**
* <h1>Create Combatant Status!</h1>
* The Combatant program creates an object that is able
* to store information on the combatant's name, max health,
* remaining health, max energy, remaining energy,
* block value, and card deck.
*/
public class Combatant {

  //Instance Variables
  
  private String name;
  private int maxHealth;
  private int maxEnergy;
  private int remainingHealth;
  private int remainingEnergy;
  private int block;
  private Deck deck;

  //Constructors
  
  /**
  * This method creates a default Combatant object.
  */
  public Combatant() {

  }
  
  /**
  * This method creates a Combatant object to store the individual name, max
  * and reamining health, max and remaining energy, block value, and
  * a card deck unique to the individual.
  * @param name The individual's name.
  * @param maxHealth A value the max and remaining health is initiated to.
  * @param maxEnergy A value the max and remaining energy is initiated to.
  * @param enemyDeck A deck to be made into the individual's unique deck.
  * <p>
  * <b>Note:</b> The block value is initiated to 0.
  */
  public Combatant (String name, int maxHealth, int maxEnergy, Deck deck){
    setName(name);
    setMaxHealth(maxHealth);
    setHealth(maxHealth);
    setMaxEnergy(maxEnergy);
    setRemainingEnergy(maxEnergy);
    this.block = 0;
    setDeck(deck);
  }
  
  /**
  * This method creates an object that stores a copy of another Combatant.
  * @param toCopy Copies any/all variables and attributes of the original
  * Combatant including info on the combatant's name, max and remaining
  * health, max and remaining energy, block value, and the card deck 
  * unique to the combatant.
  */
  public Combatant(Combatant toCopy)
  {
    this.name = toCopy.name;
    this.maxHealth = toCopy.maxHealth;
    this.remaingingHealth = toCopy.remainingHealth;
    this.maxEnergy = toCopy.maxEnergy;
    this.remainingEnergy = toCopy.remainingEnergy;
    this.block = 0;
    this.deck = toCopy.deck;
  }
  
  // Setter Methods

  /**
  * Sets a new current block value for the enemy.
  * @param blockValue A value to update the block value.
  */
  public void setRemainingEnergy(int amount)
  {
       remainingEnergy = amount;
  }

  public void setBlock(int blockValue)
  {
      this.block = blockValue;
  }

  /**
  * Sets a new max energy value for the enemy.
  * @param energyValue A value to update the max energy.
  */
  public void setMaxEnergy(int maxEn)
  {
     this.maxEnergy = maxEn;
  }

  /**
  * Sets a new max health value for the enemy.
  * @param maxHP A value to update the max health.
  */
  public void setMaxHealth(int maxHP)
  {
     this.maxHealth = maxHP;
  }

  /**
  * Sets a new health value for the enemy.
  * @param healthValue A value to update health.
  */
  public void setHealth(int HP)
  {
     this.remainingHealth = HP;
  }

  public void setDeck(Deck deck)
  {
     this.deck = deck;
  }


  public void setName(String name)
  {
     this.name = name;
  }

  //Accesor methods


  /**
  * A method to obtain the enemy name.
  * @return String This returns the enemy's name.
  */
  public String getName()
  {
      return name;
  }

  /**
  * A method to obtain remaining health value.
  * @return int This returns the enemy's remaining health.
  */
  public int getRemainingHealth()
  {
     return remainingHealth;
  }

  /**
  * A method to obtain remaining energy value.
  * @return int This returns the enemy's remaining energy.
  */
  public int getRemainingEnergy()
  {
     return remainingEnergy;
  }

  /**
  * A method to obtain max health value.
  * @return int This returns the enemy's max health.
  */
  public int getMaxHealth()
  {
        return maxHealth;
  }

  /**
  * A method to obtain max energy value.
  * @return int This returns the enemy's max energy.
  */
  public int getMaxEnergy()
  {
     return maxEnergy;
  }

  /**
  * A method to obtain remaining block value.
  * @return int This returns the enemy's remaining block.
  */
  public int getBlock()
  {
       return block;
  }

  /**
  * A method to obtain the combatant's card deck.
  * @return Deck This returns the combatant's deck.
  */
  public Deck getDeck()
  {
        return deck;
  }


  //Mutator Methods

  /**
  * Sets a new remaining health value for the enemy.
  * @param amount A value to update remaining health.
  */
  public void altHealth(int amount)
  {
      if (amount > block)
      {
           remainingHealth -= (amount - block);
           block = 0;
      }
      else if (amount < 0)
      {
        remainingHealth -= (amount);
      }
      else
      {
          if(block >= amount)
          {
               block -= amount;
          }
      }
  }

  /**
  * Sets a new remaining energy value for the enemy.
  * @param amount A value to update remaining energy.
  */
  public void altEnergy(int amount)
  {
       remainingEnergy -= amount;
  }

  /**
  * Sets a new remaining block value for the enemy.
  * @param amount A value to update remaining block.
  */
  public void altBlock(int amount)
  {
    if ((block + amount) <= 10)
    {
       block += amount;
    }
    if ((block + amount) > 10)
    {
      block = 10;
    }
  }
}
