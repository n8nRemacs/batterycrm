package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class G2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zv0 f383218c;

    public /* synthetic */ G2(zv0 zv0Var, int i12) {
        this.f383217b = i12;
        this.f383218c = zv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383217b) {
            case 0:
                zv0.a(this.f383218c);
                break;
            case 1:
                zv0.c(this.f383218c);
                break;
            default:
                zv0.b(this.f383218c);
                break;
        }
    }
}
