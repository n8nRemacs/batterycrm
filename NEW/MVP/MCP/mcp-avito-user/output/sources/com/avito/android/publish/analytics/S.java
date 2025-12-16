package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishLlmDescriptionEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232183a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232184b;

    public S(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f232183a = provider;
        this.f232184b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q(this.f232183a.get(), this.f232184b.get());
    }
}
