package com.burakkacar.yahooweatherapplication.Models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

/**
 * Created by MuhammedBurak on 22.12.2016.
 */
@Table(name="News")
public class NewsModel extends Model
{
    /**
     * status : ok
     * source : bbc-news
     * sortBy : top
     * articles : [{"author":"BBC News","title":"George Michael: Tributes for pop superstar","description":"Tributes are paid across the world to pop superstar George Michael, who has died aged 53.","url":"http://www.bbc.co.uk/news/uk-38438080","urlToImage":"http://ichef.bbci.co.uk/news/1024/cpsprodpb/8088/production/_93140923_mediaitem93140405.jpg","publishedAt":"2016-12-26T14:49:47Z"},{"author":"BBC News","title":"George Michael: Master craftsman of pop","description":"From Wham! to his solo career, George Michael made pop work for him.","url":"http://www.bbc.co.uk/news/entertainment-arts-38436885","urlToImage":"http://ichef.bbci.co.uk/news/1024/cpsprodpb/114C4/production/_93125807_bbc.jpg","publishedAt":"2016-12-26T14:34:15Z"},{"author":"BBC News","title":"George Michael: Goring-on-Thames villagers mourn famous resident","description":"Villagers in Goring-on-Thames, Oxfordshire, where George Michael died on Christmas Day, have been paying their respects.","url":"http://www.bbc.co.uk/news/uk-38436875","urlToImage":"http://ichef.bbci.co.uk/news/1024/cpsprodpb/151D3/production/_93138468_tribute.jpg","publishedAt":"2016-12-26T14:29:33Z"},{"author":"BBC News","title":"George Michael in 'first' Carpool Karaoke","description":"In 2011 George Michael joined James Corden for a BBC Comic Relief sketch, which went on to inspire the viral hit Carpool Karaoke from James Corden's Late Late Show on CBS.","url":"http://www.bbc.co.uk/news/entertainment-arts-38435578","urlToImage":"http://ichef-1.bbci.co.uk/news/1024/cpsprodpb/17807/production/_93136269_p04mjgql.jpg","publishedAt":"2016-12-26T10:05:45Z"},{"author":"BBC News","title":"George Michael: Six songs that defined his life","description":"Six key songs that shed light on the life and career of singer George Michael.","url":"http://www.bbc.co.uk/news/entertainment-arts-38432981","urlToImage":"http://ichef.bbci.co.uk/news/1024/cpsprodpb/A319/production/_93135714_george86pa.jpg","publishedAt":"2016-12-26T07:51:30Z"},{"author":"BBC News","title":"In music: George Michael","description":"Singer George Michael has died at his home at the age of 53. Here's a look back at some of his most famous tracks.","url":"http://www.bbc.co.uk/news/entertainment-arts-38435954","urlToImage":"http://ichef-1.bbci.co.uk/news/1024/cpsprodpb/D22C/production/_93140835_p04mk39c.jpg","publishedAt":"2016-12-26T08:31:40Z"},{"author":"BBC News","title":"Russia plane crash: Huge search for bodies in Black Sea","description":"A huge search continues in Russia after a military plane with 92 people crashed into the Black Sea.","url":"http://www.bbc.co.uk/news/world-europe-38432800","urlToImage":"http://ichef-1.bbci.co.uk/news/1024/cpsprodpb/B800/production/_93140174_mediaitem93140173.jpg","publishedAt":"2016-12-26T13:40:02Z"},{"author":"BBC News","title":"Storm Conor brings snow and wind to Scotland","description":"Parts of Scotland are hit by heavy snow showers and winds of more than 80mph as Storm Conor sweeps across the north of the country.","url":"http://www.bbc.co.uk/news/uk-scotland-highlands-islands-38432483","urlToImage":"http://ichef.bbci.co.uk/news/1024/cpsprodpb/140FD/production/_93137128_danielfraser.jpg","publishedAt":"2016-12-26T12:45:01Z"},{"author":"BBC News","title":"Australia flood: Uluru national park closed after huge rainfall","description":"Record rainfall in central Australia leads to flash floods and the closure of Uluru national park.","url":"http://www.bbc.co.uk/news/world-australia-38435586","urlToImage":"http://ichef-1.bbci.co.uk/news/1024/cpsprodpb/011B/production/_93138200_0d19a974-48a5-4113-85f9-39ee4c576d9f.jpg","publishedAt":"2016-12-26T11:58:24Z"},{"author":"BBC News","title":"Christmas Day TV: 7.2m tune in for Len's Strictly farewell","description":"Strictly Come Dancing's festive special helped the BBC win the Christmas Day ratings battle.","url":"http://www.bbc.co.uk/news/uk-38435504","urlToImage":"http://ichef-1.bbci.co.uk/news/1024/cpsprodpb/3D7E/production/_93124751_de21.jpg","publishedAt":"2016-12-26T12:55:19Z"}]
     */

    private String status;
    private String source;
    private String sortBy;


    private List<ArticlesBean> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public List<ArticlesBean> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesBean> articles) {
        this.articles = articles;
    }

    @Table(name="haberlistesi")
    public static class ArticlesBean {
        /**
         * author : BBC News
         * title : George Michael: Tributes for pop superstar
         * description : Tributes are paid across the world to pop superstar George Michael, who has died aged 53.
         * url : http://www.bbc.co.uk/news/uk-38438080
         * urlToImage : http://ichef.bbci.co.uk/news/1024/cpsprodpb/8088/production/_93140923_mediaitem93140405.jpg
         * publishedAt : 2016-12-26T14:49:47Z
         */
        @Column(name = "author")
        private String author;
        @Column(name = "title")
        private String title;
        @Column(name = "description")
        private String description;
        @Column(name = "url")
        private String url;
        @Column(name = "urlToImage")
        private String urlToImage;
        @Column(name = "publishedAt")
        private String publishedAt;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }
    }


}
