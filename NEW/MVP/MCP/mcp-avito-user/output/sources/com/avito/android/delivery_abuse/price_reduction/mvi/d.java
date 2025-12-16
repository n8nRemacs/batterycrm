package com.avito.android.delivery_abuse.price_reduction.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PriceReductionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.delivery_abuse.price_reduction.domain.b f134889a;

    /* renamed from: b, reason: collision with root package name */
    public final u f134890b;

    public d(com.avito.android.delivery_abuse.price_reduction.domain.b bVar, u uVar) {
        this.f134889a = bVar;
        this.f134890b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.delivery_abuse.price_reduction.domain.a) this.f134889a.get(), (yv.c) this.f134890b.get());
    }
}
