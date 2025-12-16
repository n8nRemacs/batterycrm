package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class B1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nk0 f383177c;

    public /* synthetic */ B1(nk0 nk0Var, int i12) {
        this.f383176b = i12;
        this.f383177c = nk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383176b) {
            case 0:
                this.f383177c.b();
                break;
            case 1:
                this.f383177c.c();
                break;
            default:
                this.f383177c.d();
                break;
        }
    }
}
