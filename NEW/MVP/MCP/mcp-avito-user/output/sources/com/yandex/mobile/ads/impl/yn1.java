package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public final class yn1 extends vd0 {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final cj1<hi0, rb0> f392029c;

    public yn1(@j.N CustomizableMediaView customizableMediaView, @j.N ji0 ji0Var, @j.N n2 n2Var) {
        super(customizableMediaView, n2Var);
        this.f392029c = new cj1<>(ji0Var);
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    public final void a(@j.N rd0 rd0Var) {
    }

    @Override // com.yandex.mobile.ads.impl.vd0, com.yandex.mobile.ads.impl.bj1
    public final void b(@j.N View view, @j.N rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        super.b((CustomizableMediaView) view, rd0Var2);
        if (rd0Var2.b() != null) {
            this.f392029c.b(rd0Var2.b());
        }
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    @j.N
    public final int c() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N View view) {
        this.f392029c.a();
        super.a((yn1) view);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N eb ebVar, @j.N ej1 ej1Var, @j.P rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        this.f392029c.a(ebVar, ej1Var, rd0Var2 != null ? rd0Var2.b() : null);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(@j.N CustomizableMediaView customizableMediaView, @j.N rd0 rd0Var) {
        if (rd0Var.b() != null) {
            return this.f392029c.a(rd0Var.b());
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    /* renamed from: a */
    public final void b(@j.N CustomizableMediaView customizableMediaView, @j.N rd0 rd0Var) {
        super.b(customizableMediaView, rd0Var);
        if (rd0Var.b() != null) {
            this.f392029c.b(rd0Var.b());
        }
    }
}
