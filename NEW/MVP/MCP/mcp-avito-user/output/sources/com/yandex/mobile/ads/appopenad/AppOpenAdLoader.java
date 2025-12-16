package com.yandex.mobile.ads.appopenad;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.va;
import com.yandex.mobile.ads.impl.wa;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public final class AppOpenAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final va f382506a;

    public AppOpenAdLoader(@N Context context) {
        this.f382506a = wa.a(context, new ko1());
    }

    public void cancelLoading() {
        this.f382506a.a();
    }

    public void loadAd(@N AdRequestConfiguration adRequestConfiguration) {
        this.f382506a.a(adRequestConfiguration);
    }

    public void setAdLoadListener(@P AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f382506a.a(appOpenAdLoadListener);
    }
}
