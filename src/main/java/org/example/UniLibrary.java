package org.example;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(String bookName) {

        System.out.println("getBook from UniLIbrary " + bookName);
    }

    public void getPen() {

        System.out.println("getPen from UniLibrary ");
        System.out.println("and add commit to master branch");
        System.out.println("and add 1 new commit from develop");
    }
}
