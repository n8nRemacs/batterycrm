package com.avito.android.installments.di;

import com.avito.android.deep_linking.links.InstallmentsOnboardingShowLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: InstallmentsDeepLinkHandlerModule_ProvideInstallmentsOnboardingDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.installments.onboarding.deeplink.c f172485a;

    public d(com.avito.android.installments.onboarding.deeplink.c cVar) {
        this.f172485a = cVar;
    }

    public static C43834a a(com.avito.android.installments.onboarding.deeplink.c cVar) {
        a.f172482a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(InstallmentsOnboardingShowLink.class, new com.avito.android.installments.onboarding.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(InstallmentsOnboardingShowLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f172485a);
    }
}
