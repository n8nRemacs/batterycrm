package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameArgs;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentSetProfileNameActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f211497a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f211498b;

    /* renamed from: c, reason: collision with root package name */
    public final u f211499c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f211500d;

    public g(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f211497a = lVar;
        this.f211498b = provider;
        this.f211499c = uVar;
        this.f211500d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((ReAgentSetProfileNameArgs) this.f211497a.f393949a, this.f211498b.get(), (com.avito.android.passport.profile_add.domain.interactor.a) this.f211499c.get(), this.f211500d.get());
    }
}
