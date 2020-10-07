package ru.netology.domain;

public class Post {
    private int id;
    private int posterId;
    private int dateOfPost;
    private int viewsCount;

    private String imageUrl;
    private String postUrl;
    private String report;
    private String addToBookmarks;

    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private TextInfo textInfo;
    private ImageInfo imageInfo;

// Добавленные поля/классы

    private int ownerId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int signerId;

    private String text;
    private String postType;

    private boolean isFriendsOnly;
    private boolean isPinned;
    private boolean isFavourite;
    private boolean isMarkedAsAds;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;

    private GeoInfo geoInfo;
    private PostSourceInfo postSourceInfo;

    //    + get/set на все поля

}
