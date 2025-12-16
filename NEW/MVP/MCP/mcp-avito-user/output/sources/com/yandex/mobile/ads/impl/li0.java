package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public final class li0 implements q00 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final hi0 f387512a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wh0 f387513b;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ll1 f387515d;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private aj f387517f;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ih1 f387514c = new ih1();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final uh0 f387516e = new uh0();

    public li0(@j.N hi0 hi0Var, @j.N wh0 wh0Var) {
        this.f387512a = hi0Var;
        this.f387513b = wh0Var;
        this.f387515d = new ll1(hi0Var);
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@j.P nr0 nr0Var, @j.P Map map) {
    }

    public final void b(@j.N String str) {
        this.f387516e.getClass();
        boolean zA2 = uh0.a(str);
        m00.a().getClass();
        l00 l00VarA = m00.a(zA2);
        hi0 hi0Var = this.f387512a;
        ih1 ih1Var = this.f387514c;
        wh0 wh0Var = this.f387513b;
        l00VarA.a(hi0Var, this, ih1Var, wh0Var, wh0Var, wh0Var).a(str);
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@j.N w2 w2Var) {
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(boolean z12) {
    }

    public final void a(@j.N aj ajVar) {
        this.f387517f = ajVar;
    }

    public final void a() {
        this.f387515d.a(Collections.emptyMap());
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@j.N String str) {
        aj ajVar = this.f387517f;
        if (ajVar != null) {
            ((qh0) ajVar).a(this.f387512a, str);
        }
    }
}
