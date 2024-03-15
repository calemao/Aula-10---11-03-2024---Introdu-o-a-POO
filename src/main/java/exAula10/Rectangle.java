/*
 * Copyright (C) 2024 Christian Amsberg Janner <janner.chris15@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package exAula10;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
 * @date 13/03/2024
 * @brief Class Rectangle
 */
package exAula10;

public class Rectangle extends Figure {
    
    private double side1;
    private double side2;
    
    @Override
    public double area() {
        return this.side1 * this.side2;
    }
    
    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public Rectangle() {
    }
    
    public double getSide1() {
        return side1;
    }
    
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    
    public double getSide2() {
        return side2;
    }
    
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    @Override
    public String toString() {
        return "Rectangle [side 1 = " + side1 + ", side 2 = " + side2 + ", color = " + super.getColor() + "]";
    }
}