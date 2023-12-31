package org.example.nogizaka46.termFifth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "blog")
public class TerePandaBlogs {

    @TableId(value = "id",type = IdType.INPUT)
    private String id;

    private Date date;

    private String title;
    
    private String filename;
}
