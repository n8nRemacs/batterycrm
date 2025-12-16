package com.avito.android.advert.item.blocks.tabbed_details.item;

import com.avito.android.advert.di.m0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TabbedDetailsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f74106a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f74107b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<G4.a> f74108c;

    public b(d dVar, m0 m0Var, Provider provider) {
        this.f74106a = dVar;
        this.f74107b = m0Var;
        this.f74108c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f74106a.getClass();
        return new a(new c(), (com.avito.konveyor.a) this.f74107b.get(), this.f74108c.get());
    }
}
