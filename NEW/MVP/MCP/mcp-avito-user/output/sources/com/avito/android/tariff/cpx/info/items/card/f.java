package com.avito.android.tariff.cpx.info.items.card;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxInfoCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f296442a;

    /* renamed from: b, reason: collision with root package name */
    public final l f296443b;

    public f(l lVar, Provider provider) {
        this.f296442a = provider;
        this.f296443b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f296442a.get(), (Y41.l) this.f296443b.f393949a);
    }
}
