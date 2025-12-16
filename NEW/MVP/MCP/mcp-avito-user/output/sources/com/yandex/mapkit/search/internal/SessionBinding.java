package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.search.BusinessFilter;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Session;
import com.yandex.runtime.NativeObject;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class SessionBinding implements Session {
    private final NativeObject nativeObject;

    public SessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.Session
    public native void cancel();

    @Override // com.yandex.mapkit.search.Session
    public native void fetchNextPage(@N Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.Session
    public native boolean hasNextPage();

    @Override // com.yandex.mapkit.search.Session
    public native void resetSort();

    @Override // com.yandex.mapkit.search.Session
    public native void resubmit(@N Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.Session
    public native void retry(@N Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.Session
    @Deprecated
    public native void setFilters(@N List<BusinessFilter> list);

    @Override // com.yandex.mapkit.search.Session
    public native void setSearchArea(@N Geometry geometry);

    @Override // com.yandex.mapkit.search.Session
    public native void setSearchOptions(@N SearchOptions searchOptions);

    @Override // com.yandex.mapkit.search.Session
    public native void setSortByDistance(@N Geometry geometry);
}
