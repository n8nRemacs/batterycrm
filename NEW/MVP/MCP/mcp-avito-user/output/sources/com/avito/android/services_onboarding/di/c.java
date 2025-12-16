package com.avito.android.services_onboarding.di;

import com.avito.android.deep_linking.links.ServicesCpxOnboardingLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServicesCpxOnboardingLinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.services_onboarding.deeplink.b f279851a;

    public c(com.avito.android.services_onboarding.deeplink.b bVar) {
        this.f279851a = bVar;
    }

    public static C43834a a(com.avito.android.services_onboarding.deeplink.b bVar) {
        b.f279850a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServicesCpxOnboardingLink.class, new ServicesCpxOnboardingLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServicesCpxOnboardingLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f279851a);
    }
}
