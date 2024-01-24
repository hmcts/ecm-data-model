package uk.gov.hmcts.ecm.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DocumentType {

    @JsonProperty("typeOfDocument")
    private String typeOfDocument;
    @JsonProperty("uploadedDocument")
    private UploadedDocumentType uploadedDocument;
    @JsonProperty("ownerDocument")
    private String ownerDocument;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("shortDescription")
    private String shortDescription;

    @JsonProperty("topLevelDocuments")
    private String topLevelDocuments;
    @JsonProperty("startingClaimDocuments")
    private String startingClaimDocuments;
    @JsonProperty("responseClaimDocuments")
    private String responseClaimDocuments;
    @JsonProperty("initialConsiderationDocuments")
    private String initialConsiderationDocuments;
    @JsonProperty("caseManagementDocuments")
    private String caseManagementDocuments;
    @JsonProperty("withdrawalSettledDocuments")
    private String withdrawalSettledDocuments;
    @JsonProperty("hearingsDocuments")
    private String hearingsDocuments;
    @JsonProperty("judgmentAndReasonsDocuments")
    private String judgmentAndReasonsDocuments;
    @JsonProperty("reconsiderationDocuments")
    private String reconsiderationDocuments;
    @JsonProperty("miscDocuments")
    private String miscDocuments;
    @JsonProperty("documentType")
    private String documentType;
    @JsonProperty("dateOfCorrespondence")
    private String dateOfCorrespondence;
    @JsonProperty("docNumber")
    private String docNumber;
}
