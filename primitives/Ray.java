package primitives;

import static primitives.Util.isZero;

public class Ray {
    Point p;
    Vector v;
    public Ray(Vector v2, Point p2) {
        p = new Point(p2.dpoint.d1,p2.dpoint.d2,p2.dpoint.d3);
        Vector v3 = v2.normalize();
        v = new Vector(v3.dpoint.d1,v3.dpoint.d2,v3.dpoint.d3);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Ray))
            return false;
        Ray other = (Ray) obj;
        return p.equals(other.p)&&v.equals(other.v);
    }

    @Override
    public String toString()
    {
        return v.toString()+" "+p.toString();
    }


}
