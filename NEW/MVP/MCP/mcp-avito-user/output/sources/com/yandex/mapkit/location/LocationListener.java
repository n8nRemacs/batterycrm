package com.yandex.mapkit.location;

import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface LocationListener {
    @j0
    void onLocationStatusUpdated(@N LocationStatus locationStatus);

    @j0
    void onLocationUpdated(@N Location location);
}
