package com.avito.android.passport.profile_add.di;

import com.avito.android.passport.profile_add.create_flow.ReAgentShortFlowCreationDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PassportEditDeepLinkHandlerModule_ProvideReAgentShortFlowCreationDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create_flow.f f212298a;

    public h(com.avito.android.passport.profile_add.create_flow.f fVar) {
        this.f212298a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.create_flow.f fVar = this.f212298a;
        e.f212295a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ReAgentShortFlowCreationDeeplink.class, new com.avito.android.passport.profile_add.create_flow.g(), new C43834a.b.C11809b(fVar));
    }
}
