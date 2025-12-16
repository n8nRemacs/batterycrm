package com.yandex.mapkit.transport.masstransit;

import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface RouteJamsListener {
    @j0
    void onJamsOutdated(@N Route route);

    @j0
    void onJamsUpdated(@N Route route);
}
