package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.ImpressionData;
import j.K;
import j.P;

@K
/* loaded from: classes8.dex */
public interface NativeAdEventListener {
    void onAdClicked();

    void onImpression(@P ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
