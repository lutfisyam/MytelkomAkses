package com.telkom.lutfi.mytelkomakses.entitas;

public class Team {
    private String nama_grup;
    private String emailTeknisi1;
    private String emailTeknisi2;

    public Team() {
    }

    public Team(String nama_grup, String emailTeknisi1, String emailTeknisi2) {
        this.nama_grup = nama_grup;
        this.emailTeknisi1 = emailTeknisi1;
        this.emailTeknisi2 = emailTeknisi2;
    }

    public String getNama_grup() {
        return nama_grup;
    }

    public void setNama_grup(String nama_grup) {
        this.nama_grup = nama_grup;
    }

    public String getEmailTeknisi1() {
        return emailTeknisi1;
    }

    public void setEmailTeknisi1(String emailTeknisi1) {
        this.emailTeknisi1 = emailTeknisi1;
    }

    public String getEmailTeknisi2() {
        return emailTeknisi2;
    }

    public void setEmailTeknisi2(String emailTeknisi2) {
        this.emailTeknisi2 = emailTeknisi2;
    }
}
