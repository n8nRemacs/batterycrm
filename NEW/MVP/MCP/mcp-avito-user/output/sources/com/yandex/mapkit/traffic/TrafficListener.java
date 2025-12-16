package com.yandex.mapkit.traffic;

import j.P;
import j.j0;

/* loaded from: classes7.dex */
public interface TrafficListener {
    @j0
    void onTrafficChanged(@P TrafficLevel trafficLevel);

    @j0
    void onTrafficExpired();

    @j0
    void onTrafficLoading();
}
