package com.gildedrose;

public class NormalItem extends Item {

  public NormalItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  protected void update() {
    sellIn = sellIn - 1;
    decreaseQuality();
    if (sellIn < 0) {
      decreaseQuality();
    }
  }

  
  
}
