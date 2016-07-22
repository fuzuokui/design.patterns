package com.builder;

/**
 * @author 傅作魁（zuokuifu@creditease.cn）
 * @description
 * @since 2016/7/22 11:53
 */
public class Developer {

    private String computer;
    private String pen;
    private String book;
    private String phone;
    private String gun;

    public static class Builder{

        private String computer;
        private String pen;
        private String book;
        private String phone;
        private String gun;

        public Builder( String computer){
            this.computer = computer;
        }

        public Builder setPen( String pen){
            this.pen = pen;
            return this;
        }

        public Builder setBook( String book){
            this.book = book;
            return this;
        }

        public Builder setPhone( String phone){
            this.phone = phone;
            return this;
        }

        public Builder setGun( String gun){
            this.gun = gun;
            return this;
        }

        public Developer build(){
            return new Developer( this);
        }

    }

    Developer(Builder builder){
        this.computer = builder.computer;
        this.pen = builder.pen;
        this.book = builder.book;
        this.phone = builder.phone;
        this.gun = builder.gun;
    }

    public String getComputer() {
        return computer;
    }

    public String getPen() {
        return pen;
    }

    public String getBook() {
        return book;
    }

    public String getPhone() {
        return phone;
    }

    public String getGun() {
        return gun;
    }
}
