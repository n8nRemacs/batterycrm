package com.yandex.mapkit;

import com.yandex.runtime.Error;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface GeoObjectSession {

    public interface GeoObjectListener {
        @j0
        void onGeoObjectError(@N Error error);

        @j0
        void onGeoObjectResult(@N GeoObject geoObject);
    }

    void cancel();

    void retry(@N GeoObjectListener geoObjectListener);
}
