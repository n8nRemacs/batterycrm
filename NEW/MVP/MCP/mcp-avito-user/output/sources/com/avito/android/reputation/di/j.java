package com.avito.android.reputation.di;

import Lm0.C14415c;
import com.avito.android.reputation.links.CriteriaLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideCriteriaLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f254740a;

    public j(i iVar) {
        this.f254740a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = this.f254740a;
        d.f254731a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CriteriaLink.class, new C14415c(), new C43834a.b.C11809b(iVar));
    }
}
