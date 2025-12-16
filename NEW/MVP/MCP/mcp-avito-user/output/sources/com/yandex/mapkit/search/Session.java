package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Geometry;
import com.yandex.runtime.Error;
import j.N;
import j.j0;
import java.util.List;

/* loaded from: classes7.dex */
public interface Session {

    public interface SearchListener {
        @j0
        void onSearchError(@N Error error);

        @j0
        void onSearchResponse(@N Response response);
    }

    void cancel();

    void fetchNextPage(@N SearchListener searchListener);

    boolean hasNextPage();

    void resetSort();

    void resubmit(@N SearchListener searchListener);

    void retry(@N SearchListener searchListener);

    @Deprecated
    void setFilters(@N List<BusinessFilter> list);

    void setSearchArea(@N Geometry geometry);

    void setSearchOptions(@N SearchOptions searchOptions);

    void setSortByDistance(@N Geometry geometry);
}
