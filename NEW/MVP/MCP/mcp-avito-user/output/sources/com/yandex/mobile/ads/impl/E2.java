package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class E2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xv0 f383199c;

    public /* synthetic */ E2(xv0 xv0Var, int i12) {
        this.f383198b = i12;
        this.f383199c = xv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383198b) {
            case 0:
                xv0.a(this.f383199c);
                break;
            case 1:
                xv0.c(this.f383199c);
                break;
            default:
                xv0.b(this.f383199c);
                break;
        }
    }
}
