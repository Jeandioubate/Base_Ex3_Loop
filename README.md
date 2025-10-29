# BaseEx3Loop

## Objectif du programme : Analyser des nombres en Java

Ce programme permet d'analyser un ou plusieurs nombres entiers afin d'indiquer s'ils sont positifs, négatifs, pairs ou impairs.

## Fonctionnement

* Lecture d'un nombre au clavier ou directement via les arguments en ligne de commande
* Gestion des saisies inattendues
* Affichage d'un message clair selon la valeur saisie

## Structure du code

Le programme contient deux parties principales:

### 1. La méthode ```main```

 * Lit les arguments de la ligne de commande ou une saisie clavier si aucun argument n'est fourni

 * Vérifie la validité des entrées avant de les analyser

### 2. La méthode ```analyzeNomber (int nomb)```

 * Détermine la nature du nombre (positif, négatif, nul)

 * Vérifie s'il est pair ou impair

 * Retourne le résultat

## Exécution du programme

###  1. Compilation

```bash
javac Base.java
```


###  2. Exécution

```bash
java Base ou java Base 5 10 -6
```

