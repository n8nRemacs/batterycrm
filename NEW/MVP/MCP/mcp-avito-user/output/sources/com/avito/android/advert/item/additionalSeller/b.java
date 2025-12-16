package com.avito.android.advert.item.additionalSeller;

import com.avito.android.C29640d;
import com.avito.android.advert.item.additionalSeller.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdditionalSellerButtonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f72556a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f72557b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C29640d> f72558c;

    public b(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider) {
        this.f72556a = uVar;
        this.f72557b = fVar;
        this.f72558c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f72556a.get(), (l.b) this.f72557b.get(), this.f72558c.get());
    }
}
