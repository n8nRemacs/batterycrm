package com.avito.android.advert.item.rent_agreement;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RentAgreementPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f78576a;

    /* renamed from: b, reason: collision with root package name */
    public final u f78577b;

    public f(u uVar, Provider provider) {
        this.f78576a = provider;
        this.f78577b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f78576a.get(), (A6.a) this.f78577b.get());
    }
}
