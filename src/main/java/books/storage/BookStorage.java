package books.storage;

import books.model.Book;

public class BookStorage {
    private Book[] array = new Book[10];
    int size = 0;


    public void add(Book book) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = book;


    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        System.arraycopy(array, 0,temp,0,size);
        array = temp;
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");

        }


    }

    public int getSize() {
        return size;
    }


    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().getName().equals(authorName)) {
                System.out.println(array[i]);
            }

        }


    }

    public void printBooksByGanre(String ganre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(ganre)) {
                System.out.println(array[i]);
            }

        }

    }

    public void printBooksByPriceOfRange(double min, double max) {
        for (int i = 0; i < array.length; i++) {
            Book book = array[i];
            if (book!=null && book.getPrice() >= min && book.getPrice() <= max) {
                System.out.println(book);


            }
        }


    }


}

