package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fi1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fi1.a f383247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn f383248d;

    public /* synthetic */ L(fi1.a aVar, tn tnVar, int i12) {
        this.f383246b = i12;
        this.f383247c = aVar;
        this.f383248d = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383246b) {
            case 0:
                this.f383247c.d(this.f383248d);
                break;
            default:
                this.f383247c.c(this.f383248d);
                break;
        }
    }
}
