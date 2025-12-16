package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class U0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lv0 f383321c;

    public /* synthetic */ U0(lv0 lv0Var, int i12) {
        this.f383320b = i12;
        this.f383321c = lv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383320b) {
            case 0:
                this.f383321c.i();
                break;
            case 1:
                this.f383321c.g();
                break;
            default:
                this.f383321c.h();
                break;
        }
    }
}
