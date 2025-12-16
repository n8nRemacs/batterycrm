package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.j01;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.ko1;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public final class RewardedAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final j01 f392900a;

    public RewardedAdLoader(@N Context context) {
        this.f392900a = k01.a(context, new ko1());
    }

    public void cancelLoading() {
        this.f392900a.a();
    }

    public void loadAd(@N AdRequestConfiguration adRequestConfiguration) {
        this.f392900a.a(adRequestConfiguration);
    }

    public void setAdLoadListener(@P RewardedAdLoadListener rewardedAdLoadListener) {
        this.f392900a.a(rewardedAdLoadListener);
    }
}
