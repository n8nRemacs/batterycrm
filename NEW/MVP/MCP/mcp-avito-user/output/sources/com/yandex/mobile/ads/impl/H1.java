package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class H1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pc.a f383227c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn f383228d;

    public /* synthetic */ H1(pc.a aVar, tn tnVar, int i12) {
        this.f383226b = i12;
        this.f383227c = aVar;
        this.f383228d = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383226b) {
            case 0:
                this.f383227c.c(this.f383228d);
                break;
            default:
                this.f383227c.d(this.f383228d);
                break;
        }
    }
}
