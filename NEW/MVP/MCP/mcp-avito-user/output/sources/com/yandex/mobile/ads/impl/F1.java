package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p21;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class F1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p21 f383206c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p21.a f383207d;

    public /* synthetic */ F1(p21 p21Var, p21.a aVar, int i12) {
        this.f383205b = i12;
        this.f383206c = p21Var;
        this.f383207d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383205b) {
            case 0:
                this.f383206c.c(this.f383207d);
                break;
            default:
                this.f383206c.b(this.f383207d);
                break;
        }
    }
}
