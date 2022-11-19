package no4;

import no3.Mahasiswa;
public class MahasiswaNode {
    private Mahasiswa data;
    private MahasiswaNode next;

    public MahasiswaNode(Mahasiswa data, MahasiswaNode next) {
        this.data = data;
        this.next = next;
    }

    public Mahasiswa getData() {
        return data;
    }

    public void setData(Mahasiswa data) {
        this.data = data;
    }

    public MahasiswaNode getNext() {
        return next;
    }

    public void setNext(MahasiswaNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
