package io.vertx.proton;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.NetClientOptions;

import java.util.List;

@DataObject
public class ProtonClientOptions extends NetClientOptions {

    private List<String> allowedSaslMechanisms = null;

    /**
     * Get the mechanisms the client is currently restricted to use.
     *
     * @return the mechanisms, or null if there is no restriction in place
     */
    public List<String> getAllowedSaslMechanisms() {
        return allowedSaslMechanisms;
    }

    /**
     * Set a restricted mechanism(s) that the client may use during the
     * SASL negotiation. If null or empty argument is given, no restriction
     * is applied and any supported mechanism can be used.
     *
     * @param mechanisms the restricted mechanism(s) or null to clear the restriction.
     */
    public void setAllowedSaslMechanisms(final List<String> saslMechanisms) {
        if(saslMechanisms == null || saslMechanisms.size() == 0) {
            this.allowedSaslMechanisms = null;
        } else {
            this.allowedSaslMechanisms = saslMechanisms;
        }
    }

    //TODO: Use a delegate? Override methods to change return type?
    //TODO: Config for AMQP levle heartbeating /idle-timeout? Have
    //      that on the Connection instead?


    public ProtonClientOptions() {
    }

    public ProtonClientOptions(ProtonClientOptions other) {
        super(other);
    }

    public ProtonClientOptions(JsonObject json) {
        super(json);
    }
}
