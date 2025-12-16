package com.avito.android.vas_planning_checkout.item.checkout;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PlanCheckoutBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f322925a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f322926b;

    public c(g gVar, Provider provider) {
        this.f322925a = gVar;
        this.f322926b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f322925a.get(), this.f322926b.get());
    }
}
