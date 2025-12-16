package com.avito.android.publish.price_list.di;

import com.avito.android.publish.price_list.di.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectPriceListModule_ProvideSelectPriceListSearchInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<com.avito.android.publish.price_list.domain.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.domain.c> f238526a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f238527b;

    public u(Provider<com.avito.android.publish.price_list.domain.c> provider, Provider<R0> provider2) {
        this.f238526a = provider;
        this.f238527b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.price_list.domain.c cVar = this.f238526a.get();
        R0 r02 = (R0) ((a.c.C7167a) this.f238527b).get();
        n.f238518a.getClass();
        return new com.avito.android.publish.price_list.domain.m(cVar.l(), r02);
    }
}
