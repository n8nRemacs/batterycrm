package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.runtime.Error;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface SuggestSession {

    public interface SuggestListener {
        @j0
        void onError(@N Error error);

        @j0
        void onResponse(@N SuggestResponse suggestResponse);
    }

    void reset();

    void suggest(@N String str, @N BoundingBox boundingBox, @N SuggestOptions suggestOptions, @N SuggestListener suggestListener);
}
