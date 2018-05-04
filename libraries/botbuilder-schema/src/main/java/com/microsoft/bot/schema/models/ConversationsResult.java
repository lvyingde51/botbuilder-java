/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Conversations result.
 */
public class ConversationsResult {
    /**
     * Paging token.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * List of conversations.
     */
    @JsonProperty(value = "conversations")
    private List<ConversationMembers> conversations;

    /**
     * Get the continuationToken value.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken value.
     *
     * @param continuationToken the continuationToken value to set
     * @return the ConversationsResult object itself.
     */
    public ConversationsResult withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the conversations value.
     *
     * @return the conversations value
     */
    public List<ConversationMembers> conversations() {
        return this.conversations;
    }

    /**
     * Set the conversations value.
     *
     * @param conversations the conversations value to set
     * @return the ConversationsResult object itself.
     */
    public ConversationsResult withConversations(List<ConversationMembers> conversations) {
        this.conversations = conversations;
        return this;
    }

}