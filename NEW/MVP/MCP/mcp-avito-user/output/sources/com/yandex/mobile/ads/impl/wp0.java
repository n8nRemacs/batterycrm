package com.yandex.mobile.ads.impl;

import v61.InterfaceC49174e;

/* loaded from: classes8.dex */
public final class wp0 implements ru {

    /* renamed from: a, reason: collision with root package name */
    private tu f391474a;

    /* renamed from: b, reason: collision with root package name */
    private e71 f391475b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f391476c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ru[] a() {
        return new ru[]{new wp0()};
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        try {
            return a((to) suVar);
        } catch (tr0 unused) {
            return false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f391474a = tuVar;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        e71 e71Var = this.f391475b;
        if (e71Var != null) {
            e71Var.a(j12, j13);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) throws tr0 {
        db.b(this.f391474a);
        if (this.f391475b == null) {
            to toVar = (to) suVar;
            if (a(toVar)) {
                toVar.c();
            } else {
                throw tr0.a("Failed to determine bitstream type", (Exception) null);
            }
        }
        if (!this.f391476c) {
            x91 x91VarA = this.f391474a.a(0, 1);
            this.f391474a.a();
            this.f391475b.a(this.f391474a, x91VarA);
            this.f391476c = true;
        }
        return this.f391475b.a((to) suVar, fu0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @InterfaceC49174e
    private boolean a(to toVar) {
        boolean zA2;
        yp0 yp0Var = new yp0();
        if (yp0Var.a(toVar, true) && (yp0Var.f392048a & 2) == 2) {
            int iMin = Math.min(yp0Var.f392052e, 8);
            pr0 pr0Var = new pr0(iMin);
            toVar.b(pr0Var.c(), 0, iMin, false);
            pr0Var.e(0);
            if (pr0Var.a() >= 5 && pr0Var.t() == 127 && pr0Var.v() == 1179402563) {
                this.f391475b = new kw();
            } else {
                pr0Var.e(0);
                try {
                    zA2 = zk1.a(1, pr0Var, true);
                } catch (tr0 unused) {
                    zA2 = false;
                }
                if (zA2) {
                    this.f391475b = new xk1();
                } else {
                    pr0Var.e(0);
                    if (cr0.b(pr0Var)) {
                        this.f391475b = new cr0();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
