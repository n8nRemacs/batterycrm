package com.avito.android.orders.feature.beduin_orders_list.data;

import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinOrdersRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f210014a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<X40.a> f210015b;

    public e(Provider<R0> provider, Provider<X40.a> provider2) {
        this.f210014a = provider;
        this.f210015b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f210014a.get(), g.a(w.a(this.f210015b)));
    }
}
