package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishImageEnhanceEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<C33539z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232137a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232138b;

    public A(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f232137a = provider;
        this.f232138b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33539z(this.f232137a.get(), this.f232138b.get());
    }
}
