package com.avito.android.advert.item.additionalSeller;

import com.avito.android.C29640d;
import com.avito.android.advert.item.additionalSeller.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdditionalSellerButtonNewDevelopmentBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f72564a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f72565b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C29640d> f72566c;

    public d(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f72564a = provider;
        this.f72565b = fVar;
        this.f72566c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f72564a.get(), (l.b) this.f72565b.get(), this.f72566c.get());
    }
}
