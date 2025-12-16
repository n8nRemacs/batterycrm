package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public final class InterstitialAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final u70 f392515a;

    public InterstitialAdLoader(@N Context context) {
        this.f392515a = v70.a(context, new ko1());
    }

    public void cancelLoading() {
        this.f392515a.a();
    }

    public void loadAd(@N AdRequestConfiguration adRequestConfiguration) {
        this.f392515a.a(adRequestConfiguration);
    }

    public void setAdLoadListener(@P InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f392515a.a(interstitialAdLoadListener);
    }
}
