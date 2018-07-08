package com.ChaosFlurry;

public enum BackpackSlot {
    SLOT_1(1, 1509, 798, 20, 20),
    SLOT_2(2, 1550, 798, 20, 20),
    SLOT_3(3, 1591, 798, 20, 20),
    SLOT_4(4, 1632, 798, 20, 20),
    SLOT_5(5, 1673, 798, 20, 20),
    SLOT_6(6, 1714, 798, 20, 20),
    SLOT_7(7, 1755, 798, 20, 20),
    SLOT_8(8, 1796, 798, 20, 20),
    SLOT_9(9, 1837, 798, 20, 20),
    SLOT_10(10, 1878, 834, 20, 20),
    SLOT_11(11, 1509, 834, 20, 20),
    SLOT_12(12, 1550, 834, 20, 20),
    SLOT_13(13, 1591, 834, 20, 20),
    SLOT_14(14, 1632, 834, 20, 20),
    SLOT_15(15, 1673, 834, 20, 20),
    SLOT_16(16, 1714, 834, 20, 20),
    SLOT_17(17, 1755, 834, 20, 20),
    SLOT_18(18, 1796, 834, 20, 20),
    SLOT_19(19, 1837, 834, 20, 20),
    SLOT_20(20, 1878, 834, 20, 20),
    SLOT_21(11, 1509, 870, 20, 20),
    SLOT_22(12, 1550, 870, 20, 20),
    SLOT_23(13, 1591, 870, 20, 20),
    SLOT_24(14, 1632, 870, 20, 20),
    SLOT_25(15, 1673, 870, 20, 20),
    SLOT_26(16, 1714, 870, 20, 20),
    SLOT_27(17, 1755, 870, 20, 20),
    SLOT_28(18, 1796, 870, 20, 20);
    
    private final int slotNumber;
    private final int x;
    private final int y;
    private final int w;
    private final int h;
    
    BackpackSlot(int slotNumber, int x, int y, int w, int h) {
        this.slotNumber = slotNumber;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    public int getSlotNumber() {
        return slotNumber;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getW() {
        return w;
    }
    
    public int getH() {
        return h;
    }
}
