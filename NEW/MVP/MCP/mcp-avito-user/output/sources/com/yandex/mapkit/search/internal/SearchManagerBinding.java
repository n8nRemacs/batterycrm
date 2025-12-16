package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Session;
import com.yandex.mapkit.search.SuggestSession;
import com.yandex.runtime.NativeObject;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class SearchManagerBinding implements SearchManager {
    private final NativeObject nativeObject;

    public SearchManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.SearchManager
    @N
    public native SuggestSession createSuggestSession();

    @Override // com.yandex.mapkit.search.SearchManager
    @N
    public native Session resolveURI(@N String str, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    @N
    public native Session searchByURI(@N String str, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    @N
    public native Session submit(@N Point point, @P Integer num, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    @N
    public native Session submit(@N String str, @N Geometry geometry, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    @N
    public native Session submit(@N String str, @N Polyline polyline, @N Geometry geometry, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);
}
