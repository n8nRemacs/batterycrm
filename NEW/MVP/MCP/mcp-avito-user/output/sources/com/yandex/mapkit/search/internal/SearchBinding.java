package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.search.Search;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchManagerType;
import com.yandex.mapkit.search.search_layer.SearchLayer;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class SearchBinding implements Search {
    private final NativeObject nativeObject;

    public SearchBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.Search
    @N
    public native SearchLayer createSearchLayer(@N MapWindow mapWindow);

    @Override // com.yandex.mapkit.search.Search
    @N
    public native SearchManager createSearchManager(@N SearchManagerType searchManagerType);

    @Override // com.yandex.mapkit.search.Search
    public native boolean isValid();
}
