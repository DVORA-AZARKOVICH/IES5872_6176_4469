package primitives;

import static primitives.Util.isZero;

public class Point {
    public final Double3 dpoint;
    public Point(double d1,double d2,double d3)
    {
        dpoint = new Double3(d1,d2,d3);
    }
    /*	public double GetX()
        {
            return dpoint.d1;
        }
        public double GetY()
        {
            return dpoint.d2;
        }
        public double GetZ()
        {
            return dpoint.d3;
        }*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (dpoint== null) {
            if (other!= null)
                return false;
        }
        else if (dpoint.d1!=other.dpoint.d1)
            return false;
        else if (dpoint.d2!=other.dpoint.d2)
            return false;
        else if (dpoint.d3!=other.dpoint.d3)
            return false;
        return true;
    }
    @Override
    public String toString(){
        return String.format("Point: "+ dpoint.toString());
    }

    public Vector subtract(Point p2){
        double x = p2.dpoint.d1-this.dpoint.d1;
        double y = p2.dpoint.d2-this.dpoint.d2;
        double z = p2.dpoint.d3-this.dpoint.d3;
        Vector newVector = new Vector(x,y,z);
        return newVector;
    }
    //add function
    public 	Point add (Point p2){
        double x = p2.dpoint.d1+this.dpoint.d1;
        double y = p2.dpoint.d2+this.dpoint.d2;
        double z = p2.dpoint.d3+this.dpoint.d3;
        Point newpoint = new Point(x,y,z);
        return newpoint;

    }
    //distance function
    public double distanceSquared(Point p2){
        double x = p2.dpoint.d1-this.dpoint.d1;
        double y = p2.dpoint.d2-this.dpoint.d2;
        double z = p2.dpoint.d3-this.dpoint.d3;
        double dis = x*x+y*y+z*z;
        return dis;
    }
    public double distance(Point p)	{
        double  dis = distanceSquared(p);
        dis = Math.sqrt(dis);
        return dis;
    }

}
