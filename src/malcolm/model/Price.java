/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malcolm.model;

/**
 *
 * @author malcolm
 */
public class Price {
    private double colorPrice;
    private double fabricPrice;
    private double sizePrice;

    public Price(double colorPrice, double fabricPrice, double sizePrice) {
        this.colorPrice = colorPrice;
        this.fabricPrice = fabricPrice;
        this.sizePrice = sizePrice;
    }

    public double getColorPrice() {
        return colorPrice;
    }

    public void setColorPrice(double colorPrice) {
        this.colorPrice = colorPrice;
    }

    public double getFabricPrice() {
        return fabricPrice;
    }

    public void setFabricPrice(double fabricPrice) {
        this.fabricPrice = fabricPrice;
    }

    public double getSizePrice() {
        return sizePrice;
    }

    public void setSizePrice(double sizePrice) {
        this.sizePrice = sizePrice;
    }

    @Override
    public String toString() {
        return "Price{" + "colorPrice=" + colorPrice + ", fabricPrice=" + fabricPrice + ", sizePrice=" + sizePrice + '}';
    }
    
    
}
