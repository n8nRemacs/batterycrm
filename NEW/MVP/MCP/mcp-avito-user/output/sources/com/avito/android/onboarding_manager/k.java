package com.avito.android.onboarding_manager;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingShowsStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f209444a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f209445b;

    public k(C30102l3 c30102l3, Provider provider) {
        this.f209444a = c30102l3;
        this.f209445b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Context) this.f209444a.get(), this.f209445b.get());
    }
}
