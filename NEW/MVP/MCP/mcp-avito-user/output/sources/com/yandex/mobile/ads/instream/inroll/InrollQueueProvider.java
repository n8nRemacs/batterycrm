package com.yandex.mobile.ads.instream.inroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.wa0;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import j.K;
import j.N;

@K
/* loaded from: classes8.dex */
public class InrollQueueProvider {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final wa0<Inroll> f392506a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final c40 f392507b = new c40();

    public InrollQueueProvider(@N Context context, @N InstreamAd instreamAd) {
        this.f392506a = new wa0<>(context, instreamAd);
    }

    @N
    public InstreamAdBreakQueue<Inroll> getQueue() {
        return this.f392506a.a(this.f392507b, InstreamAdBreakType.INROLL);
    }
}
