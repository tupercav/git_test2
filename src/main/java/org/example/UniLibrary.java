package org.example;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(String bookName) {

        System.out.println("getBook from UniLIbrary " + bookName);
    }

    public void getPen() {

        System.out.println("getPen from UniLibrary ");
    }
}
