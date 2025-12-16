package com.avito.android.reputation.di;

import Pm0.C14812c;
import com.avito.android.reputation.links.ReputationLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideReputationLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final o f254749a;

    public p(o oVar) {
        this.f254749a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f254731a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ReputationLink.class, new C14812c(), new C43834a.b.C11809b(this.f254749a));
    }
}
