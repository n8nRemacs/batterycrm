package com.avito.android.re_agent_landing.di;

import com.avito.android.re_agent_landing.deeplink.ReAgentProfileCreateLandingDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReAgentProfileCreateLandingDeepLinkHandlerModule_ProvideReAgentProfileCreateLandingDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.re_agent_landing.deeplink.c f250545a;

    public b(com.avito.android.re_agent_landing.deeplink.c cVar) {
        this.f250545a = cVar;
    }

    public static C43834a a(com.avito.android.re_agent_landing.deeplink.c cVar) {
        a.f250544a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ReAgentProfileCreateLandingDeeplink.class, new com.avito.android.re_agent_landing.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ReAgentProfileCreateLandingDeeplink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f250545a);
    }
}
