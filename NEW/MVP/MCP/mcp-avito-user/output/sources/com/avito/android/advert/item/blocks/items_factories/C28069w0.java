package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import com.avito.android.advert.InterfaceC28240u;
import javax.inject.Provider;

/* compiled from: AdvertDetailsConsultationItemsFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.w0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28069w0 implements dagger.internal.h<C28063v0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74046a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.realty_quiz_banner.k> f74047b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28240u> f74048c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C29640d> f74049d;

    public C28069w0(Provider<com.avito.android.advert.item.similars.j> provider, Provider<com.avito.android.advert.item.realty_quiz_banner.k> provider2, Provider<InterfaceC28240u> provider3, Provider<C29640d> provider4) {
        this.f74046a = provider;
        this.f74047b = provider2;
        this.f74048c = provider3;
        this.f74049d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28063v0(this.f74046a.get(), this.f74047b.get(), this.f74048c.get(), this.f74049d.get());
    }
}
