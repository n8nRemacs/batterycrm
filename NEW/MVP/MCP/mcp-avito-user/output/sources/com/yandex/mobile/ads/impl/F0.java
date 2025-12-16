package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class F0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g60 f383204c;

    public /* synthetic */ F0(g60 g60Var, int i12) {
        this.f383203b = i12;
        this.f383204c = g60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383203b) {
            case 0:
                this.f383204c.a();
                break;
            case 1:
                this.f383204c.b();
                break;
            default:
                this.f383204c.a("Video player returned error");
                break;
        }
    }
}
