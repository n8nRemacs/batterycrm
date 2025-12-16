package com.avito.android.onboarding.steps.di;

import com.avito.android.deep_linking.links.OnboardingStepsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: OnboardingStepsDeepLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f209304a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.onboarding.steps.d f209305b;

    public d(c cVar, com.avito.android.onboarding.steps.d dVar) {
        this.f209304a = cVar;
        this.f209305b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.onboarding.steps.d dVar = this.f209305b;
        this.f209304a.getClass();
        return new C43834a(OnboardingStepsLink.class, null, new C43834a.b.C11809b(dVar));
    }
}
