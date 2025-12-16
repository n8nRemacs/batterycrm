package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: PublishCheckVerificationEventTracker_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.analytics.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33526l implements dagger.internal.h<C33525k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232260a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f232261b;

    public C33526l(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.a> provider2) {
        this.f232260a = provider;
        this.f232261b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33525k(this.f232260a.get(), this.f232261b.get());
    }
}
