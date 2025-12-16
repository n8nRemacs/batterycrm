package com.yandex.mapkit.offline_cache;

import com.yandex.runtime.Error;
import j.N;
import j.j0;
import java.util.List;

/* loaded from: classes7.dex */
public interface RegionsAtPointListener {
    @j0
    void onError(@N Error error);

    @j0
    void onRegions(@N List<Integer> list);
}
