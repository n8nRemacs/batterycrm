package com.avito.android.publish.price_list.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final u f238917a;

    public r(u uVar) {
        this.f238917a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.publish.price_list.domain.j) this.f238917a.get());
    }
}
