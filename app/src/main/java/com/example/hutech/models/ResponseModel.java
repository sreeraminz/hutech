package com.example.hutech.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResponseModel
{
    private ArrayList<Components> components;

    private String success;

    public ArrayList<Components> getComponents ()
    {
        return components;
    }

    public void setComponents (ArrayList<Components> components)
    {
        this.components = components;
    }

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [components = "+components+", success = "+success+"]";
    }

    public class Components
    {
        public ArrayList<StaticBanner> StaticBanner;

        @SerializedName("categorydata")
        private ArrayList<Categorydata> categorydata;

        @SerializedName("AdsBanner")
        private ArrayList<AdsBanner> adsBanners;

        public ArrayList<AdsBanner> getAdsBanners() {
            return adsBanners;
        }

        public void setAdsBanners(ArrayList<AdsBanner> adsBanners) {
            this.adsBanners = adsBanners;
        }

        public ArrayList<Categorydata> getCategoryData() {
            return categorydata;
        }

        public void setCategoryData(ArrayList<Categorydata> categoryData) {
            this.categorydata = categoryData;
        }

        private String name;

        public ArrayList<StaticBanner>  getStaticBanner ()
        {
            return StaticBanner;
        }

        public void setStaticBanner (ArrayList<StaticBanner>  StaticBanner)
        {
            this.StaticBanner = StaticBanner;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [StaticBanner = "+StaticBanner+", name = "+name+"]";
        }

        public class AdsBanner
        {
            private String banner_alt;

            private String banner_id;

            private String url_type;

            private String banner_name;

            private String banner_image;

            private String url_id;

            private String banner_description;

            public String getBanner_alt ()
            {
                return banner_alt;
            }

            public void setBanner_alt (String banner_alt)
            {
                this.banner_alt = banner_alt;
            }

            public String getBanner_id ()
            {
                return banner_id;
            }

            public void setBanner_id (String banner_id)
            {
                this.banner_id = banner_id;
            }

            public String getUrl_type ()
            {
                return url_type;
            }

            public void setUrl_type (String url_type)
            {
                this.url_type = url_type;
            }

            public String getBanner_name ()
            {
                return banner_name;
            }

            public void setBanner_name (String banner_name)
            {
                this.banner_name = banner_name;
            }

            public String getBanner_image ()
            {
                return banner_image;
            }

            public void setBanner_image (String banner_image)
            {
                this.banner_image = banner_image;
            }

            public String getUrl_id ()
            {
                return url_id;
            }

            public void setUrl_id (String url_id)
            {
                this.url_id = url_id;
            }

            public String getBanner_description ()
            {
                return banner_description;
            }

            public void setBanner_description (String banner_description)
            {
                this.banner_description = banner_description;
            }

            @Override
            public String toString()
            {
                return "ClassPojo [banner_alt = "+banner_alt+", banner_id = "+banner_id+", url_type = "+url_type+", banner_name = "+banner_name+", banner_image = "+banner_image+", url_id = "+url_id+", banner_description = "+banner_description+"]";
            }
        }

        public class Categorydata
        {
            private String category_description;

            private String category_picture;

            private String category_name;

            private String category_id;

            public String getCategory_description ()
            {
                return category_description;
            }

            public void setCategory_description (String category_description)
            {
                this.category_description = category_description;
            }

            public String getCategory_picture ()
            {
                return category_picture;
            }

            public void setCategory_picture (String category_picture)
            {
                this.category_picture = category_picture;
            }

            public String getCategory_name ()
            {
                return category_name;
            }

            public void setCategory_name (String category_name)
            {
                this.category_name = category_name;
            }

            public String getCategory_id ()
            {
                return category_id;
            }

            public void setCategory_id (String category_id)
            {
                this.category_id = category_id;
            }

            @Override
            public String toString()
            {
                return "ClassPojo [category_description = "+category_description+", category_picture = "+category_picture+", category_name = "+category_name+", category_id = "+category_id+"]";
            }
        }

        public class StaticBanner
        {
            private String banner_alt;

            private String banner_id;

            private String url_type;

            private String banner_name;

            private String banner_image;

            private String url_id;

            private String banner_description;

            public String getBanner_alt ()
            {
                return banner_alt;
            }

            public void setBanner_alt (String banner_alt)
            {
                this.banner_alt = banner_alt;
            }

            public String getBanner_id ()
            {
                return banner_id;
            }

            public void setBanner_id (String banner_id)
            {
                this.banner_id = banner_id;
            }

            public String getUrl_type ()
            {
                return url_type;
            }

            public void setUrl_type (String url_type)
            {
                this.url_type = url_type;
            }

            public String getBanner_name ()
            {
                return banner_name;
            }

            public void setBanner_name (String banner_name)
            {
                this.banner_name = banner_name;
            }

            public String getBanner_image ()
            {
                return banner_image;
            }

            public void setBanner_image (String banner_image)
            {
                this.banner_image = banner_image;
            }

            public String getUrl_id ()
            {
                return url_id;
            }

            public void setUrl_id (String url_id)
            {
                this.url_id = url_id;
            }

            public String getBanner_description ()
            {
                return banner_description;
            }

            public void setBanner_description (String banner_description)
            {
                this.banner_description = banner_description;
            }

            @Override
            public String toString()
            {
                return "ClassPojo [banner_alt = "+banner_alt+", banner_id = "+banner_id+", url_type = "+url_type+", banner_name = "+banner_name+", banner_image = "+banner_image+", url_id = "+url_id+", banner_description = "+banner_description+"]";
            }
        }
    }
}
