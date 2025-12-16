package com.avito.android.profile.user_profile.cards.tariff;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCardBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f225596a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f225597b;

    public b(u uVar, Provider provider) {
        this.f225596a = uVar;
        this.f225597b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f225596a.get(), this.f225597b.get());
    }
}
