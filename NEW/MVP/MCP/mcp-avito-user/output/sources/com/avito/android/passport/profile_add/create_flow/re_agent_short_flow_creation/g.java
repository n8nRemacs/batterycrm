package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation;

import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentShortFlowCreationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f211569a;

    public g(Provider<InterfaceC34401z0> provider) {
        this.f211569a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f211569a.get());
    }
}
