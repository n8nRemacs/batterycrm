package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishImagePerceptionEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232141a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232142b;

    public D(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f232141a = provider;
        this.f232142b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f232141a.get(), this.f232142b.get());
    }
}
