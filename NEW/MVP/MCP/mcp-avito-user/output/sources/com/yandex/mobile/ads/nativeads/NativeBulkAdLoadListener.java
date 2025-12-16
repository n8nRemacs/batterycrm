package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;
import j.K;
import j.N;
import java.util.List;

@K
/* loaded from: classes8.dex */
public interface NativeBulkAdLoadListener {
    void onAdsFailedToLoad(@N AdRequestError adRequestError);

    void onAdsLoaded(@N List<NativeAd> list);
}
