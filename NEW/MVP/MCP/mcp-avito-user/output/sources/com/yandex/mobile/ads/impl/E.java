package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ co1 f383194c;

    public /* synthetic */ E(co1 co1Var, int i12) {
        this.f383193b = i12;
        this.f383194c = co1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383193b) {
            case 0:
                co1.h(this.f383194c);
                break;
            default:
                co1.b.a(this.f383194c);
                break;
        }
    }
}
