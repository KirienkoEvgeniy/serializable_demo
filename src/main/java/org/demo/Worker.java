package org.demo;

import java.io.*;

public class Worker  implements Serializable, Externalizable{
    private static final long serialVersionUID = 1L;

    private String login;
    private String position;
    private int sinceYear;
    private String company;

    public Worker(String login, String position, int sinceYear, String company) {
        this.login = login;
        this.position = position;
        this.sinceYear = sinceYear;
        this.company = company;
    }

    public Worker() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSinceYear() {
        return sinceYear;
    }

    public void setSinceYear(int sinceYear) {
        this.sinceYear = sinceYear;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker{");
        sb.append("login='").append(login).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", sinceYear=").append(sinceYear);
        sb.append('}');
        return sb.toString();
    }


    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getLogin());
        out.writeObject(this.getPosition());
        out.writeObject(this.getSinceYear());
        out.writeObject(this.getCompany());
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        login = (String) in.readObject();
        position = (String) in.readObject();
        sinceYear = (Integer) in.readObject();
        company = (String) in.readObject();
    }
}
