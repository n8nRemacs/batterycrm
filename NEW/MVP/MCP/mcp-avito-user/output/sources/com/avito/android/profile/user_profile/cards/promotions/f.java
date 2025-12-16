package com.avito.android.profile.user_profile.cards.promotions;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vm.InterfaceC49346a;
import vm.InterfaceC49348c;

/* compiled from: PromotionsCardPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f225271a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49348c> f225272b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC49346a> f225273c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f225271a = lVar;
        this.f225272b = provider;
        this.f225273c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f225271a.f393949a, this.f225272b.get(), this.f225273c.get());
    }
}
