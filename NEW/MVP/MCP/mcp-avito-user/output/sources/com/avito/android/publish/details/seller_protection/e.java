package com.avito.android.publish.details.seller_protection;

import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: SellerProtectionInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Q1> f234938a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f234939b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C50213a> f234940c;

    public e(Provider<Q1> provider, Provider<InterfaceC28373a> provider2, Provider<C50213a> provider3) {
        this.f234938a = provider;
        this.f234939b = provider2;
        this.f234940c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f234938a.get(), this.f234939b.get(), this.f234940c.get());
    }
}
