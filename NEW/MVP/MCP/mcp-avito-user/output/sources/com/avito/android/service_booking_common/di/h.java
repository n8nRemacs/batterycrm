package com.avito.android.service_booking_common.di;

import com.avito.android.service_booking_common.link.onboarding.ServicesSteppedOnboardingLink;
import lv.C43834a;

/* compiled from: ServiceBookingCommonLinkHandlerModule_ProvideServiceBookingOnboardingMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_common.link.onboarding.b f276516a;

    public h(com.avito.android.service_booking_common.link.onboarding.b bVar) {
        this.f276516a = bVar;
    }

    public static C43834a a(com.avito.android.service_booking_common.link.onboarding.b bVar) {
        C34929e.f276513a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServicesSteppedOnboardingLink.class, new ServicesSteppedOnboardingLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServicesSteppedOnboardingLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f276516a);
    }
}
