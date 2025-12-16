package com.avito.android.onboarding.dialog.interactor;

import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34389t0> f208853a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f208854b;

    public j(Provider<InterfaceC34389t0> provider, Provider<R0> provider2) {
        this.f208853a = provider;
        this.f208854b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f208854b.get(), dagger.internal.g.a(w.a(this.f208853a)));
    }
}
