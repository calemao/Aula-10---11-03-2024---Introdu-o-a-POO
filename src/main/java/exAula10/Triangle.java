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
 * @author Christian Amsberg Janner <janner.chris15@Outlook.com>
 * @date 14/03/2024
 * @brief Class Triangle
 */
public class Triangle extends Figure {
    
    private double base;
    private double height;
    
    public Triangle (){
    }

    public Triangle (String color, double base, double height) {
        super (color);
        this.base = base;
        this.height = height;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double area (){
        return base * height;
    }
    
    @Override
    public String toString() { 
            return "Triângulo [base = " + base + ", altura = " + height + ", cor = " + super.getColor() + "]";
    }
    
}