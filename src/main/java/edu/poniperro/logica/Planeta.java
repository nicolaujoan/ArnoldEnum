package edu.poniperro.logica;

import java.util.EnumSet;
import java.util.Set;

public enum Planeta {
    MERCURY(3.303e+23, 2.4397e+6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27,   7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    public static final double G = 6.67400e-11;

    private double masa = 0f;
    private double radio = 0f;

    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    public static Set<Planeta> getPlanetasTerrestres() {
        return EnumSet.range(MERCURY, MARS);
    }

    public static Set<Planeta> getGigantesGaseosos() {
        return EnumSet.range(JUPITER, NEPTUNE);
    }

    public double getMasa() {
        return this.masa;
    }

    public double getRadio() {
        return this.radio;
    }

    public double gravedadSuperficie() {
        return G * getMasa() / Math.pow(getRadio(), 2);
    }

    public double pesoSuperficie(double masa) {
        return gravedadSuperficie() * masa;
    }
}
