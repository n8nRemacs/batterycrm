package com.avito.android.safedeal.delivery.order_cancellation.details.mvi;

import com.avito.android.remote.model.ReasonRds;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReasonDetailsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.safedeal.delivery.order_cancellation.details.domain.b> f256241a;

    /* renamed from: b, reason: collision with root package name */
    public final l f256242b;

    public d(l lVar, Provider provider) {
        this.f256241a = provider;
        this.f256242b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f256241a.get(), (ReasonRds) this.f256242b.f393949a);
    }
}
