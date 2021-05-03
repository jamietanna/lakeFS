/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.treeverse.lakefs.clients.api.model;

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
 * RepositoryCreation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RepositoryCreation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STORAGE_NAMESPACE = "storage_namespace";
  @SerializedName(SERIALIZED_NAME_STORAGE_NAMESPACE)
  private String storageNamespace;

  public static final String SERIALIZED_NAME_DEFAULT_BRANCH = "default_branch";
  @SerializedName(SERIALIZED_NAME_DEFAULT_BRANCH)
  private String defaultBranch;


  public RepositoryCreation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RepositoryCreation storageNamespace(String storageNamespace) {
    
    this.storageNamespace = storageNamespace;
    return this;
  }

   /**
   * Filesystem URI to store the underlying data in (e.g. \&quot;s3://my-bucket/some/path/\&quot;)
   * @return storageNamespace
  **/
  @ApiModelProperty(example = "s3://example-bucket/", required = true, value = "Filesystem URI to store the underlying data in (e.g. \"s3://my-bucket/some/path/\")")

  public String getStorageNamespace() {
    return storageNamespace;
  }


  public void setStorageNamespace(String storageNamespace) {
    this.storageNamespace = storageNamespace;
  }


  public RepositoryCreation defaultBranch(String defaultBranch) {
    
    this.defaultBranch = defaultBranch;
    return this;
  }

   /**
   * Get defaultBranch
   * @return defaultBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "main", value = "")

  public String getDefaultBranch() {
    return defaultBranch;
  }


  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryCreation repositoryCreation = (RepositoryCreation) o;
    return Objects.equals(this.name, repositoryCreation.name) &&
        Objects.equals(this.storageNamespace, repositoryCreation.storageNamespace) &&
        Objects.equals(this.defaultBranch, repositoryCreation.defaultBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, storageNamespace, defaultBranch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryCreation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storageNamespace: ").append(toIndentedString(storageNamespace)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
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

