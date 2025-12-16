package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class F2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ya0 f383209c;

    public /* synthetic */ F2(ya0 ya0Var, int i12) {
        this.f383208b = i12;
        this.f383209c = ya0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383208b) {
            case 0:
                this.f383209c.c();
                break;
            case 1:
                this.f383209c.b();
                break;
            default:
                this.f383209c.a();
                break;
        }
    }
}
