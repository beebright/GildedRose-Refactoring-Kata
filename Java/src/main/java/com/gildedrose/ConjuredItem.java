package com.gildedrose;

public class ConjuredItem extends Item {

  public ConjuredItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  protected void update() {
    sellIn = sellIn - 1;
    for (int i = 0; i < 2; i++) {
      decreaseQuality();
      if (sellIn < 0) {
        decreaseQuality();
      } 
    }
  }
}
