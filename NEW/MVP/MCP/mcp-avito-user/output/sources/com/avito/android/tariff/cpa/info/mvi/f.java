package com.avito.android.tariff.cpa.info.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaInfoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpa.info.domain.a> f294764a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f294765b;

    public f(Provider<com.avito.android.tariff.cpa.info.domain.a> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f294764a = provider;
        this.f294765b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f294764a.get(), this.f294765b.get());
    }
}
