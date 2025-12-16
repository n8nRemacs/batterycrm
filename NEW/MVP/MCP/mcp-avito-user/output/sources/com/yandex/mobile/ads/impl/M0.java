package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class M0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kd0.a f383254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd0 f383255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q90 f383256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zc0 f383257f;

    public /* synthetic */ M0(kd0.a aVar, kd0 kd0Var, q90 q90Var, zc0 zc0Var, int i12) {
        this.f383253b = i12;
        this.f383254c = aVar;
        this.f383255d = kd0Var;
        this.f383256e = q90Var;
        this.f383257f = zc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383253b) {
            case 0:
                this.f383254c.b(this.f383255d, this.f383256e, this.f383257f);
                break;
            case 1:
                this.f383254c.a(this.f383255d, this.f383256e, this.f383257f);
                break;
            default:
                this.f383254c.c(this.f383255d, this.f383256e, this.f383257f);
                break;
        }
    }
}
