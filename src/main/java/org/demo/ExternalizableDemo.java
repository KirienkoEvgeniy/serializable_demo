package org.demo;

import java.io.*;

public class ExternalizableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Worker worker = new Worker("log", "assist", 12, "comp11");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//        FileOutputStream fileOutputStream = new FileOutputStream();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(worker);
        objectOutputStream.close();


//        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Username\\Desktop\\save.ser");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Worker workerTest = (Worker) objectInputStream.readObject();
        System.out.println(workerTest);
        objectInputStream.close();
    }
}
