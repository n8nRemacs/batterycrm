package com.yandex.mapkit.search;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.search.search_layer.SearchLayer;
import j.N;

/* loaded from: classes7.dex */
public interface Search {
    @N
    SearchLayer createSearchLayer(@N MapWindow mapWindow);

    @N
    SearchManager createSearchManager(@N SearchManagerType searchManagerType);

    boolean isValid();
}
