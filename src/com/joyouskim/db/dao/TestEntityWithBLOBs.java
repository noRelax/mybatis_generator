package com.joyouskim.db.dao;

public class TestEntityWithBLOBs extends TestEntity {
    private String note;

    private byte[] memo;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public byte[] getMemo() {
        return memo;
    }

    public void setMemo(byte[] memo) {
        this.memo = memo;
    }
}