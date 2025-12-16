package com.avito.android.reputation.di;

import com.avito.android.reputation.links.BenefitLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideBenefitLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f254734a;

    public f(e eVar) {
        this.f254734a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f254734a;
        d.f254731a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BenefitLink.class, new Km0.c(), new C43834a.b.C11809b(eVar));
    }
}
