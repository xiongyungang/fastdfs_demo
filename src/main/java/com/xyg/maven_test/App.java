package com.xyg.maven_test;

import java.io.IOException;

import org.csource.common.MyException;
import org.csource.fastdfs.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
        String result=null;
        try {
            TrackerClient trackerClient = null;
            TrackerServer trackerServer = null;
            StorageServer storageServer = null;
            StorageClient1 storageClient = null;

            ClientGlobal.init("src/main/resources/fdfs.properties");
            trackerClient = new TrackerClient();
            trackerServer = trackerClient.getConnection();
            storageClient = new StorageClient1(trackerServer, storageServer);
            result = storageClient.upload_file1("E:\\2.jpg", "jpg", null);
            System.out.printf(result);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (MyException e) {
            e.printStackTrace();
        }
    }
}
