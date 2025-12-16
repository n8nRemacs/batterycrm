package com.avito.android.advertising.adapter.items.buzzoola.premium;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BuzzoolaPremiumSingleGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f87445a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87446b;

    public p(dagger.internal.l lVar, Provider provider) {
        this.f87445a = provider;
        this.f87446b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f87445a.get(), (com.avito.android.advertising.a) this.f87446b.f393949a);
    }
}
