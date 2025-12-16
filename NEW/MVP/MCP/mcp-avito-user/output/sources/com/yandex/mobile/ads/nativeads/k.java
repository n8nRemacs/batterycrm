package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.C39302a0;
import com.yandex.mobile.ads.impl.at;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.nk0;
import com.yandex.mobile.ads.impl.o30;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class k implements at, o30.a {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final C39302a0 f392680a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final nk0 f392681b;

    public k(@N Context context, @N n2 n2Var) {
        nk0 nk0Var = new nk0();
        this.f392681b = nk0Var;
        this.f392680a = new C39302a0(context, n2Var, nk0Var);
    }

    public final void a(@P NativeAdEventListener nativeAdEventListener) {
        this.f392681b.a(nativeAdEventListener);
    }

    public final void b() {
        this.f392680a.a();
    }

    public final void c() {
        this.f392680a.e();
    }

    public final void d() {
        this.f392681b.onLeftApplication();
        this.f392680a.d();
    }

    public final void e() {
        this.f392681b.onLeftApplication();
        this.f392680a.f();
    }

    public final void f() {
        this.f392680a.b();
    }

    public final void g() {
        this.f392681b.onLeftApplication();
        this.f392680a.c();
    }

    public final void a(@N ky0.a aVar) {
        this.f392680a.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.at
    public final void a() {
        this.f392681b.a();
    }

    public final void a(@N h90 h90Var) {
        this.f392680a.a(h90Var.c());
    }

    @Override // com.yandex.mobile.ads.impl.o30.a
    public final void a(@P AdImpressionData adImpressionData) {
        this.f392681b.b(adImpressionData);
    }
}
