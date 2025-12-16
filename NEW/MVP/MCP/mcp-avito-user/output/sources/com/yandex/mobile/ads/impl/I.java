package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class I implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f383230c;

    public /* synthetic */ I(int i12, Y41.a aVar) {
        this.f383229b = i12;
        this.f383230c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383229b) {
            case 0:
                fa.a(this.f383230c);
                break;
            default:
                ma.a(this.f383230c);
                break;
        }
    }
}
