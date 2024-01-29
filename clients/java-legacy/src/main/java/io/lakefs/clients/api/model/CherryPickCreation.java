/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CherryPickCreation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CherryPickCreation {
  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_PARENT_NUMBER = "parent_number";
  @SerializedName(SERIALIZED_NAME_PARENT_NUMBER)
  private Integer parentNumber;

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force = false;


  public CherryPickCreation ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * the commit to cherry-pick, given by a ref
   * @return ref
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the commit to cherry-pick, given by a ref")

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public CherryPickCreation parentNumber(Integer parentNumber) {
    
    this.parentNumber = parentNumber;
    return this;
  }

   /**
   * When cherry-picking a merge commit, the parent number (starting from 1) with which to perform the diff. The default branch is parent 1. 
   * @return parentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When cherry-picking a merge commit, the parent number (starting from 1) with which to perform the diff. The default branch is parent 1. ")

  public Integer getParentNumber() {
    return parentNumber;
  }


  public void setParentNumber(Integer parentNumber) {
    this.parentNumber = parentNumber;
  }


  public CherryPickCreation force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * Get force
   * @return force
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CherryPickCreation cherryPickCreation = (CherryPickCreation) o;
    return Objects.equals(this.ref, cherryPickCreation.ref) &&
        Objects.equals(this.parentNumber, cherryPickCreation.parentNumber) &&
        Objects.equals(this.force, cherryPickCreation.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, parentNumber, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CherryPickCreation {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    parentNumber: ").append(toIndentedString(parentNumber)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

