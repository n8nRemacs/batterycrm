package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.zk0;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public class NativeBulkAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final p f392582a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Context f392583b;

    public NativeBulkAdLoader(@N Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f392583b = applicationContext;
        this.f392582a = new p(applicationContext, new ko1());
    }

    public void cancelLoading() {
        this.f392582a.a();
    }

    public void loadAds(@N NativeAdRequestConfiguration nativeAdRequestConfiguration, int i12) {
        this.f392582a.a(nativeAdRequestConfiguration, new zk0(this.f392583b), i12);
    }

    public void setNativeBulkAdLoadListener(@P NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f392582a.a(nativeBulkAdLoadListener);
    }
}
