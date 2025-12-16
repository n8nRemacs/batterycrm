package com.avito.android.advert_collection;

import com.avito.android.favorites.InterfaceC30603b;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Provider;

/* compiled from: AdvertCollectionInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZC.f> f81531a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f81532b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f81533c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f81534d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f81535e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f81536f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.x> f81537g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<E7.a> f81538h;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f81531a = provider;
        this.f81532b = lVar;
        this.f81533c = lVar2;
        this.f81534d = lVar3;
        this.f81535e = uVar;
        this.f81536f = provider2;
        this.f81537g = provider3;
        this.f81538h = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f81531a.get(), (String) this.f81532b.f393949a, (String) this.f81533c.f393949a, (String) this.f81534d.f393949a, (InterfaceC30603b) this.f81535e.get(), this.f81536f.get(), this.f81537g.get(), this.f81538h.get());
    }
}
