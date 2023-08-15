public class Conv{
   double km,mt,mll;

   public Conv(){}

   public Conv(double km, double mt, double mll){
     this.km=km;
     this.mt=mt;
     this.mll=mll;
   }

   public void setkm(double km){this.km=km;}

   public double getkm(){return km;}

   public void setmt(double mt){this.mt=mt;}

   public double getmt(){return mt;}

   public void setmll(double mll){this.mll=mll;}

   public double getmll(){return mll;}

  public void menu(){System.out.println("1.km a mll 2.mll a km 3.km a mt 4.mt a km 5.mt a mll 6.mll a mt");}

}