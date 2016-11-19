package com.abasscodes.gifmoji.model.pojos;

/**
 * Created by C4Q on 11/19/16.
 */

public class Data {

    private String type;
    private String id;
    private String url;
    private String imageOriginalUrl;
    private String imageUrl;
    private String imageMp4Url;

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The imageOriginalUrl
     */
    public String getImageOriginalUrl() {
        return imageOriginalUrl;
    }

    /**
     *
     * @param imageOriginalUrl
     * The image_original_url
     */
    public void setImageOriginalUrl(String imageOriginalUrl) {
        this.imageOriginalUrl = imageOriginalUrl;
    }

    /**
     *
     * @return
     * The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     * The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     * The imageMp4Url
     */
    public String getImageMp4Url() {
        return imageMp4Url;
    }

    /**
     *
     * @param imageMp4Url
     * The image_mp4_url
     */
    public void setImageMp4Url(String imageMp4Url) {
        this.imageMp4Url = imageMp4Url;
    }

}