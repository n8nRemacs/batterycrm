package com.avito.android.publish;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dl0.InterfaceC39749a;
import javax.inject.Provider;

/* compiled from: PriceAbuseInteractorFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39749a> f231947a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f231948b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f231949c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.Z0> f231950d;

    public N(Provider<InterfaceC39749a> provider, Provider<InterfaceC35745a5> provider2, Provider<InterfaceC28373a> provider3, Provider<com.avito.android.Z0> provider4) {
        this.f231947a = provider;
        this.f231948b = provider2;
        this.f231949c = provider3;
        this.f231950d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new M(this.f231947a.get(), this.f231948b.get(), this.f231949c.get(), this.f231950d.get());
    }
}
