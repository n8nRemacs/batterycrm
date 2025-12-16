package com.avito.android.advert.item.beduin.v2.favorite;

import com.avito.android.favorite.m;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteButtonComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f73331a;

    /* renamed from: b, reason: collision with root package name */
    public final m f73332b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f73333c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f73334d;

    public f(dagger.internal.l lVar, m mVar, dagger.internal.f fVar, Provider provider) {
        this.f73331a = lVar;
        this.f73332b = mVar;
        this.f73333c = fVar;
        this.f73334d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.a) this.f73331a.f393949a, (com.avito.android.favorite.h) this.f73332b.get(), (com.avito.android.deep_linking.x) this.f73333c.get(), this.f73334d.get());
    }
}
