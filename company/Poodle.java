package com.company;

public class Poodle extends Dog {

    protected String m_numberOfPonyTails;

    public Poodle(String m_name, String m_favoriteDogFood, String m_numberOfPonyTails) {
        super(m_name, m_favoriteDogFood);
        this.m_numberOfPonyTails = m_numberOfPonyTails;
    }
    @Override
    public void bark () {
        System.out.println("hav hav");
    }

    @Override
    public String toString() {
        return "Poodle{" +
                "m_numberOfPonyTails='" + m_numberOfPonyTails + '\'' +
                ", m_favoriteDogFood='" + m_favoriteDogFood + '\'' +
                ", m_name='" + m_name + '\'' +
                '}';
    }
}
