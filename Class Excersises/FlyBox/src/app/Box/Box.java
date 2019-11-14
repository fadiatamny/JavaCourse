package app.Box;

public class Box {

    private double x;
    private double y;
    private double z;

    public Box(double x , double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public class Fly
    {
        private double xFly;
        private double yFly;
        private double zFly;

        public Fly()
        {
            this.xFly = 0;
            this.yFly = 0;
            this.zFly = 0;
        }

        public void setX(double val)
        {
            if(val<xFly && val > 0)
                x=val;
        }
        public void setY(double val)
        {
            if(val<yFly && val > 0)
                y=val;
        }
        public void setZ(double val)
        {
            if(val<zFly && val > 0)
                z=val;
        }
    }
}