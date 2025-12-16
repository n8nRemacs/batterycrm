package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.Session;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface SearchManager {
    @N
    SuggestSession createSuggestSession();

    @N
    Session resolveURI(@N String str, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);

    @N
    Session searchByURI(@N String str, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);

    @N
    Session submit(@N Point point, @P Integer num, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);

    @N
    Session submit(@N String str, @N Geometry geometry, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);

    @N
    Session submit(@N String str, @N Polyline polyline, @N Geometry geometry, @N SearchOptions searchOptions, @N Session.SearchListener searchListener);
}
