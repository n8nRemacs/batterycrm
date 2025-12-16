package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.NativeObject;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class MasstransitRouteSerializerBinding implements MasstransitRouteSerializer {
    private final NativeObject nativeObject;

    public MasstransitRouteSerializerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer
    @P
    public native Route load(@N byte[] bArr);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer
    @N
    public native byte[] save(@N Route route);
}
