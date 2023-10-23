// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CafeFactory factory = new CafeCarameloFactory();
        Cafe cafe = factory.crearCafe();
        System.out.println(cafe.getDescription() + " - Precio: $" + cafe.getCosto());
    }
}
// paso 1: crear una interfaz de producto
interface Cafe {
    String getDescription();
    double getCosto();
}
// implementar productos concretos
class CafeSimple implements Cafe{
    @Override
    public String getDescription(){ return "Cafe simple";}
    @Override
    public double getCosto(){ return 50;}
}
class CafeConLeche implements Cafe{
    @Override
    public String getDescription(){ return "Cafe con leche";}
    @Override
    public double getCosto(){ return 60;}
}
class CafeMocha implements Cafe{
    @Override
    public String getDescription(){ return "Cafe mocha";}
    @Override
    public double getCosto(){ return 70;}

}
class CafeConCaramelo implements Cafe{
    @Override
    public String getDescription(){ return "Cafe con caramelo";}
    @Override
    public double getCosto(){ return 80;}
}
// crear la interfaz factory

interface CafeFactory{
    Cafe crearCafe();
}
// paso 4: implementar los factories concretos
class CafeSimpleFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {return new CafeSimple();}
}

class CafeConLecheFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {return new CafeConLeche();}
}

class CafeMochaFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {return new CafeMocha();}
}
class CafeCarameloFactory implements CafeFactory{
    @Override
    public Cafe crearCafe(){return new CafeConCaramelo();}
}