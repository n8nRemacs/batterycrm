package com.yandex.mapkit.transport.masstransit;

import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface MasstransitRouteSerializer {
    @P
    Route load(@N byte[] bArr);

    @N
    byte[] save(@N Route route);
}
