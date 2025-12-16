package com.yandex.mapkit.places.panorama;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.Error;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface PanoramaService {

    public interface SearchListener {
        @j0
        void onPanoramaSearchError(@N Error error);

        @j0
        void onPanoramaSearchResult(@N String str);
    }

    public interface SearchSession {
        void cancel();

        void retry(@N SearchListener searchListener);
    }

    @N
    SearchSession findNearest(@N Point point, @N SearchListener searchListener);
}
