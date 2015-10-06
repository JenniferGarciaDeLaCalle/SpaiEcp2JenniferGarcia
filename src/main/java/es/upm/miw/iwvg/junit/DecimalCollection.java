package es.upm.miw.iwvg.junit;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<Double>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }
    public double decimalMenor(){
        double lower = Double.POSITIVE_INFINITY;
        for (double item : this.collection) {
            if (item < lower) {
                lower = item;
            }
        }
        return lower;
    }    

    public double mediaLista(){
        double suma = 0;
        for (double item : this.collection) {
            suma += item;
        }
        return suma / this.size();
    }

}
