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
 * @date 14/03/2024
 * @brief Circle Class
 */
public class Circle extends Figure {
    
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    public Circle() {
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Circulo [Raio = " + radius + ", Cor = " + super.getColor() + "]";
    }
        
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}