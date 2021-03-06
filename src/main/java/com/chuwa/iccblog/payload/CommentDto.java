package com.chuwa.iccblog.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Api(value = "Comment model info")
public class CommentDto {
    @ApiModelProperty(value = "Comment id")
    private long id;
    @ApiModelProperty(value = "Comment name")
    @NotEmpty(message = "Name can not be null or nothing!!!!!!")
    private String name;
    @ApiModelProperty(value = "Comment email")
    @NotEmpty(message = "Email can not be null or nothing!!!!!!")
    @Email
    private String email;
    @ApiModelProperty(value = "Comment body")
    @NotEmpty
    @Size(min = 5, message = "Comment can not be null or nothing!!!!!!")
    private String body;

    public CommentDto() {
    }

    public CommentDto(String name, String email, String body) {
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public CommentDto(long id, String name, String email, String body) {
        this(name, email, body);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommentDto)) {
            return false;
        }
        CommentDto that = (CommentDto) o;
        return getId() == that.getId() && getName().equals(that.getName()) && getEmail().equals(that.getEmail()) && getBody().equals(that.getBody());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getBody());
    }
}
