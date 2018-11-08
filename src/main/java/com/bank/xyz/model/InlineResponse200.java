package com.bank.xyz.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-11-08T07:00:28.455Z")

public class InlineResponse200   {
  private String id = null;

  private Integer zip = null;

  public InlineResponse200 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse200 zip(Integer zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @ApiModelProperty(value = "")
  public Integer getZip() {
    return zip;
  }

  public void setZip(Integer zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.id, inlineResponse200.id) &&
        Objects.equals(this.zip, inlineResponse200.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

