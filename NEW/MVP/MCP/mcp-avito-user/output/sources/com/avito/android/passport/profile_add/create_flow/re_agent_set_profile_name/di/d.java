package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameArgs;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReAgentSetProfileNameModule_ProvideFlowFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<ProfileCreateExtendedFlow> {

    /* renamed from: a, reason: collision with root package name */
    public final l f211441a;

    public d(l lVar) {
        this.f211441a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ReAgentSetProfileNameArgs reAgentSetProfileNameArgs = (ReAgentSetProfileNameArgs) this.f211441a.f393949a;
        c.f211440a.getClass();
        ProfileCreateExtendedFlow profileCreateExtendedFlow = reAgentSetProfileNameArgs.f211378e;
        t.d(profileCreateExtendedFlow);
        return profileCreateExtendedFlow;
    }
}
