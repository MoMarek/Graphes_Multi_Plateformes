/* ==========================================
 * GrapheMultiPlateforme : a free Java graph-theory library
 * ==========================================
 * 
 * salmuz : Carranza Alarcon Yonatan Carlos
 * 
 * (C) Copyright 2013, by salmuz and Contributors.
 * 
 * Project Info:  https://github.com/salmuz/Graphes_Multi_Plateformes
 * Project Creator:  salmuz (https://www.assembla.com/spaces/salmuz-java) 
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc.,
 * 
 * ------------------
 * Point.java
 * ------------------
 * (C) Copyright 2013, by salmuz and Contributors
 *
 * Original Author: Carranza Alarcon Yonatan Carlos
 * Contributor(s):  Coz Velasquez Antonio
 * 					Kalil DAHER MOHAMED
 *                  Aden Nouh Abdirazak
 * Changes
 * -------
 * 20/01/13 : Version 01;
 *
 */
package fr.edu.bp.m1info.structure.geometric.plane;

import fr.edu.bp.m1info.structure.geometric.Point;

 /*nous avons une class appelle Point2D et qui herite certaine methode de la class Point*/
public class Point2D implements Point {

    private double x;
    private double y;


      /*@parameter double x, double y cette methode contient 2 parameter
           * et les deux parameter  serons herité de la class point */
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

     public Point2D(int x, int y) {
         this.x = x;
         this.y = y;
     }

     /*  @return elle retourn  x
* cette methode permette de recupére le contenu du variable x*/
    public double getX() {
        return x;
    }
       /* @parameter x
   * cette methode permette de modifier le contenu du variable x*/
    public void setX(double x) {
        this.x = x;
    }
        /*  @return elle retourn y
        * cette methode permette de recupére le contenu du variable y*/
    public double getY() {
        return y;
    }

  /*
   * cette methode permette de modifier le contenu du variable y
   * @parameter y
   * */
    public void setY(double y) {
        this.y = y;
    }
        /*  @return elle retourn z
        * cette methode permette de recupére le contenu du variable z*/
    public double getZ() {
        return 0.0;
    }
        /* @parameter z
   * cette methode permette de modifier le contenu du variable z*/
    public void setZ(double z) {}


    @Override
    public String toString() {
        return "( X : "+this.x +", Y : "+this.y+" )";
    }
}
