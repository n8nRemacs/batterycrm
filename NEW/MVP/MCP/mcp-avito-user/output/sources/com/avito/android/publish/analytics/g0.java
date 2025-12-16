package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishVideoEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class g0 implements dagger.internal.h<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232243a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232244b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.H> f232245c;

    public g0(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2, Provider<com.avito.android.remote.H> provider3) {
        this.f232243a = provider;
        this.f232244b = provider2;
        this.f232245c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f0(this.f232243a.get(), this.f232244b.get(), this.f232245c.get());
    }
}
