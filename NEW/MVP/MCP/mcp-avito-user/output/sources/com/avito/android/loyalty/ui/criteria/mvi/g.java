package com.avito.android.loyalty.ui.criteria.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.criteria.c> f183548a;

    /* renamed from: b, reason: collision with root package name */
    public final u f183549b;

    public g(u uVar, Provider provider) {
        this.f183548a = provider;
        this.f183549b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f183548a.get(), (JW.a) this.f183549b.get());
    }
}
