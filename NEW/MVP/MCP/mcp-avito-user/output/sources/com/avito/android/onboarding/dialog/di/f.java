package com.avito.android.onboarding.dialog.di;

import com.avito.android.onboarding.OnboardingLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: OnboardingDeepLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.onboarding.dialog.deeplinks.f f208815a;

    public f(com.avito.android.onboarding.dialog.deeplinks.f fVar) {
        this.f208815a = fVar;
    }

    public static C43834a a(com.avito.android.onboarding.dialog.deeplinks.f fVar) {
        e.f208814a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(OnboardingLink.class, new com.avito.android.onboarding.dialog.deeplinks.g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OnboardingLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f208815a);
    }
}
