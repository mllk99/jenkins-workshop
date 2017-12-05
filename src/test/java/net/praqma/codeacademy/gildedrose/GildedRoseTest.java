package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
   
    @Test
    public void too() {
        Item[] items1 = new Item[] { new Item("+5 Dexterity Vest", 10, 20),
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0), 
                new Item("Elixir of the Mongoose", 5, 7)};
        assetEquals(items[0], items[1]);
    

}
