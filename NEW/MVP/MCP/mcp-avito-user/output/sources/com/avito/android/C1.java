package com.avito.android;

import android.app.Application;

/* compiled from: PaymentLibIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class C1 implements dagger.internal.h<B1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f67239a;

    public C1(dagger.internal.l lVar) {
        this.f67239a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new B1((Application) this.f67239a.f393949a);
    }
}
