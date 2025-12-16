package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public final class ao1 extends vd0 {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final cj1<ho0, me1> f383621c;

    public ao1(@j.N CustomizableMediaView customizableMediaView, @j.N xi1 xi1Var, @j.N n2 n2Var) {
        super(customizableMediaView, n2Var);
        this.f383621c = new cj1<>(xi1Var);
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    public final void a(@j.N rd0 rd0Var) {
    }

    @Override // com.yandex.mobile.ads.impl.vd0, com.yandex.mobile.ads.impl.bj1
    public final void b(@j.N View view, @j.N rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        super.b((CustomizableMediaView) view, rd0Var2);
        me1 me1VarC = rd0Var2.c();
        if (me1VarC != null) {
            this.f383621c.b(me1VarC);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    @j.N
    public final int c() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N View view) {
        this.f383621c.a();
        super.a((ao1) view);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N eb ebVar, @j.N ej1 ej1Var, @j.P rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        this.f383621c.a(ebVar, ej1Var, rd0Var2 != null ? rd0Var2.c() : null);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(@j.N CustomizableMediaView customizableMediaView, @j.N rd0 rd0Var) {
        if (rd0Var.c() != null) {
            return this.f383621c.a(rd0Var.c());
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    /* renamed from: a */
    public final void b(@j.N CustomizableMediaView customizableMediaView, @j.N rd0 rd0Var) {
        super.b(customizableMediaView, rd0Var);
        me1 me1VarC = rd0Var.c();
        if (me1VarC != null) {
            this.f383621c.b(me1VarC);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a() {
        this.f383621c.b();
    }
}
