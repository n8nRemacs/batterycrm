package com.avito.android.advert_details_items.flats.auto_flats_redesign;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.flats.c> f84715a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f84716b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43617a> f84717c;

    public k(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f84715a = provider;
        this.f84716b = fVar;
        this.f84717c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f84715a.get(), (com.avito.android.advert_core.advert.k) this.f84716b.get(), this.f84717c.get());
    }
}
