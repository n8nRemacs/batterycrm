package com.avito.android.onboarding.dialog.mvi;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingDialogActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A40.a> f208932a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding.dialog.interactor.a> f208933b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding.dialog.interactor.e> f208934c;

    /* renamed from: d, reason: collision with root package name */
    public final u f208935d;

    /* renamed from: e, reason: collision with root package name */
    public final C15204c f208936e;

    public j(Provider provider, Provider provider2, Provider provider3, u uVar, C15204c c15204c) {
        this.f208932a = provider;
        this.f208933b = provider2;
        this.f208934c = provider3;
        this.f208935d = uVar;
        this.f208936e = c15204c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f208932a.get(), this.f208933b.get(), this.f208934c.get(), (com.avito.android.onboarding.dialog.interactor.k) this.f208935d.get(), (InterfaceC15202a) this.f208936e.get());
    }
}
