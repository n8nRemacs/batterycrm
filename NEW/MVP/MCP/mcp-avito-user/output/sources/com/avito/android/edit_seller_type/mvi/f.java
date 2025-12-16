package com.avito.android.edit_seller_type.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditSellerTypeBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.edit_seller_type.interactor.c f146834a;

    public f(com.avito.android.edit_seller_type.interactor.c cVar) {
        this.f146834a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.edit_seller_type.interactor.a) this.f146834a.get());
    }
}
