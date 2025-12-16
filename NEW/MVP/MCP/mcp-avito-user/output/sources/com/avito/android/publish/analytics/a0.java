package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishPhotosEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class a0 implements dagger.internal.h<Z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232191a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232192b;

    public a0(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f232191a = provider;
        this.f232192b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Z(this.f232191a.get(), this.f232192b.get());
    }
}
