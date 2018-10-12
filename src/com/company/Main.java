package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	1. Utwórz klasę User zawierające pola firstName oraz lastName. Dodaj także
klasę userService która będzie zawierała imitację bazy danych (np. lista).
Dodaj także metodę userService oraz findByName.
• Za pomocą addUser dodaj kilka obiektów do „bazy” a następnie za
pomocą metody findByName przeszukaj bazę w poszukiwaniu
nieistniejącego użytkownika.
• Metoda findByName powinna zwracać Optional<User>.
• Wyświetl imie użytkownika

2. Napisz implementację interfejsu Consumer która przyjmie czas w postaci obiektu String w formacie, np "08:20" i wyświetli poniższą wiadomość:

Godzina: 08
Minuty: 20

3. Przygotuj prostą metodę która przyjmuje obiekt klasy User a następnie
wyświetla informację o nim.
• Dodaj do klasy User pole typu LocalDate które będzie przechowywało
datę urodzenia użytkownika.
• Dodaj także metodę zwracającą wiek użytkownika.
• Utwórz instancję interfejsu Consumer do którego przekażesz
użytkownika i po wywołaniu metody accept wyświetlone zostaną
parametry.

4. Wykorzystując klasę User z poprzedniego zadania napisz metodę, którą za pomocą interfejsu Predicate sprawdzi, czy osoba jest pełnotelnia.

5. Napisz implementację interfejsu Predicate, która sprawdzi czy podana data odnosi się do wydarzenia z przeszłości, tzn. data < obecnadata

6. Utwórz dostawcę obiektów klasy User z losowo wypełnionymi polami.
• Zdefiniuj listę np. 5 imion i nazwisk.
• Dodaj metodę która będzie tworzyła i zwracała użytkownika z losowymi
danymi (w tym także wiek).
• Po wywołaniu funkcji get() dostawca powinien zwracać użytkownika z
losowymi polami.
• Utwórz kilku użytkowników i wyświetl ich.

7. Napisz implementację interejsu Supplier, która na podstawie obecnej daty wyświetli jaki mamy dziś dzień, np. currentData = 08.10.2018 -> Poniedziałek!

8. Utwórz instancję interfejsu Function.
• Jako parametr do funkcji przekaż String, natomiast zwracany powinien
być obiekt typu User.
• Funkcja powinna parsować przekazany String i na jego podstawie
tworzyć i zwracać obiekt typu User.
• Np.
• String text = „Jan,Nowak,18” zwróci Ci użytkownika z ustawionymi
wartościami dla poszczególnych pól.

9. Utwórz instancję interfejsu Function
• Jako parametr do funkcji przekaż String, natomiast zwracany powinien
być obiekt typu LocalDate.
• Funkcja powinna parsować przekazaną datę za pomocą dowolnego DateFormattera, np.
String string = "January 2, 2010";
DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        */
    }
}
