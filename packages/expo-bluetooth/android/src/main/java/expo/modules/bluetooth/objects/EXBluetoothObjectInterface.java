package expo.modules.bluetooth.objects;

import android.os.Bundle;

import java.util.UUID;

public interface EXBluetoothObjectInterface {
  String getID();

  UUID getUUID();

  Bundle toJSON();

  EXBluetoothObject getParent();

  Peripheral getPeripheral();

  String transactionIdForOperation(String operation);
}
