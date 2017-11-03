package com.hzgc.hbase.dynamicrepo;

import com.hzgc.dubbo.dynamicrepo.PictureType;
import com.hzgc.jni.FaceAttribute;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Administrator on 2017-11-3.
 */
public class DynamicPicture implements Serializable{
    /**
     * 设备ID
     */
    private String ipcId;
    /**
     * 时间戳（格式：2017-01-01 00：00：00）
     */
    private String timeStamp;
    /**
     * 文件类型
     */
    private PictureType type;
    /**
     * 日期（格式：2017-01-01）
     */
    private String date;
    /**
     * 时间段（格式：0000）(小时+分钟)
     */
    private String timeSlot;
    /**
     * 人脸属性对象
     */
    private FaceAttribute attribute;
    /**
     * 小图
     */
    private byte[] image;

    public String getIpcId() {
        return ipcId;
    }

    public void setIpcId(String ipcId) {
        this.ipcId = ipcId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public PictureType getType() {
        return type;
    }

    public void setType(PictureType type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public FaceAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(FaceAttribute attribute) {
        this.attribute = attribute;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "FaceObject{" +
                "ipcId='" + ipcId + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", type=" + type +
                ", date='" + date + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", attribute=" + attribute +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
