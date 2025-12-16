package com.avito.android.delivery_abuse.price_reduction.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PriceReductionBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f134906a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f134907b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f134908c;

    public f(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f134906a = lVar;
        this.f134907b = lVar2;
        this.f134908c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(((Long) this.f134906a.f393949a).longValue(), ((Long) this.f134907b.f393949a).longValue(), ((Long) this.f134908c.f393949a).longValue());
    }
}
