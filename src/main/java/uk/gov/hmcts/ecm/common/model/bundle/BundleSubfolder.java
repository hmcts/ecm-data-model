package uk.gov.hmcts.ecm.common.model.bundle;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@EqualsAndHashCode(callSuper = true) @JsonIgnoreProperties(ignoreUnknown = true) @Value @Builder(toBuilder = true) @Jacksonized
public record BundleSubfolder(BundleSubfolderDetails value) {

}