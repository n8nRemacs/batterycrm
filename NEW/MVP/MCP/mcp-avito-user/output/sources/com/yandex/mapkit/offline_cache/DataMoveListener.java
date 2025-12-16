package com.yandex.mapkit.offline_cache;

import com.yandex.runtime.Error;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface DataMoveListener {
    @j0
    void onDataMoveCompleted();

    @j0
    void onDataMoveError(@N Error error);

    @j0
    void onDataMoveProgress(int i12);
}
