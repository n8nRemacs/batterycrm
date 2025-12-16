package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class eo1 implements ul0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<com.yandex.mobile.ads.nativeads.o> f385049a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final bo1 f385050b = new bo1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final an1 f385051c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final pl0 f385052d;

    public eo1(@j.N com.yandex.mobile.ads.nativeads.o oVar) {
        this.f385049a = new WeakReference<>(oVar);
        this.f385051c = new an1(oVar.d());
        this.f385052d = new pl0(oVar.d());
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a(@j.N Context context, @j.N AdResponse<bl0> adResponse) {
        com.yandex.mobile.ads.nativeads.o oVar = this.f385049a.get();
        if (oVar != null) {
            oVar.e().b(z3.f392161a);
            ql0 ql0Var = new ql0(adResponse.B());
            this.f385051c.a(context, adResponse, this.f385052d);
            this.f385051c.a(context, adResponse, ql0Var);
            this.f385050b.getClass();
            com.yandex.mobile.ads.nativeads.q0 q0Var = new com.yandex.mobile.ads.nativeads.q0();
            oVar.a(adResponse, new ok0(new xm1(adResponse), new wm1(), q0Var, new wn1(adResponse), new no1()), "Yandex");
        }
    }
}
