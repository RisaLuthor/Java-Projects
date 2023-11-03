interface mammal{
  void printSpecies();
}

class Human implements mammal{
  @Override
  public void printSpecies() {
    System.out.println("This is a Human");
  }
}

class Dog implements mammal{
  @Override
  public void printSpecies() {
    System.out.println("This is a Dog");
  }
}

class Cat implements mammal{
  @Override
  public void printSpecies(){
    System.out.println("This is a Cat")
  }
}

class mammalFactory(String s){
  if("Human".equalsIgnoreCase(s)){
    return new Human();
  }
  else if("Dog".equalsIgnoreCase(s)){
    return new Dog();
  }
  else if("Cat".equalsIgnoreCase(s)){
    return new Cat();
  }
  return null;
  
}

class FactoryPatternDemo{
  public static void main(String[] args) {
    mammal human = mammalFactory.getMammal("Human");
    human.printSpecies();
    mammal dog = mammalFactory.getMammal("Dog");
    dog.printSpecies();
    mammal cat = mammalFactory.getMammal("Cat");
    cat.printSpecies();
  }
}