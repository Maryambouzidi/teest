﻿package TP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Formation f1 = new Formation("stri");
	        f1.ajouter_matiere("français", 4);
	        f1.ajouter_matiere("math", 3);
	        f1.ajouter_matiere("arabe", 2);
	        
	        Etudiant e1 = new Etudiant("B130051309", "BOUZIDI", "MARYAM", f1);
	        System.out.println("la formation de  "+e1);
	        
	        Etudiant e2 = new Etudiant("B130051308", "WADIA", "Maha", f1);
	        System.out.println("la formation de "+e2);

	        
	        Etudiant e3 = new Etudiant("B130051307", "Kamel", "Souad", f1);
	        System.out.println("la formation de "+e3);
	        /*Scanner scr= new Scanner(System.in);
	        int note =scr.nextInt();
	        System.out.println("veillez saisir votr note "+note);
	      */
	        e1.ajoueter_Note(14, "français");
	        e1.ajoueter_Note(15, "français");
	        e1.ajoueter_Note(16, "français");
	        e1.ajoueter_Note(17, "math");
	        e1.ajoueter_Note(18, "math");
	        e1.ajoueter_Note(19, "math");
	        e2.ajoueter_Note(15, "math");
	        e2.ajoueter_Note(16, "math");
	        e2.ajoueter_Note(18, "math");
	        e2.ajoueter_Note(15,"français");
	        e2.ajoueter_Note(16, "français");
	        System.out.println("la moyenne de etudiant 1 est:"+e1.moyenne("français"));
	        System.out.println("la moyenne de etudiant 1 est:"+e1.moyenne("math"));
	        System.out.println("la moyenne de etudiant 2 est:"+e2.moyenne("français"));
	        System.out.println("la moyenne de etudiant 2 est:"+e2.moyenne("math"));


	        
	        
	        Groupe g1 = new Groupe(f1);
	        g1.ajouter_etudiant(e1);
	        g1.ajouter_etudiant(e2);
	        //g1.ajouter_etudiant(e3);
	        System.out.println("la moyenne generale de groupe est:"+g1.moyenne_general());

	        
	        System.out.println(g1.triParMerite());
	        //g1.triParMerite();
	 
	     }
	
	}