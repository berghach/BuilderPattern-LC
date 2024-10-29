# Builder Pattern
## Definition
Builder design pattern is a creational design pattern like Factory Pattern and Abstract Factory Pattern.

**NB:** Creational design patterns are concerned with the way of creating objects. These design patterns are used when a decision must be made at the time of instantiation of a class.

## The solved issues
Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes. There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

**Too Many arguments to pass from client program to the Factory class** that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.

**Some of the parameters might be optional but in Factory pattern**, we are forced to send all the parameters and optional parameters need to send as NULL.

**If the object is heavy and its creation is complex**, then all that complexity will be part of Factory classes that is confusing.

## Resources
<a link= "https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java" >Builder Design Pattern in Java</a>

<a link= "https://www.baeldung.com/creational-design-patterns#builder" >Builder Design Pattern<a>
