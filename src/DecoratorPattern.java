public class DecoratorPattern {public static void main(String[] args)
{
    Dress sportyDress = new SportyDress(new DressDecorator());
    sportyDress.assemble();
    System.out.println();

    Dress fancyDress = new FancyDress(new DressDecorator());
    fancyDress.assemble();
    System.out.println();

    Dress casualDress = new CasualDress(new DressDecorator());
    casualDress.assemble();
    System.out.println();

    Dress sportyFancyDress = new SportyDress(new FancyDress(new DressDecorator()));
    sportyFancyDress.assemble();
    System.out.println();

    Dress casualFancyDress = new CasualDress(new FancyDress(new DressDecorator()));
    casualFancyDress.assemble();
}
}
