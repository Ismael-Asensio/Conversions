public class CalConvD  implements CalD {
    @Override
    public double KMTM(double x) {
        return (x*1000);
    }
    @Override
    public double MTTKM(double y) {
       return (y/1000);
    }
    @Override
    public double MLLTKM(double z) {
      return (z*1.609);
    }

    @Override
    public double KMTMLL(double x) {
        return (x/1.609);
    }
    @Override
    public double MLLTMT(double z) {
       return (z*1609.34);
    }
    @Override
    public double MTTMLL(double y) {
      return (y/1609.34);
    }
    
    
}