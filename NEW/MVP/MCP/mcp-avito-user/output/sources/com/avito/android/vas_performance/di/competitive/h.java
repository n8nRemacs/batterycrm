package com.avito.android.vas_performance.di.competitive;

import com.avito.android.vas_performance.deeplink.CompetitiveVasLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import tL0.C48571b;

/* compiled from: CompetitiveVasDeeplinkMappingsModule_ProvideCompetitiveVasDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.deeplink.handler.d f319951a;

    public h(com.avito.android.vas_performance.deeplink.handler.d dVar) {
        this.f319951a = dVar;
    }

    public static C43834a a(com.avito.android.vas_performance.deeplink.handler.d dVar) {
        g.f319950a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CompetitiveVasLink.class, new C48571b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CompetitiveVasLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f319951a);
    }
}
