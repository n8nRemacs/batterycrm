package com.avito.android.str_seller_orders.strsellerordersdialog.mvi;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersDialogReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f290165a;

    public k(Provider<J0> provider) {
        this.f290165a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f290165a.get());
    }
}
