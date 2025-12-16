package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fi1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class K implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383241b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fi1.a f383242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f383243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f383244e;

    public /* synthetic */ K(fi1.a aVar, int i12, long j12) {
        this.f383242c = aVar;
        this.f383244e = i12;
        this.f383243d = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383241b) {
            case 0:
                this.f383242c.b(this.f383244e, this.f383243d);
                break;
            default:
                this.f383242c.a(this.f383243d, this.f383244e);
                break;
        }
    }

    public /* synthetic */ K(fi1.a aVar, long j12, int i12) {
        this.f383242c = aVar;
        this.f383243d = j12;
        this.f383244e = i12;
    }
}
