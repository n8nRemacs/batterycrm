package com.yandex.mapkit.road_events;

import com.yandex.mapkit.GeoObject;
import com.yandex.runtime.Error;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface EventInfoSession {

    public interface EventInfoListener {
        @j0
        void onEventInfoError(@N Error error);

        @j0
        void onEventInfoReceived(@N GeoObject geoObject);
    }

    void cancel();

    void retry(@N EventInfoListener eventInfoListener);
}
