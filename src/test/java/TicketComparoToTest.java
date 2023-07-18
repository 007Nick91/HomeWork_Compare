import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class TicketComparoToTest {

    //Test Price
    @Test
    public void ticketsTest() {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("CCC", "VVV", 1000, 9, 12);
        Ticket ticket2 = new Ticket("VVV", "SPB", 3000, 4, 11);
        Ticket ticket3 = new Ticket("CCC", "VVV", 5000, 7, 16);
        Ticket ticket4 = new Ticket("AAA", "BBB", 3000, 5, 13);
        Ticket ticket5 = new Ticket("CCC", "VVV", 8000, 3, 11);
        Ticket ticket6 = new Ticket("CCC", "VVV", 4500, 5, 17);
        Ticket ticket7 = new Ticket("CCC", "VVV", 2500, 7, 8);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);

        Ticket[] expected = {ticket1, ticket7, ticket6, ticket3, ticket5};
        Ticket[] actual = avia.search("CCC", "VVV");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ticketsTestOne() {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("CCC", "VVV", 1000, 9, 12);
        Ticket ticket2 = new Ticket("VVV", "SPB", 3000, 4, 11);
        Ticket ticket3 = new Ticket("CCC", "VVV", 5000, 7, 16);
        Ticket ticket4 = new Ticket("AAA", "BBB", 3000, 5, 13);
        Ticket ticket5 = new Ticket("CCC", "VVV", 8000, 3, 11);
        Ticket ticket6 = new Ticket("CCC", "VVV", 4500, 5, 17);
        Ticket ticket7 = new Ticket("CCC", "VVV", 2500, 7, 8);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);

        Ticket[] expected = {ticket4};
        Ticket[] actual = avia.search("AAA", "BBB");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ticketsTestNull() {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("CCC", "VVV", 1000, 9, 12);
        Ticket ticket2 = new Ticket("VVV", "SPB", 3000, 4, 11);
        Ticket ticket3 = new Ticket("CCC", "VVV", 5000, 7, 16);
        Ticket ticket4 = new Ticket("AAA", "BBB", 3000, 5, 13);
        Ticket ticket5 = new Ticket("CCC", "VVV", 8000, 3, 11);
        Ticket ticket6 = new Ticket("CCC", "VVV", 4500, 5, 17);
        Ticket ticket7 = new Ticket("CCC", "VVV", 2500, 7, 8);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = avia.search("SPB", "CCC");
        Assertions.assertArrayEquals(expected, actual);
    }


    // Test Time
    @Test
    public void sortTimeTest() {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("CCC", "VVV", 1000, 9, 12);
        Ticket ticket2 = new Ticket("VVV", "SPB", 3000, 4, 11);
        Ticket ticket3 = new Ticket("CCC", "VVV", 5000, 7, 16);
        Ticket ticket4 = new Ticket("AAA", "BBB", 3000, 5, 13);
        Ticket ticket5 = new Ticket("CCC", "VVV", 8000, 3, 11);
        Ticket ticket6 = new Ticket("CCC", "VVV", 4500, 5, 17);
        Ticket ticket7 = new Ticket("CCC", "VVV", 2500, 9, 11);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket7, ticket1, ticket5, ticket3, ticket6};
        Ticket[] actual = avia.search("CCC", "VVV", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTimeTestOne() {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("CCC", "VVV", 1000, 9, 12);
        Ticket ticket2 = new Ticket("VVV", "SPB", 3000, 4, 11);
        Ticket ticket3 = new Ticket("CCC", "VVV", 5000, 7, 16);
        Ticket ticket4 = new Ticket("AAA", "BBB", 3000, 5, 13);
        Ticket ticket5 = new Ticket("CCC", "VVV", 8000, 3, 11);
        Ticket ticket6 = new Ticket("CCC", "VVV", 4500, 5, 17);
        Ticket ticket7 = new Ticket("CCC", "VVV", 2500, 9, 11);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket2};
        Ticket[] actual = avia.search("VVV", "SPB", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTimeTestNull() {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("CCC", "VVV", 1000, 9, 12);
        Ticket ticket2 = new Ticket("VVV", "SPB", 3000, 4, 11);
        Ticket ticket3 = new Ticket("CCC", "VVV", 5000, 7, 16);
        Ticket ticket4 = new Ticket("AAA", "BBB", 3000, 5, 13);
        Ticket ticket5 = new Ticket("CCC", "VVV", 8000, 3, 11);
        Ticket ticket6 = new Ticket("CCC", "VVV", 4500, 5, 17);
        Ticket ticket7 = new Ticket("CCC", "VVV", 2500, 9, 11);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = avia.search("QQQ", "WWW", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
}
