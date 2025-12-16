package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi;

import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentShortFlowCreationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f211592a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.g f211593b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<G> f211594c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f211595d;

    public e(Provider provider, com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.g gVar, Provider provider2, Provider provider3) {
        this.f211592a = provider;
        this.f211593b = gVar;
        this.f211594c = provider2;
        this.f211595d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f211592a.get(), (com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.d) this.f211593b.get(), this.f211594c.get(), this.f211595d.get());
    }
}
