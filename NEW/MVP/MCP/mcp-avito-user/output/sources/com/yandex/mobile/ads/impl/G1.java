package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class G1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pc.a f383215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f383216d;

    public /* synthetic */ G1(pc.a aVar, Exception exc, int i12) {
        this.f383214b = i12;
        this.f383215c = aVar;
        this.f383216d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383214b) {
            case 0:
                this.f383215c.d(this.f383216d);
                break;
            default:
                this.f383215c.c(this.f383216d);
                break;
        }
    }
}
