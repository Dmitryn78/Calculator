public enum RomaNamber {
    I(1), II(2), III(3);
    private int value;
    RomaNamber(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
