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
import java.util.*;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
 * @date 14/03/2024
 * @brief Class Area_de_teste
 */
import java.util.Scanner;

public class TestArea {

   public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       while (true) {
           System.out.println();
           System.out.println("Escolha uma figura:");
           System.out.println("1 - Quadrado");
           System.out.println("2 - Triangulo");
           System.out.println("3 - Circulo");
           System.out.println("4 - Retangulo");
           System.out.println("0 - Sair");

           int option = scanner.nextInt();
            
   switch (option) {
               case 0:
                   return;
               case 1:
                   System.out.println("Digite a cor do quadrado:");
                   String colorS = scanner.next();
                   scanner.nextLine();
                   System.out.println("Digite o lado do quadrado:");
                   double sideS = scanner.nextDouble();
                   Square square = new Square();
                   square.setColor(colorS);
                   square.setSide1(sideS);
                   System.out.println("Figura criada: " + square);
                   break;
               case 2:
                   System.out.println("Digite a cor do triângulo:");
                   String colorT = scanner.next();
                   scanner.nextLine();
                   System.out.println("Digite a base do triângulo:");
                   double baseT = scanner.nextDouble();
                   System.out.println("Digite a altura do triângulo:");
                   double heightT = scanner.nextDouble();
                   Triangle triangle = new Triangle(colorT, baseT, heightT);
                   System.out.println("Figura criada: " + triangle);
                   break;
               case 3:
                   System.out.println("Digite a cor do círculo:");
                   String colorC = scanner.next();
                   scanner.nextLine();
                   System.out.println("Digite o raio do círculo:");
                   double radiusC = scanner.nextDouble();
                   Circle circle = new Circle(colorC, radiusC);
                   System.out.println("Figura criada: " + circle);
                   break;
               case 4:
                   System.out.println("Digite a cor do retângulo:");
                   String colorR = scanner.next();
                   scanner.nextLine();
                   System.out.println("Digite o lado 1 do retângulo:");
                   double side1R = scanner.nextDouble();
                   System.out.println("Digite o lado 2 do retângulo:");
                   double side2R = scanner.nextDouble();
                   Rectangle rectangle = new Rectangle(colorR, side1R, side2R);
                   System.out.println("Figura criada: " + rectangle);
                   break;
               default:
                   System.out.println("Opção inválida.");
                   continue;
           }
       }
   }
}