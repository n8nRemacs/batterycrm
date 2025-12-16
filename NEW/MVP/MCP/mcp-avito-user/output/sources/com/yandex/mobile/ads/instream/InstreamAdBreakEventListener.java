package com.yandex.mobile.ads.instream;

import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public interface InstreamAdBreakEventListener {
    void onInstreamAdBreakCompleted();

    void onInstreamAdBreakError(@N String str);

    void onInstreamAdBreakPrepared();

    void onInstreamAdBreakStarted();
}
