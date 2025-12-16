package com.avito.android.passport.profile_add.di;

import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PassportEditDeepLinkHandlerModule_ProvideReAgentSetProfileNameDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.b f212297a;

    public g(com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.b bVar) {
        this.f212297a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.b bVar = this.f212297a;
        e.f212295a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ReAgentSetProfileNameDeeplink.class, new com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.c(), new C43834a.b.C11809b(bVar));
    }
}
