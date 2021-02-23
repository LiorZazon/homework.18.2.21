package com.company;

public class Wolf extends Dog{

    protected String m_nameOfPack;

    public Wolf(String m_name, String m_favoriteDogFood, String m_nameOfPack) {
        super(m_name, m_favoriteDogFood);
        this.m_nameOfPack = m_nameOfPack;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "m_nameOfPack='" + m_nameOfPack + '\'' +
                ", m_favoriteDogFood='" + m_favoriteDogFood + '\'' +
                ", m_name='" + m_name + '\'' +
                '}';
    }
}
