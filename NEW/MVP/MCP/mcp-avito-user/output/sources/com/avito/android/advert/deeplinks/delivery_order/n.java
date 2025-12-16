package com.avito.android.advert.deeplinks.delivery_order;

import com.avito.android.remote.B;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryOrderCreateInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B> f69007a;

    public n(Provider<B> provider) {
        this.f69007a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(dagger.internal.g.b(this.f69007a));
    }
}
