package com.avito.android.advert.item.services_repair;

import com.avito.android.B2;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesRealtyDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f79986a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.a> f79987b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B2> f79988c;

    public c(Provider<R0> provider, Provider<com.avito.android.advert.item.similars.a> provider2, Provider<B2> provider3) {
        this.f79986a = provider;
        this.f79987b = provider2;
        this.f79988c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f79986a.get(), this.f79987b.get(), this.f79988c.get());
    }
}
