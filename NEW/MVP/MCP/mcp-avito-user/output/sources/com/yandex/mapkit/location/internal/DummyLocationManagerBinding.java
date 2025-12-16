package com.yandex.mapkit.location.internal;

import com.yandex.mapkit.location.DummyLocationManager;
import com.yandex.mapkit.location.Location;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class DummyLocationManagerBinding extends LocationManagerBinding implements DummyLocationManager {
    public DummyLocationManagerBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.location.DummyLocationManager
    public native void setLocation(@N Location location);
}
