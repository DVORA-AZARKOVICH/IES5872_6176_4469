package geometries;

import primitives.Vector;

import primitives.Point;
import primitives.Ray;

public class Plane implements Geometry {
    Point q0;
    Vector normal;



    public Plane(Vector normal2,Point q2) {
        this.normal = normal2;
        this.q0 = q2;
    }
    public Plane(Point p1,Point p2,Point p3) {
        this.q0 = p1;
        Vector v1 = (p2.subtract(p3));
        Vector v2 = (p1.subtract(p3));
        this.normal = v1.crossProduct(v2).normalize();
    }

    public Point GetQ0() {
        return q0;
    }
    public Vector getNormal() {
        return normal;
    }

    @Override
    public Vector getNormal(Point p) {
        return null;
    }
    @Override
    public String toString() {
        return "Plane [q0=" + q0 + ", normal=" + normal + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Ray))
            return false;
        Plane other = (Plane) obj;
        return this.normal.equals(other.normal)&&this.q0.equals(other.q0);
    }


}
