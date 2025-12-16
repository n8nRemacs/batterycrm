package com.avito.android.bxcontent.di.module;

import com.avito.android.onboarding.t;
import javax.inject.Provider;

/* compiled from: BxContentOnboardingModule_ProvideBxOnboardingChainObserver$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class T implements dagger.internal.h<com.avito.android.onboarding.t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f110901a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.onboarding.v f110902b;

    public T(Provider provider, com.avito.android.onboarding.v vVar) {
        this.f110901a = provider;
        this.f110902b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f110901a.get();
        Object obj = (com.avito.android.onboarding.u) this.f110902b.get();
        S.f110900a.getClass();
        if (com.avito.android.util.E.a(c12.getF125491k())) {
            obj = t.a.f209384a;
        }
        dagger.internal.t.d(obj);
        return obj;
    }
}
