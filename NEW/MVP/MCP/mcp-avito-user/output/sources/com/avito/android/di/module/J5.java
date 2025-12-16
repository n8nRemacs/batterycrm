package com.avito.android.di.module;

import com.avito.android.main_start_onboarding.MainStartOnboardingChainInteractorImpl;
import com.avito.android.main_start_onboarding.a;
import javax.inject.Provider;

/* compiled from: MainStartOnboardingChainInteractorModule_ProvideFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J5 implements dagger.internal.h<com.avito.android.main_start_onboarding.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144017a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.main_start_onboarding.b f144018b;

    public J5(Provider provider, com.avito.android.main_start_onboarding.b bVar) {
        this.f144017a = provider;
        this.f144018b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f144017a.get();
        Object obj = (MainStartOnboardingChainInteractorImpl) this.f144018b.get();
        I5.f144007a.getClass();
        if (com.avito.android.util.E.a(c12.getF125491k())) {
            obj = a.C5402a.f184226a;
        }
        dagger.internal.t.d(obj);
        return obj;
    }
}
