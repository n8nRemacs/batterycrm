package com.avito.android.brandspace.brandspace.mvi;

import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BrandspaceOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<BrandspaceAnalyticsInteractor> f107672a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f107673b;

    public k(Provider<BrandspaceAnalyticsInteractor> provider, Provider<InterfaceC40691b> provider2) {
        this.f107672a = provider;
        this.f107673b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f107672a.get(), this.f107673b.get());
    }
}
