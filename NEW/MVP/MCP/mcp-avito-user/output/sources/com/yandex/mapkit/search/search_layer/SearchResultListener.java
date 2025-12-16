package com.yandex.mapkit.search.search_layer;

import com.yandex.runtime.Error;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface SearchResultListener {
    @j0
    void onAllResultsClear();

    @j0
    void onPresentedResultsUpdate();

    @j0
    void onSearchError(@N Error error, @N RequestType requestType);

    @j0
    void onSearchStart(@N RequestType requestType);

    @j0
    void onSearchSuccess(@N RequestType requestType);
}
