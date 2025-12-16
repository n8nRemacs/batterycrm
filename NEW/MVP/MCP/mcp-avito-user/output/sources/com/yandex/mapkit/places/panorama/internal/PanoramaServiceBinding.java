package com.yandex.mapkit.places.panorama.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class PanoramaServiceBinding implements PanoramaService {
    private final NativeObject nativeObject;

    public static class SearchSessionBinding implements PanoramaService.SearchSession {
        private final NativeObject nativeObject;

        public SearchSessionBinding(NativeObject nativeObject) {
            this.nativeObject = nativeObject;
        }

        @Override // com.yandex.mapkit.places.panorama.PanoramaService.SearchSession
        public native void cancel();

        @Override // com.yandex.mapkit.places.panorama.PanoramaService.SearchSession
        public native void retry(@N PanoramaService.SearchListener searchListener);
    }

    public PanoramaServiceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.panorama.PanoramaService
    @N
    public native PanoramaService.SearchSession findNearest(@N Point point, @N PanoramaService.SearchListener searchListener);
}
