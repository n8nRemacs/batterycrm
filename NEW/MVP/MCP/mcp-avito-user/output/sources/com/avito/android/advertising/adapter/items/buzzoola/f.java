package com.avito.android.advertising.adapter.items.buzzoola;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BuzzoolaGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f87300a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87301b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f87300a = provider;
        this.f87301b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f87300a.get(), (com.avito.android.advertising.a) this.f87301b.f393949a);
    }
}
