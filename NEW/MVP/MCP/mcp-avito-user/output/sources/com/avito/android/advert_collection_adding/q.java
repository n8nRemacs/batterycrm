package com.avito.android.advert_collection_adding;

import com.avito.android.favorites.V;
import com.avito.android.favorites.W;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Provider;

/* compiled from: AdvertCollectionAddingInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class q implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f81934a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ZC.f> f81935b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<W> f81936c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<V> f81937d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.x> f81938e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f81939f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f81940g;

    public q(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f81934a = lVar;
        this.f81935b = provider;
        this.f81936c = provider2;
        this.f81937d = provider3;
        this.f81938e = provider4;
        this.f81939f = provider5;
        this.f81940g = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((List) this.f81934a.f393949a, dagger.internal.g.b(this.f81935b), this.f81936c.get(), this.f81937d.get(), this.f81938e.get(), this.f81939f.get(), (String) this.f81940g.f393949a);
    }
}
