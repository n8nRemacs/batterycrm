package com.avito.android.advert.item.additionalSeller;

import com.avito.android.C29640d;
import com.avito.android.advert.item.additionalSeller.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdditionalSellerButtonRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f72596a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f72597b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C29640d> f72598c;

    public k(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider) {
        this.f72596a = uVar;
        this.f72597b = fVar;
        this.f72598c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((e) this.f72596a.get(), (l.b) this.f72597b.get(), this.f72598c.get());
    }
}
