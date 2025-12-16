package com.avito.android.vas_planning_checkout.di;

import com.avito.android.vas_planning_checkout.deeplink.VasPlannerCheckoutLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VasPlanningCheckoutDeeplinkMappingsModule_ProvideVasPlanningCheckoutDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_planning_checkout.deeplink.b f322879a;

    public l(com.avito.android.vas_planning_checkout.deeplink.b bVar) {
        this.f322879a = bVar;
    }

    public static C43834a a(com.avito.android.vas_planning_checkout.deeplink.b bVar) {
        k.f322878a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VasPlannerCheckoutLink.class, new com.avito.android.vas_planning_checkout.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VasPlannerCheckoutLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f322879a);
    }
}
