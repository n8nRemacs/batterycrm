package com.avito.android.mortgage.landing.list.items.offers;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u00.InterfaceC48753a;

/* compiled from: OffersPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f199823a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f199824b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC48753a> f199825c;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f199823a = lVar;
        this.f199824b = lVar2;
        this.f199825c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Y41.l) this.f199823a.f393949a, (Y41.l) this.f199824b.f393949a, this.f199825c.get());
    }
}
