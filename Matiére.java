
package TP;

public class Matiere {
	// attributes
		private String nom ;
		private int coeff ;
		private float n1=0, n2=0, n3=0 ;
		
		// constructor
		public Matiere(String nom , int coeff) {
			this.nom = nom;
			this.coeff = coeff;
		}
		
		// getters
		public String getNom() {
			return nom ;
		}
		public int getCoeff() {
			return coeff;
		}
		
		public float getNote1() {
			return n1;
		}

		public float getNote2() {
			return n2;
		}

		public float getNote3() {
			return n3;
		}

		// setters
		public void setNote1(float note1) {
			this.n1 = note1;
		}
		public void setNote2(float note2) {
			this.n2 = note2;
		}
		public void setNote3(float note3) {
			this.n3 = note3;
		}
		
		
	}
