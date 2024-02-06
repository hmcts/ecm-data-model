package uk.gov.hmcts.ecm.common.model.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Value
@Builder(toBuilder = true)
@Jacksonized
public class FurtherEvidence {

    @JsonProperty("id")
    public String id;
    @JsonProperty("value")
    public Value value;

}