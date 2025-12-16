package com.yandex.mobile.ads.nativeads.template;

import com.yandex.mobile.ads.impl.jl0;
import com.yandex.mobile.ads.nativeads.c0;
import j.N;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class c implements jl0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final NativeBannerView f392852a;

    public c(@N NativeBannerView nativeBannerView) {
        this.f392852a = nativeBannerView;
    }

    @Override // com.yandex.mobile.ads.impl.jl0
    @N
    public final c0 a() {
        c0.a aVarC = new c0.a(this.f392852a, new HashMap()).a(this.f392852a.b()).b(this.f392852a.c()).a(this.f392852a.d()).c(this.f392852a.e()).a(this.f392852a.f()).b(this.f392852a.g()).c(this.f392852a.h());
        aVarC.f392611c = this.f392852a.i();
        return aVarC.a(this.f392852a.j()).a(this.f392852a.k()).d(this.f392852a.l()).e(this.f392852a.m()).f(this.f392852a.n()).g(this.f392852a.o()).a();
    }
}
