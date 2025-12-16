package com.avito.android.analytics.screens;

import Ec.InterfaceC13473b;
import javax.inject.Provider;

/* compiled from: TrackerInfoProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13473b> f90376a;

    public I(Provider<InterfaceC13473b> provider) {
        this.f90376a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f90376a.get());
    }
}
