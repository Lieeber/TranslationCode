package com.lieeber.plugins;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lieeb on 2017/6/10 0010.
 */
public class Translation {

    /**
     * translation : ["演示"]
     * basic : {"us-phonetic":"'dɛmo","phonetic":"'deməʊ","uk-phonetic":"'deməʊ","explains":["n. 演示；样本唱片；示威；民主党员","n. (Demo)人名；(意、阿尔巴)德莫"]}
     * query : demo
     * errorCode : 0
     * web : [{"value":["演示","样本唱片","小样"],"key":"Demo"},{"value":["视频演示","望频武件演习"],"key":"Video Demo"},{"value":["文字可以环形书写","操作为一个指令","辅助立体图面绘制"],"key":"demo dwg"}]
     */

    private BasicBean basic;
    private String query;
    private int errorCode;
    private List<String> translation;
    private List<WebBean> web;

    @Override
    public String toString() {
        return basic + ", web=" + web;
    }

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<String> getTranslation() {
        return translation;
    }

    public void setTranslation(List<String> translation) {
        this.translation = translation;
    }

    public List<WebBean> getWeb() {
        return web;
    }

    public void setWeb(List<WebBean> web) {
        this.web = web;
    }

    public static class BasicBean {
        @Override
        public String toString() {
            return "explains=" + explains;
        }

        /**
         * us-phonetic : 'dɛmo
         * phonetic : 'deməʊ
         * uk-phonetic : 'deməʊ
         * explains : ["n. 演示；样本唱片；示威；民主党员","n. (Demo)人名；(意、阿尔巴)德莫"]
         */


        @SerializedName("us-phonetic")
        private String usphonetic;
        private String phonetic;
        @SerializedName("uk-phonetic")
        private String ukphonetic;
        private List<String> explains;

        public String getUsphonetic() {
            return usphonetic;
        }

        public void setUsphonetic(String usphonetic) {
            this.usphonetic = usphonetic;
        }

        public String getPhonetic() {
            return phonetic;
        }

        public void setPhonetic(String phonetic) {
            this.phonetic = phonetic;
        }

        public String getUkphonetic() {
            return ukphonetic;
        }

        public void setUkphonetic(String ukphonetic) {
            this.ukphonetic = ukphonetic;
        }

        public List<String> getExplains() {
            return explains;
        }

        public void setExplains(List<String> explains) {
            this.explains = explains;
        }

    }

    public static class WebBean {
        @Override
        public String toString() {
            return value.toString();
        }

        /**
         * value : ["演示","样本唱片","小样"]
         * key : Demo
         */


        private String key;
        private List<String> value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public List<String> getValue() {
            return value;
        }

        public void setValue(List<String> value) {
            this.value = value;
        }
    }
}
