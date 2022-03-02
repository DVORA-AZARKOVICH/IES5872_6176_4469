package primitives;

import static primitives.Util.isZero;

public class Vector extends Point
{
    public Vector(double d1,double d2,double d3){
        super(d1,d2,d3);
        if(!this.equals(this.dpoint.ZERO))
            throw new IllegalArgumentException("Can't create the zero vector");
    }
    public Vector subtract (Vector v){
        return this.subtract(v);
    }
    public Vector add (Vector v){
        return this.add(v);
    }
    public Vector scale(double scl){
        Vector v = new Vector(this.dpoint.d1*scl,this.dpoint.d2*scl,this.dpoint.d3*scl);
        return v;
    }
    public double dotProduct(Vector v){
        return this.dpoint.d1* v.dpoint.d1+this.dpoint.d2*v.dpoint.d2+this.dpoint.d3*v.dpoint.d3;
    }
    public Vector crossProduct(Vector v) {
        double x = this.dpoint.d2*v.dpoint.d3 - this.dpoint.d3*v.dpoint.d2;
        double y = this.dpoint.d1*v.dpoint.d3-this.dpoint.d3*v.dpoint.d1;
        double z = this.dpoint.d1*v.dpoint.d2-this.dpoint.d2*v.dpoint.d1;
        Vector newv = new Vector(x,-y,z);
        return newv;

    }
    public double lengthSquared() {
        double dis = this.dpoint.d1*this.dpoint.d1+this.dpoint.d2*this.dpoint.d2+this.dpoint.d3*this.dpoint.d3;
        return dis;
    }
    public double length() {
        double dis = lengthSquared();
        return Math.sqrt(dis);
    }
    public Vector normalize() {
        double dis = length();
        Vector newv = new Vector(this.dpoint.d1/dis,this.dpoint.d2/dis,this.dpoint.d3/dis);
        return newv;
    }
    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
