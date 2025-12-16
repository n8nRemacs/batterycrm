package com.avito.android.cart_similar_items;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CartSimilarItemsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f115809a;

    public k(C30102l3 c30102l3) {
        this.f115809a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Context) this.f115809a.get());
    }
}
