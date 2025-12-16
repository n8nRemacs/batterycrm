package com.avito.android.services_onboarding.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesOnboardingAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f279941a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f279942b;

    public e(dagger.internal.l lVar, Provider provider) {
        this.f279941a = provider;
        this.f279942b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f279941a.get(), (Integer) this.f279942b.f393949a);
    }
}
