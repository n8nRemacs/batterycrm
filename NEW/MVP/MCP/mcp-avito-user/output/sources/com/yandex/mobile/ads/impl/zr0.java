package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;

/* loaded from: classes8.dex */
public final class zr0 implements v21 {

    /* renamed from: a, reason: collision with root package name */
    private vw f392342a;

    /* renamed from: b, reason: collision with root package name */
    private o91 f392343b;

    /* renamed from: c, reason: collision with root package name */
    private x91 f392344c;

    public zr0(String str) {
        this.f392342a = new vw.a().f(str).a();
    }

    @Override // com.yandex.mobile.ads.impl.v21
    public final void a(o91 o91Var, tu tuVar, fb1.d dVar) {
        this.f392343b = o91Var;
        dVar.a();
        x91 x91VarA = tuVar.a(dVar.c(), 5);
        this.f392344c = x91VarA;
        x91VarA.a(this.f392342a);
    }

    @Override // com.yandex.mobile.ads.impl.v21
    public final void a(pr0 pr0Var) {
        db.b(this.f392343b);
        int i12 = pc1.f388768a;
        long jB2 = this.f392343b.b();
        long jC2 = this.f392343b.c();
        if (jB2 == -9223372036854775807L || jC2 == -9223372036854775807L) {
            return;
        }
        vw vwVar = this.f392342a;
        if (jC2 != vwVar.f391185p) {
            vw vwVarA = vwVar.a().a(jC2).a();
            this.f392342a = vwVarA;
            this.f392344c.a(vwVarA);
        }
        int iA2 = pr0Var.a();
        this.f392344c.a(iA2, pr0Var);
        this.f392344c.a(jB2, 1, iA2, 0, null);
    }
}
