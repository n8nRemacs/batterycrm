package com.avito.android.reputation.di;

import com.avito.android.reputation.links.CriteriaDetailsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideCriteriaDetailsLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f254737a;

    public h(g gVar) {
        this.f254737a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f254737a;
        d.f254731a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CriteriaDetailsLink.class, new Mm0.c(), new C43834a.b.C11809b(gVar));
    }
}
