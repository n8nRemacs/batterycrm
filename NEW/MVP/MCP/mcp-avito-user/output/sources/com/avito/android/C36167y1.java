package com.avito.android;

import android.app.Application;

/* compiled from: PaymentIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.y1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C36167y1 implements dagger.internal.h<C36163x1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f331342a;

    /* renamed from: b, reason: collision with root package name */
    public final C1 f331343b;

    /* renamed from: c, reason: collision with root package name */
    public final v60.e f331344c;

    public C36167y1(dagger.internal.l lVar, C1 c12, v60.e eVar) {
        this.f331342a = lVar;
        this.f331343b = c12;
        this.f331344c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C36163x1((Application) this.f331342a.f393949a, (A1) this.f331343b.get(), (v60.d) this.f331344c.get());
    }
}
