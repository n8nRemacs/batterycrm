package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public interface BannerAdEventListener {
    void onAdClicked();

    void onAdFailedToLoad(@N AdRequestError adRequestError);

    void onAdLoaded();

    void onImpression(@P ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
