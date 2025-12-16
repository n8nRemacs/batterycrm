package com.avito.android.str_seller_orders.orders;

import com.avito.android.str_seller_orders.orders.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersFragmentViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.orders.mvi.h f288845a;

    public c(com.avito.android.str_seller_orders.orders.mvi.h hVar) {
        this.f288845a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((g) this.f288845a.get(), null, 2, null);
    }
}
