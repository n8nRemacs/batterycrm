package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.az0;
import com.yandex.mobile.ads.impl.bl0;
import com.yandex.mobile.ads.impl.bn0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.vk0;
import com.yandex.mobile.ads.impl.wk0;
import com.yandex.mobile.ads.impl.zm0;
import j.N;
import j.P;

/* loaded from: classes8.dex */
final class q implements vk0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final o f392717a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final wk0 f392718b;

    public q(@N Context context, @N ko1 ko1Var, @N wk0 wk0Var) {
        this.f392718b = wk0Var;
        a4 a4Var = new a4();
        t tVar = new t(context, a4Var, this);
        o oVar = new o(context, ko1Var, tVar, a4Var);
        this.f392717a = oVar;
        tVar.a(oVar.d());
    }

    public final void a(@N NativeAdRequestConfiguration nativeAdRequestConfiguration, @N zm0 zm0Var, @N bn0 bn0Var, @N az0<bl0> az0Var) {
        this.f392717a.a(nativeAdRequestConfiguration, zm0Var, bn0Var, az0Var, 1);
    }

    public final void b() {
        ((p) this.f392718b).a(this);
    }

    public final void a(@N NativeAdRequestConfiguration nativeAdRequestConfiguration, @N zm0 zm0Var, @N bn0 bn0Var, @N az0<bl0> az0Var, int i12) {
        this.f392717a.a(nativeAdRequestConfiguration, zm0Var, bn0Var, az0Var, i12);
    }

    public final void a(@P NativeAdLoadListener nativeAdLoadListener) {
        this.f392717a.a(nativeAdLoadListener);
    }

    public final void a(@P NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f392717a.a(nativeBulkAdLoadListener);
    }

    public final void a(@P SliderAdLoadListener sliderAdLoadListener) {
        this.f392717a.a(sliderAdLoadListener);
    }

    public final void a() {
        this.f392717a.t();
    }
}
