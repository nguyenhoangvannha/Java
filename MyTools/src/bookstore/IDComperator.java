/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.Comparator;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class IDComperator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getID().compareTo(o2.getID());
    }
}