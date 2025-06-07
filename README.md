# Clickertale

---

A fast-paced Java bullet hell experience inspired by Undertale’s soul mechanics, where you fight using reflexes, tactics, and abilities.

*Note: This game was made using Replit, which at the time did not support storing assets in folders. As a result, the repo is messy.*

---

## Game Mechanics

Dodge the attacks thrown at you by the giant skeleton boss while fighting back by clicking on its head or using your soul’s special ability.

The boss evolves through multiple phases based on how much damage you've dealt — increasing attack speed and complexity.

Your final **score** depends on:
- The boss’s remaining HP (if you lose)
- Your HP (if you win)

### Example Gameplay

https://github.com/user-attachments/assets/34e56a9c-7b1b-447a-af7f-6ce654e4ae13

---

## Soul Abilities

<img src="readmeassets/ezgif-1dd95083fc743c.gif" width="50%" height="50%"/>

Choose from 7 different souls (plus a hidden 8th) — each with a unique ability:

- Determination: **Double HP / Lives**
- Bravery: **Double Damage**
- Justice: **Shoot bullets (press Space)**
- Kindness: **Slow passive healing**
- Patience: **Slow passive damage to boss**
- Integrity: **Auto-dodge (press Space to activate)**
- Perseverance: **Extended invincibility frames**
- Hate (cheatcode): **Massive HP, damage, and permanent invincibility** (0x score multiplier)

---

## Controls

- `1-7` — Select a soul
- `Left Click` — Deal damage (aim for the head)
- `Spacebar` — Use your ability (if your soul has one)

**Combat Tips:**
- Don’t move to avoid **blue** attacks
- Move to avoid **orange** attacks

### Example
<img src="readmeassets/ezgif-7aec2b3ec4965e.gif" width="30%" height="30%"/>
---

## Tech Stack

- Language: Java
- Graphics: Java AWT/Swing
- Entry point: `Main.java`

---

## How to Run

1. Make sure you have Java 17+ installed.
2. Compile and run the program:
   ```bash
   javac Main.java
   java Main

