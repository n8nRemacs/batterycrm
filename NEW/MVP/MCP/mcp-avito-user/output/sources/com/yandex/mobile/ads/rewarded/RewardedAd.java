package com.yandex.mobile.ads.rewarded;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public interface RewardedAd {
    @N
    AdInfo getInfo();

    void setAdEventListener(@P RewardedAdEventListener rewardedAdEventListener);

    void show(@N Activity activity);
}
