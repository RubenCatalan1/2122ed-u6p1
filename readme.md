# UD6 - Pràctica 1 - Refactoritzem

* [1. Realitza els següents canvis al codi](#1-realitza-els-següents-canvis-al-codi)
* [2. **Refactoritza** el codi font de la següent forma: ( Fes les captures de totes les finestres que ixen)](#2-refactoritza-el-codi-font-de-la-següent-forma--fes-les-captures-de-totes-les-finestres-que-ixen)
* [3. En el mètode `main()`, **refactoritza**](#3-en-el-mètode-main-refactoritza)
* [4. Executa el programa i fes una captura en consola](#4-executa-el-programa-i-fes-una-captura-en-consola)
* [5. Fes una captura del codi font resultant després de refactoritzar](#5-fes-una-captura-del-codi-font-resultant-després-de-refactoritzar)

Realitza un *fork* del projecte que es troba a: <https://github.com/arturocandela/2122ed-u6p1>. Una vegada realitzat, crea una nova branca que s'anomene **teunomcognom**  i comprova que pots executar-lo a **eclipse**. Una vegada ho tingues, realitza les tasques següents.

> Cada tasca ha d'estar com a mínim en un commit diferent i la branca **teunomcognom** ha de pujar-se al teu repositori nou creat.
> La entrega es farà adjuntant l'enllaç al repostori a l'activitat i adjuntant el pdf amb les captures demandes / text a l'activitat.

## 1. Realitza els següents canvis al codi

* Reanomena el paquet `ed.arturo` a `ed.<elteunom>`
* Reanomena les cadenes que es troben definides al mètode `main` de la classe `School`.

> Executa el codi i fes una captura del resultat en consola.

Resultado en consola de ejecutar el código sin modificarlo:

![Captura del resultado del codigo sin modificar](/resources/images/1-1a.png)

Resultado en consola tras modificar las cadenas para que muestre mi información:

![Captura del resultado del codigo tras realizar la actividad 1](/resources/images/1-1b.png)

## 2. **Refactoritza** el codi font de la següent forma: ( Fes les captures de totes les finestres que ixen)

Canvia el nom dels atributs de la classe `Persona`. 

> **Nota:** polsa en `options` perquè es canvie també el nom en les cadenes lierals on apareixen eixes variables:

![Refactor Options Image](md_media/refactor.png)

* n -> nom
* c -> cognoms
* a -> any
* cl -> cicle formatiu

Canvia el nom de les classes:

* School -> Intitut
* Persona -> Alumne

Resultado una vez realizados los cambios:

![Captura del resultado tras realizar Actividad2](/resources/images/1-2.png)

## 3. En el mètode `main()`, **refactoritza**

Extrau les cadenes i números a constants de classe amb els següents noms: (Fes **captures** de totes les finestres que ixen)

"Arturo" -> `NOM_ALUMNE`

![Convertimos "Ruben" en constante paso 1 ](/resources/images/1-3a.png)

![Convertimos "Ruben" en constante paso 2 ](/resources/images/1-3b.png)

"Candela" -> `COGNOMS_ALUMNE`

![Convertimos "Catalan" en constante paso 1 ](/resources/images/1-3c.png)

![Convertimos "Catalan" en constante paso 2 ](/resources/images/1-3d.png)


"1º DAM/DAW" -> `CICLE_FORMATIU`

![Convertimos "1º DAW" en constante paso 1 ](/resources/images/1-3e.png)

![Convertimos "1º DAW" en constante paso 2 ](/resources/images/1-3f.png)


2019 -> `ANY`

![Convertimos "2021" en constante paso 1 ](/resources/images/1-3g.png)

![Convertimos "2021" en constante paso 2 ](/resources/images/1-3h.png)



## 4. Executa el programa i fes una captura en consola

( D'aquest apartat no es necessari fer un commit a menys que faltara algo del commit anterior)

## 5. Fes una captura del codi font resultant després de refactoritzar

( D'aquest apartat no es necessari fer un commit a menys que faltara algo del commit anterior)
