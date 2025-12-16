package com.avito.android.vas_planning_checkout.domain;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanCheckoutConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f322887a;

    public i(dagger.internal.u uVar) {
        this.f322887a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.vas_planning_checkout.item.price.k) this.f322887a.get());
    }
}
