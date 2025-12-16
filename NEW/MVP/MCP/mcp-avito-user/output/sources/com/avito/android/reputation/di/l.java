package com.avito.android.reputation.di;

import Om0.C14712c;
import com.avito.android.reputation.links.GrayStateCriteriaLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideGrayStateCriteriaLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f254743a;

    public l(k kVar) {
        this.f254743a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = this.f254743a;
        d.f254731a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GrayStateCriteriaLink.class, new C14712c(), new C43834a.b.C11809b(kVar));
    }
}
