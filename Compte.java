

public class Compte{
      //les donnees 
        private int numero;
        private String datedouverture;
        private float montant;
        //le constructeur
        public Compte (int n,String d,float m){
            numero=n;                                               
            datedouverture=d;
            montant=m;
        
        }
        //methodes
        public void crediter(float montant){
            this.montant+=montant;

        }
        public void debiter(float montant){
             this.montant-=montant;

        }

        public void consulter(){
            System.out.println("numero de compte:"+numero  
            +"|date d'ouverture: "+datedouverture
            + "|montant: "+montant);
        }
    }

    
        class Testcompte{
            public static void main(String[] args) {
            Compte c=new Compte( 1123564, "11/04/2025",500.12f);
            c.consulter();
            c.crediter(200.12f);
            c.consulter();
            c.debiter(100.00f);
            c.consulter();
            }
        }



    
        
      
    
    
