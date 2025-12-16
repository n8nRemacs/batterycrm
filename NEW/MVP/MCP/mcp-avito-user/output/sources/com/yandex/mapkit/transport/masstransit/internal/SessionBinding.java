package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class SessionBinding implements Session {
    private final NativeObject nativeObject;

    public SessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session
    public native void cancel();

    @Override // com.yandex.mapkit.transport.masstransit.Session
    public native void retry(@N Session.RouteListener routeListener);
}
