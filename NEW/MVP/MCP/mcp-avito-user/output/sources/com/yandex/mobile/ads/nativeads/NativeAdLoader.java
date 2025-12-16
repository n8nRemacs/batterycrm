package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.zk0;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public class NativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final p f392552a;

    /* renamed from: b, reason: collision with root package name */
    @N
    protected final Context f392553b;

    public NativeAdLoader(@N Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f392553b = applicationContext;
        this.f392552a = new p(applicationContext, new ko1());
    }

    public void cancelLoading() {
        this.f392552a.a();
    }

    public void loadAd(@N NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        this.f392552a.a(nativeAdRequestConfiguration, new zk0(this.f392553b));
    }

    public void setNativeAdLoadListener(@P NativeAdLoadListener nativeAdLoadListener) {
        this.f392552a.a(nativeAdLoadListener);
    }
}
