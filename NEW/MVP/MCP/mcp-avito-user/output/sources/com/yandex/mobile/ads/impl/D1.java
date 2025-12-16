package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class D1 implements v21.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f383189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h f383190b;

    public /* synthetic */ D1(l0.h hVar, int i12) {
        this.f383189a = i12;
        this.f383190b = hVar;
    }

    @Override // v21.e
    public final void cancel() {
        switch (this.f383189a) {
            case 0:
                oq.b(this.f383190b);
                break;
            default:
                oq.a(this.f383190b);
                break;
        }
    }
}
