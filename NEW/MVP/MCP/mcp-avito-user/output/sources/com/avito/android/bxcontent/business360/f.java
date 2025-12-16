package com.avito.android.bxcontent.business360;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BxContentReplaceMainExitOnboardingInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.replace_main.exit_onboarding.b> f109634a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding_manager.f> f109635b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.analytics.a> f109636c;

    public f(Provider<com.avito.android.replace_main.exit_onboarding.b> provider, Provider<com.avito.android.onboarding_manager.f> provider2, Provider<com.avito.android.bxcontent.analytics.a> provider3) {
        this.f109634a = provider;
        this.f109635b = provider2;
        this.f109636c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f109634a.get(), this.f109635b.get(), this.f109636c.get());
    }
}
