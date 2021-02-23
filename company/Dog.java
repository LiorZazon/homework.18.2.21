package com.company;

public class Dog extends Animal {

    protected String m_favoriteDogFood;

    public Dog(String m_name, String m_favoriteDogFood) {
        super(m_name);
        this.m_favoriteDogFood = m_favoriteDogFood;
    }

    public void bark() {
        System.out.println("woof, woof!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "m_favoriteDogFood='" + m_favoriteDogFood + '\'' +
                ", m_name='" + m_name + '\'' +
                '}';
    }
}



