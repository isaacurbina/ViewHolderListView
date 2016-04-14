package com.mac.isaac.viewholderlistview.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SrcOptions {

    @SerializedName("skip_end")
    @Expose
    private String skipEnd;
    @SerializedName("skip_abstract")
    @Expose
    private Integer skipAbstract;
    @SerializedName("skip_qr")
    @Expose
    private String skipQr;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("skip_icon")
    @Expose
    private Integer skipIcon;
    @SerializedName("skip_image_name")
    @Expose
    private Integer skipImageName;
    @SerializedName("directory")
    @Expose
    private String directory;
    @SerializedName("min_abstract_length")
    @Expose
    private String minAbstractLength;
    @SerializedName("skip_abstract_paren")
    @Expose
    private Integer skipAbstractParen;
    @SerializedName("is_wikipedia")
    @Expose
    private Integer isWikipedia;
    @SerializedName("source_skip")
    @Expose
    private String sourceSkip;
    @SerializedName("is_fanon")
    @Expose
    private Integer isFanon;
    @SerializedName("is_mediawiki")
    @Expose
    private Integer isMediawiki;
    @SerializedName("src_info")
    @Expose
    private String srcInfo;

    /**
     *
     * @return
     *     The skipEnd
     */
    public String getSkipEnd() {
        return skipEnd;
    }

    /**
     *
     * @param skipEnd
     *     The skip_end
     */
    public void setSkipEnd(String skipEnd) {
        this.skipEnd = skipEnd;
    }

    /**
     *
     * @return
     *     The skipAbstract
     */
    public Integer getSkipAbstract() {
        return skipAbstract;
    }

    /**
     *
     * @param skipAbstract
     *     The skip_abstract
     */
    public void setSkipAbstract(Integer skipAbstract) {
        this.skipAbstract = skipAbstract;
    }

    /**
     *
     * @return
     *     The skipQr
     */
    public String getSkipQr() {
        return skipQr;
    }

    /**
     *
     * @param skipQr
     *     The skip_qr
     */
    public void setSkipQr(String skipQr) {
        this.skipQr = skipQr;
    }

    /**
     *
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     *
     * @return
     *     The skipIcon
     */
    public Integer getSkipIcon() {
        return skipIcon;
    }

    /**
     *
     * @param skipIcon
     *     The skip_icon
     */
    public void setSkipIcon(Integer skipIcon) {
        this.skipIcon = skipIcon;
    }

    /**
     *
     * @return
     *     The skipImageName
     */
    public Integer getSkipImageName() {
        return skipImageName;
    }

    /**
     *
     * @param skipImageName
     *     The skip_image_name
     */
    public void setSkipImageName(Integer skipImageName) {
        this.skipImageName = skipImageName;
    }

    /**
     *
     * @return
     *     The directory
     */
    public String getDirectory() {
        return directory;
    }

    /**
     *
     * @param directory
     *     The directory
     */
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     *
     * @return
     *     The minAbstractLength
     */
    public String getMinAbstractLength() {
        return minAbstractLength;
    }

    /**
     *
     * @param minAbstractLength
     *     The min_abstract_length
     */
    public void setMinAbstractLength(String minAbstractLength) {
        this.minAbstractLength = minAbstractLength;
    }

    /**
     *
     * @return
     *     The skipAbstractParen
     */
    public Integer getSkipAbstractParen() {
        return skipAbstractParen;
    }

    /**
     *
     * @param skipAbstractParen
     *     The skip_abstract_paren
     */
    public void setSkipAbstractParen(Integer skipAbstractParen) {
        this.skipAbstractParen = skipAbstractParen;
    }

    /**
     *
     * @return
     *     The isWikipedia
     */
    public Integer getIsWikipedia() {
        return isWikipedia;
    }

    /**
     *
     * @param isWikipedia
     *     The is_wikipedia
     */
    public void setIsWikipedia(Integer isWikipedia) {
        this.isWikipedia = isWikipedia;
    }

    /**
     *
     * @return
     *     The sourceSkip
     */
    public String getSourceSkip() {
        return sourceSkip;
    }

    /**
     *
     * @param sourceSkip
     *     The source_skip
     */
    public void setSourceSkip(String sourceSkip) {
        this.sourceSkip = sourceSkip;
    }

    /**
     *
     * @return
     *     The isFanon
     */
    public Integer getIsFanon() {
        return isFanon;
    }

    /**
     *
     * @param isFanon
     *     The is_fanon
     */
    public void setIsFanon(Integer isFanon) {
        this.isFanon = isFanon;
    }

    /**
     *
     * @return
     *     The isMediawiki
     */
    public Integer getIsMediawiki() {
        return isMediawiki;
    }

    /**
     *
     * @param isMediawiki
     *     The is_mediawiki
     */
    public void setIsMediawiki(Integer isMediawiki) {
        this.isMediawiki = isMediawiki;
    }

    /**
     *
     * @return
     *     The srcInfo
     */
    public String getSrcInfo() {
        return srcInfo;
    }

    /**
     *
     * @param srcInfo
     *     The src_info
     */
    public void setSrcInfo(String srcInfo) {
        this.srcInfo = srcInfo;
    }

}
