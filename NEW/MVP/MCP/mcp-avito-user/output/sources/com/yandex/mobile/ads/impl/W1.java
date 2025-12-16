package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class W1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vv0 f383338c;

    public /* synthetic */ W1(vv0 vv0Var, int i12) {
        this.f383337b = i12;
        this.f383338c = vv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383337b) {
            case 0:
                vv0.a(this.f383338c);
                break;
            case 1:
                vv0.c(this.f383338c);
                break;
            default:
                vv0.b(this.f383338c);
                break;
        }
    }
}
