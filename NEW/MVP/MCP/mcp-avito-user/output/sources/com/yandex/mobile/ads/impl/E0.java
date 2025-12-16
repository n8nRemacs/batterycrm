package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class E0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f383196c;

    public /* synthetic */ E0(fz0.c cVar, int i12) {
        this.f383195b = i12;
        this.f383196c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383195b) {
            case 0:
                this.f383196c.b();
                break;
            default:
                this.f383196c.a();
                break;
        }
    }
}
