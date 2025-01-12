package com.example.task03_mess.data;
public class People {
    private String name;
    private String lastMessage;
    private String time;
    private int unreadCount;
    private int avatarResource;

    public People(String name, String lastMessage, String time, int unreadCount, int avatarResource) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.time = time;
        this.unreadCount = unreadCount;
        this.avatarResource = avatarResource;
    }

    public String getName() {
        return name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getTime() {
        return time;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public int getAvatarResource() {
        return avatarResource;
    }
}
