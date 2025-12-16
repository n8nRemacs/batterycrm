package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes8.dex */
public abstract class y71 extends wn implements t71 {

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private t71 f391953c;

    /* renamed from: d, reason: collision with root package name */
    private long f391954d;

    public final void a(long j12, t71 t71Var, long j13) {
        this.f391444b = j12;
        this.f391953c = t71Var;
        if (j13 != Long.MAX_VALUE) {
            j12 = j13;
        }
        this.f391954d = j12;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final List<vm> b(long j12) {
        t71 t71Var = this.f391953c;
        t71Var.getClass();
        return t71Var.b(j12 - this.f391954d);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a() {
        t71 t71Var = this.f391953c;
        t71Var.getClass();
        return t71Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.og
    public final void b() {
        super.b();
        this.f391953c = null;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final long a(int i12) {
        t71 t71Var = this.f391953c;
        t71Var.getClass();
        return t71Var.a(i12) + this.f391954d;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a(long j12) {
        t71 t71Var = this.f391953c;
        t71Var.getClass();
        return t71Var.a(j12 - this.f391954d);
    }
}
