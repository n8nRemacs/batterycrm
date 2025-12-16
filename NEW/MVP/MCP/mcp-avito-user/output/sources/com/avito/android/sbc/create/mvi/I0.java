package com.avito.android.sbc.create.mvi;

import android.content.Context;
import android.content.res.Resources;
import javax.inject.Provider;

/* compiled from: CreateDiscountDispatchResourceProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class I0 implements dagger.internal.h<H0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f259306a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.sbc.di.w f259307b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f259308c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Context> f259309d;

    public I0(dagger.internal.l lVar, com.avito.android.sbc.di.w wVar, Provider provider, Provider provider2) {
        this.f259306a = lVar;
        this.f259307b = wVar;
        this.f259308c = provider;
        this.f259309d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new H0((Resources) this.f259306a.f393949a, (com.avito.android.sbc.utils.a) this.f259307b.get(), this.f259308c.get(), this.f259309d.get());
    }
}
