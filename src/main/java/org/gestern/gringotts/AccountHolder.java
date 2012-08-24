package org.gestern.gringotts;

import org.bukkit.configuration.serialization.ConfigurationSerializable;


/**
 * An account holder. 
 * Can be a player or another type of entity able to partiticapte in the economy, for instance a faction.
 * 
 * To function correctly within Gringotts, implementors must provide a working equals and hashCode method. 
 * 
 * @author jast
 *
 */
public interface AccountHolder {
    /** 
     * Return name of the account holder.
     * 
     * @return name of the account holder
     */
    String getName();

    /** 
     * Send message to the account holder. 
     * @param message to send
     * */
    void sendMessage(String message);

    int hashCode();
    boolean equals(Object other);
}