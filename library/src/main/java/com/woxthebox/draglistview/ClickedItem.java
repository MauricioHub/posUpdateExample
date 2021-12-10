package com.woxthebox.draglistview;

public class ClickedItem {
    Boolean isClicked;
    Boolean isPayed;

    public ClickedItem(Boolean isClicked, Boolean isPayed) {
        this.isClicked = isClicked;
        this.isPayed = isPayed;
    }

    public Boolean getClicked() {
        return isClicked;
    }

    public Boolean getPayed() {
        return isPayed;
    }

    public void setClicked(Boolean clicked) {
        isClicked = clicked;
    }

    public void setPayed(Boolean payed) {
        isPayed = payed;
    }
}
