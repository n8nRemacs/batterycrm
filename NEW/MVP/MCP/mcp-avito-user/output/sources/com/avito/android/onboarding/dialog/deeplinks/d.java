package com.avito.android.onboarding.dialog.deeplinks;

import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingDeepLinkHandlerInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34389t0> f208770a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f208771b;

    public d(Provider<InterfaceC34389t0> provider, Provider<R0> provider2) {
        this.f208770a = provider;
        this.f208771b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f208770a.get(), this.f208771b.get());
    }
}
