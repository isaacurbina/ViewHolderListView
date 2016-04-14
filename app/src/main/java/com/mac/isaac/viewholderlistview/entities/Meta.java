package com.mac.isaac.viewholderlistview.entities;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("maintainer")
    @Expose
    private Maintainer maintainer;
    @SerializedName("perl_module")
    @Expose
    private String perlModule;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("production_state")
    @Expose
    private String productionState;
    @SerializedName("dev_date")
    @Expose
    private Object devDate;
    @SerializedName("js_callback_name")
    @Expose
    private String jsCallbackName;
    @SerializedName("signal_from")
    @Expose
    private String signalFrom;
    @SerializedName("live_date")
    @Expose
    private Object liveDate;
    @SerializedName("src_id")
    @Expose
    private Integer srcId;
    @SerializedName("src_options")
    @Expose
    private SrcOptions srcOptions;
    @SerializedName("repo")
    @Expose
    private String repo;
    @SerializedName("developer")
    @Expose
    private List<Developer> developer = new ArrayList<Developer>();
    @SerializedName("tab")
    @Expose
    private String tab;
    @SerializedName("producer")
    @Expose
    private Object producer;
    @SerializedName("unsafe")
    @Expose
    private Integer unsafe;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("dev_milestone")
    @Expose
    private String devMilestone;
    @SerializedName("topic")
    @Expose
    private List<String> topic = new ArrayList<String>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("attribution")
    @Expose
    private Object attribution;
    @SerializedName("created_date")
    @Expose
    private Object createdDate;
    @SerializedName("example_query")
    @Expose
    private String exampleQuery;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("is_stackexchange")
    @Expose
    private Object isStackexchange;
    @SerializedName("designer")
    @Expose
    private Object designer;
    @SerializedName("src_domain")
    @Expose
    private String srcDomain;
    @SerializedName("src_name")
    @Expose
    private String srcName;
    @SerializedName("blockgroup")
    @Expose
    private Object blockgroup;
    @SerializedName("src_url")
    @Expose
    private Object srcUrl;

    /**
     *
     * @return
     *     The maintainer
     */
    public Maintainer getMaintainer() {
        return maintainer;
    }

    /**
     *
     * @param maintainer
     *     The maintainer
     */
    public void setMaintainer(Maintainer maintainer) {
        this.maintainer = maintainer;
    }

    /**
     *
     * @return
     *     The perlModule
     */
    public String getPerlModule() {
        return perlModule;
    }

    /**
     *
     * @param perlModule
     *     The perl_module
     */
    public void setPerlModule(String perlModule) {
        this.perlModule = perlModule;
    }

    /**
     *
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     *     The productionState
     */
    public String getProductionState() {
        return productionState;
    }

    /**
     *
     * @param productionState
     *     The production_state
     */
    public void setProductionState(String productionState) {
        this.productionState = productionState;
    }

    /**
     *
     * @return
     *     The devDate
     */
    public Object getDevDate() {
        return devDate;
    }

    /**
     *
     * @param devDate
     *     The dev_date
     */
    public void setDevDate(Object devDate) {
        this.devDate = devDate;
    }

    /**
     *
     * @return
     *     The jsCallbackName
     */
    public String getJsCallbackName() {
        return jsCallbackName;
    }

    /**
     *
     * @param jsCallbackName
     *     The js_callback_name
     */
    public void setJsCallbackName(String jsCallbackName) {
        this.jsCallbackName = jsCallbackName;
    }

    /**
     *
     * @return
     *     The signalFrom
     */
    public String getSignalFrom() {
        return signalFrom;
    }

    /**
     *
     * @param signalFrom
     *     The signal_from
     */
    public void setSignalFrom(String signalFrom) {
        this.signalFrom = signalFrom;
    }

    /**
     *
     * @return
     *     The liveDate
     */
    public Object getLiveDate() {
        return liveDate;
    }

    /**
     *
     * @param liveDate
     *     The live_date
     */
    public void setLiveDate(Object liveDate) {
        this.liveDate = liveDate;
    }

    /**
     *
     * @return
     *     The srcId
     */
    public Integer getSrcId() {
        return srcId;
    }

    /**
     *
     * @param srcId
     *     The src_id
     */
    public void setSrcId(Integer srcId) {
        this.srcId = srcId;
    }

    /**
     *
     * @return
     *     The srcOptions
     */
    public SrcOptions getSrcOptions() {
        return srcOptions;
    }

    /**
     *
     * @param srcOptions
     *     The src_options
     */
    public void setSrcOptions(SrcOptions srcOptions) {
        this.srcOptions = srcOptions;
    }

    /**
     *
     * @return
     *     The repo
     */
    public String getRepo() {
        return repo;
    }

    /**
     *
     * @param repo
     *     The repo
     */
    public void setRepo(String repo) {
        this.repo = repo;
    }

    /**
     *
     * @return
     *     The developer
     */
    public List<Developer> getDeveloper() {
        return developer;
    }

    /**
     *
     * @param developer
     *     The developer
     */
    public void setDeveloper(List<Developer> developer) {
        this.developer = developer;
    }

    /**
     *
     * @return
     *     The tab
     */
    public String getTab() {
        return tab;
    }

    /**
     *
     * @param tab
     *     The tab
     */
    public void setTab(String tab) {
        this.tab = tab;
    }

    /**
     *
     * @return
     *     The producer
     */
    public Object getProducer() {
        return producer;
    }

    /**
     *
     * @param producer
     *     The producer
     */
    public void setProducer(Object producer) {
        this.producer = producer;
    }

    /**
     *
     * @return
     *     The unsafe
     */
    public Integer getUnsafe() {
        return unsafe;
    }

    /**
     *
     * @param unsafe
     *     The unsafe
     */
    public void setUnsafe(Integer unsafe) {
        this.unsafe = unsafe;
    }

    /**
     *
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The devMilestone
     */
    public String getDevMilestone() {
        return devMilestone;
    }

    /**
     *
     * @param devMilestone
     *     The dev_milestone
     */
    public void setDevMilestone(String devMilestone) {
        this.devMilestone = devMilestone;
    }

    /**
     *
     * @return
     *     The topic
     */
    public List<String> getTopic() {
        return topic;
    }

    /**
     *
     * @param topic
     *     The topic
     */
    public void setTopic(List<String> topic) {
        this.topic = topic;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     *     The attribution
     */
    public Object getAttribution() {
        return attribution;
    }

    /**
     *
     * @param attribution
     *     The attribution
     */
    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    /**
     *
     * @return
     *     The createdDate
     */
    public Object getCreatedDate() {
        return createdDate;
    }

    /**
     *
     * @param createdDate
     *     The created_date
     */
    public void setCreatedDate(Object createdDate) {
        this.createdDate = createdDate;
    }

    /**
     *
     * @return
     *     The exampleQuery
     */
    public String getExampleQuery() {
        return exampleQuery;
    }

    /**
     *
     * @param exampleQuery
     *     The example_query
     */
    public void setExampleQuery(String exampleQuery) {
        this.exampleQuery = exampleQuery;
    }

    /**
     *
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     *     The isStackexchange
     */
    public Object getIsStackexchange() {
        return isStackexchange;
    }

    /**
     *
     * @param isStackexchange
     *     The is_stackexchange
     */
    public void setIsStackexchange(Object isStackexchange) {
        this.isStackexchange = isStackexchange;
    }

    /**
     *
     * @return
     *     The designer
     */
    public Object getDesigner() {
        return designer;
    }

    /**
     *
     * @param designer
     *     The designer
     */
    public void setDesigner(Object designer) {
        this.designer = designer;
    }

    /**
     *
     * @return
     *     The srcDomain
     */
    public String getSrcDomain() {
        return srcDomain;
    }

    /**
     *
     * @param srcDomain
     *     The src_domain
     */
    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    /**
     *
     * @return
     *     The srcName
     */
    public String getSrcName() {
        return srcName;
    }

    /**
     *
     * @param srcName
     *     The src_name
     */
    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    /**
     *
     * @return
     *     The blockgroup
     */
    public Object getBlockgroup() {
        return blockgroup;
    }

    /**
     *
     * @param blockgroup
     *     The blockgroup
     */
    public void setBlockgroup(Object blockgroup) {
        this.blockgroup = blockgroup;
    }

    /**
     *
     * @return
     *     The srcUrl
     */
    public Object getSrcUrl() {
        return srcUrl;
    }

    /**
     *
     * @param srcUrl
     *     The src_url
     */
    public void setSrcUrl(Object srcUrl) {
        this.srcUrl = srcUrl;
    }

}