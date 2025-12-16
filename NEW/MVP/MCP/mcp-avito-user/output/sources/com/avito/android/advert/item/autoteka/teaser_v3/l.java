package com.avito.android.advert.item.autoteka.teaser_v3;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaTeaserV3Filter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f73153a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f73154b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f73153a = provider;
        this.f73154b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f73153a.get(), (String) this.f73154b.f393949a);
    }
}
