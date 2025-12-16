package com.avito.android.serp.adapter.vertical_main.top_sellers;

import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopSellersWidgetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f273243a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f273244b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14698b> f273245c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C> f273246d;

    public b(f fVar, Provider provider, Provider provider2, Provider provider3) {
        this.f273243a = fVar;
        this.f273244b = provider;
        this.f273245c = provider2;
        this.f273246d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f273243a.getClass();
        return new a(new e(), this.f273244b.get(), this.f273245c.get(), this.f273246d.get());
    }
}
