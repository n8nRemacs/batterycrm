package com.avito.android.mortgage.landing.list.items.offers;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OffersBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f199804a;

    public d(j jVar) {
        this.f199804a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((i) this.f199804a.get());
    }
}
