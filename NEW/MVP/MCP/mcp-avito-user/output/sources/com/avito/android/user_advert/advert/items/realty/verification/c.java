package com.avito.android.user_advert.advert.items.realty.verification;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyVerificationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f309957a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309958b;

    public c(u uVar, Provider provider) {
        this.f309957a = provider;
        this.f309958b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f309957a.get(), (com.avito.android.util.text.a) this.f309958b.get());
    }
}
