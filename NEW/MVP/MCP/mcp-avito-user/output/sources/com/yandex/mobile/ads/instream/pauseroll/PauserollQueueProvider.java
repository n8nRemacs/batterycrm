package com.yandex.mobile.ads.instream.pauseroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.cs0;
import com.yandex.mobile.ads.impl.wa0;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public class PauserollQueueProvider {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final wa0<Pauseroll> f392508a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final cs0 f392509b = new cs0();

    public PauserollQueueProvider(@N Context context, @N InstreamAd instreamAd) {
        this.f392508a = new wa0<>(context, instreamAd);
    }

    @N
    public InstreamAdBreakQueue<Pauseroll> getQueue() {
        return this.f392508a.a(this.f392509b, InstreamAdBreakType.PAUSEROLL);
    }
}
