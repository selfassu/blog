package me.lqw.blog8.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 系统设置
 *
 * @author liqiwen
 * @version 1.0
 * @since 1.0
 */
public class BlogConfig implements Serializable {

    /**
     * 配置 id
     */
    private Integer id;

    /**
     * 配置 key
     */
    private String key;

    /**
     * 配置值
     * 存储格式为 json 串
     */
    private String value;

    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 修改时间
     */
    private LocalDateTime modifyAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(LocalDateTime modifyAt) {
        this.modifyAt = modifyAt;
    }
}
