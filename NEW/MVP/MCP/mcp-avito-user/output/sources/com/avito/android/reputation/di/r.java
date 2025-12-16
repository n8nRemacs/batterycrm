package com.avito.android.reputation.di;

import Qm0.C14911c;
import com.avito.android.reputation.links.RestrictionLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideRestrictionLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f254752a;

    public r(q qVar) {
        this.f254752a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = this.f254752a;
        d.f254731a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RestrictionLink.class, new C14911c(), new C43834a.b.C11809b(qVar));
    }
}
