package com.wt15.sfdc.upload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author weirdThinker15
 * Description		: This Class will prepare a JSON with key/value pairs indicating the details of document to be uploaded to Salesforce.
 *
 *
 */
public class ContentDocument
{
    private String ContentDocumentId;
    private String ReasonForChange;
    private String PathOnClient;

    public ContentDocument(String contentDocumentId, String reasonForChange, String pathOnClient) {
        super();
        ContentDocumentId = contentDocumentId;
        ReasonForChange = reasonForChange;
        PathOnClient = pathOnClient;
    }

    /*
     * Function		: prepareJSON
     * Description	: This will prepare a JSON with the given member fields.
     * Note			: docName,folderId are mandatory, with rest optional.
     */
    public String prepareJSON()
    {
        GsonBuilder builder = new GsonBuilder();
        Gson gs = builder.create();
        return gs.toJson(this);
    }
}
