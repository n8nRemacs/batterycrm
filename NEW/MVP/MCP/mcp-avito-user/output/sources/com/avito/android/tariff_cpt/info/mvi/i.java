package com.avito.android.tariff_cpt.info.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptInfoV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_cpt.info.domain.a> f298253a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f298254b;

    public i(dagger.internal.l lVar, Provider provider) {
        this.f298253a = provider;
        this.f298254b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f298253a.get(), (String) this.f298254b.f393949a);
    }
}
