package com.jiuxin.lunbo;

import java.util.List;

/**
 * Created by Administrator on 2016/11/11.
 */
public class BannerEntity {


    /**
     * message : 1
     * bannerlist : [{"picurl":"uploads/image/20160708/1467957818.jpg","type":"1","info":"-1"},{"picurl":"uploads/image/20160708/1467959961.jpg","type":"1","info":"-1"},{"picurl":"uploads/image/20160708/1467960450.jpg","type":"1","info":"-1"},{"picurl":"uploads/image/20160708/1467956056.jpg","type":"1","info":"-1"},{"picurl":"uploads/image/20160708/1467951019.jpg","type":"1","info":"-1"}]
     * flaglist : [{"picurl":"uploads/image/20160708/1467960532.jpg","type":"1","info":"1","name":"粮油区"},{"picurl":"uploads/image/20160708/1467953707.jpg","type":"1","info":"7","name":"禽肉蛋区"},{"picurl":"uploads/image/20160708/1467960371.jpg","type":"1","info":"3","name":"蔬菜区-叶菜"},{"picurl":"uploads/image/20160708/1467955532.jpg","type":"1","info":"4","name":"水果区"},{"picurl":"uploads/image/20160708/1467960602.jpg","type":"1","info":"5","name":"蔬菜区-根茎类"}]
     * guanggaolist : [{"title":"天天特价","picurl":"uploads/image/20151208/1449556122.png","type":"1","info":"3"},{"title":"新品尝鲜","picurl":"uploads/image/20151208/1449561067.png","type":"1","info":"5"},{"title":"人气销冠","picurl":"uploads/image/20151208/1449563799.png","type":"1","info":"7"}]
     * enjoylist : [{"pid":"13","title":"黄桃","picurl":"uploads/image/20151130/1448866025.jpg","unit":"斤","price":"4.50","isshopcart":"0","salenumber":"0"},{"pid":"12","title":"鲜果礼盒","picurl":"uploads/image/20151130/1448867810.jpg","unit":"盒","price":"100.00","isshopcart":"0","salenumber":"0"},{"pid":"11","title":"蓝莓","picurl":"uploads/image/20151130/1448874885.jpg","unit":"斤","price":"1.23","isshopcart":"0","salenumber":"0"},{"pid":"10","title":"菠萝","picurl":"uploads/image/20151130/1448868426.jpg","unit":"斤","price":"22.50","isshopcart":"0","salenumber":"0"},{"pid":"9","title":"火龙果","picurl":"uploads/image/20151130/1448865802.jpg","unit":"斤","price":"18.00","isshopcart":"0","salenumber":"20"},{"pid":"8","title":"丑橘","picurl":"uploads/image/20151130/1448869792.jpg","unit":"斤","price":"7.80","isshopcart":"0","salenumber":"0"}]
     * nextpage : 3
     * ispage : 0
     */

    private String message;
    private String nextpage;
    private String ispage;
    /**
     * picurl : uploads/image/20160708/1467957818.jpg
     * type : 1
     * info : -1
     */

    private List<BannerlistBean> bannerlist;
    /**
     * picurl : uploads/image/20160708/1467960532.jpg
     * type : 1
     * info : 1
     * name : 粮油区
     */

    private List<FlaglistBean> flaglist;
    /**
     * title : 天天特价
     * picurl : uploads/image/20151208/1449556122.png
     * type : 1
     * info : 3
     */

    private List<GuanggaolistBean> guanggaolist;
    /**
     * pid : 13
     * title : 黄桃
     * picurl : uploads/image/20151130/1448866025.jpg
     * unit : 斤
     * price : 4.50
     * isshopcart : 0
     * salenumber : 0
     */

    private List<EnjoylistBean> enjoylist;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNextpage() {
        return nextpage;
    }

    public void setNextpage(String nextpage) {
        this.nextpage = nextpage;
    }

    public String getIspage() {
        return ispage;
    }

    public void setIspage(String ispage) {
        this.ispage = ispage;
    }

    public List<BannerlistBean> getBannerlist() {
        return bannerlist;
    }

    public void setBannerlist(List<BannerlistBean> bannerlist) {
        this.bannerlist = bannerlist;
    }

    public List<FlaglistBean> getFlaglist() {
        return flaglist;
    }

    public void setFlaglist(List<FlaglistBean> flaglist) {
        this.flaglist = flaglist;
    }

    public List<GuanggaolistBean> getGuanggaolist() {
        return guanggaolist;
    }

    public void setGuanggaolist(List<GuanggaolistBean> guanggaolist) {
        this.guanggaolist = guanggaolist;
    }

    public List<EnjoylistBean> getEnjoylist() {
        return enjoylist;
    }

    public void setEnjoylist(List<EnjoylistBean> enjoylist) {
        this.enjoylist = enjoylist;
    }

    public static class BannerlistBean {
        private String picurl;
        private String type;
        private String info;

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

    public static class FlaglistBean {
        private String picurl;
        private String type;
        private String info;
        private String name;

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class GuanggaolistBean {
        private String title;
        private String picurl;
        private String type;
        private String info;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

    public static class EnjoylistBean {
        private String pid;
        private String title;
        private String picurl;
        private String unit;
        private String price;
        private String isshopcart;
        private String salenumber;

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getIsshopcart() {
            return isshopcart;
        }

        public void setIsshopcart(String isshopcart) {
            this.isshopcart = isshopcart;
        }

        public String getSalenumber() {
            return salenumber;
        }

        public void setSalenumber(String salenumber) {
            this.salenumber = salenumber;
        }
    }
}
