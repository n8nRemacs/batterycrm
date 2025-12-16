package com.avito.android.advert.item.autoteka.teaser;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaTeaserFilter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f73050a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f73051b;

    public p(dagger.internal.l lVar, Provider provider) {
        this.f73050a = provider;
        this.f73051b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f73050a.get(), (String) this.f73051b.f393949a);
    }
}
