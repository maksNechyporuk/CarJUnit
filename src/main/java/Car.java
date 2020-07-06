public class Car {
    private int Id;
    private String Make;
    private String Model;
    private int Year;
    private String Color;
    private double Price;
    private int Number;
    static int count=0;
    public Car(String Make, String Model, int Year, String Color, double Price,int Id) {
        count++;
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Color = Color;
        this.Price = Price;
        this.Id=Id;
//        this.Number=(int)Math.random()*100000;
    }
    public boolean equals(Object obj){
        Car emp = (Car) obj;
        boolean status = false;
        if(this.Make.equalsIgnoreCase(emp.Make)
                && this.Model == emp.Model
                && this.Year == emp.Year&&
                this.Color == emp.Color&&
                this.Price == emp.Price
        ){
            status = true;
        }
        return status;
    }
    public int hashCode(){
        return this.Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public int getId() {
        return Id;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public String getColor() {
        return Color;
    }

    public double getPrice() {
        return Price;
    }

    public int getNumber() {
        return Number;
    }


    public String GetMake(){
        return this.Make;
    }
    public Car GetCarByYear(int year)
    {
        if((2020-this.Year)>=year)
        {
            Print();
        return this;
    }
        return null;
    }
    public Car GetCarByYearAndPrice(int year,double price)
    {
        if(this.Year==year&&this.Price>=price) {
            Print();
            return this;
        }
        return null;
    }
    public void Print()
    { System.out.println();
        System.out.println("Make: "+ this.Make + "\nModel: "+this.Model);
        System.out.println();
    }
}