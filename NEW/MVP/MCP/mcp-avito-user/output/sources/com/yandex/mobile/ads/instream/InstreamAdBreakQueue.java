package com.yandex.mobile.ads.instream;

import j.K;
import j.P;

@K
/* loaded from: classes8.dex */
public interface InstreamAdBreakQueue<T> {
    int getCount();

    @P
    T poll();
}
