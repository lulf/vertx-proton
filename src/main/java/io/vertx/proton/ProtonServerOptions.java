package io.vertx.proton;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.NetServerOptions;

@DataObject
public class ProtonServerOptions extends NetServerOptions {
    //TODO: Use a delegate? Override methods to change return type?
    //TODO: Config for AMQP levle heartbeating /idle-timeout? Have
    //      that on the Connection instead?


  public ProtonServerOptions() {
  }

  public ProtonServerOptions(ProtonServerOptions other) {
    super(other);
  }

  public ProtonServerOptions(JsonObject json) {
    super(json);
  }
}
