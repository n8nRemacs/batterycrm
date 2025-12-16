package com.avito.android.advertising.adapter.items.buzzoola;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BuzzoolaBigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f87289a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.e> f87290b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f87291c;

    public b(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f87289a = provider;
        this.f87290b = provider2;
        this.f87291c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f87289a.get(), this.f87290b.get(), (com.avito.android.advertising.a) this.f87291c.f393949a);
    }
}
