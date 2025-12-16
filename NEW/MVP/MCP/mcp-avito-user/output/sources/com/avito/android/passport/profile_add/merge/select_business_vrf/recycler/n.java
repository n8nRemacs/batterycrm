package com.avito.android.passport.profile_add.merge.select_business_vrf.recycler;

import javax.inject.Provider;

/* compiled from: PassportSelectBusinessBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final t f213521a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f213522b;

    public n(t tVar, Provider provider) {
        this.f213521a = tVar;
        this.f213522b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((s) this.f213521a.get(), this.f213522b.get());
    }
}
