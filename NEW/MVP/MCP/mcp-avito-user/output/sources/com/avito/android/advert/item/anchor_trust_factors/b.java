package com.avito.android.advert.item.anchor_trust_factors;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAnchorTrustFactorsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f72804a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f72805b;

    public b(u uVar, Provider provider) {
        this.f72804a = uVar;
        this.f72805b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f72804a.get(), this.f72805b.get());
    }
}
