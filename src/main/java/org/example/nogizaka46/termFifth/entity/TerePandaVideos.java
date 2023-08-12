package org.example.nogizaka46.termFifth.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * video
 * @author 
 */
@Data
@TableName(value = "video")
public class TerePandaVideos implements Serializable {
    @TableId(value = "id",type = IdType.INPUT)
    private String id;

    private String name;

    private String url;

    private Date time;

    private String members;

    private String groups;

    private String headerimage;

    private String team;

    private static final long serialVersionUID = 1L;
}