package com.avito.android.service_fee_conditions.di;

import com.avito.android.service_fee_conditions.deeplink.ServiceFeeConditionsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceFeeConditionsDeeplinkMappingsModule_ProvideCpxConfigureLandingMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_fee_conditions.deeplink.b f278424a;

    public f(com.avito.android.service_fee_conditions.deeplink.b bVar) {
        this.f278424a = bVar;
    }

    public static C43834a a(com.avito.android.service_fee_conditions.deeplink.b bVar) {
        e.f278423a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceFeeConditionsLink.class, new com.avito.android.service_fee_conditions.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceFeeConditionsLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f278424a);
    }
}
