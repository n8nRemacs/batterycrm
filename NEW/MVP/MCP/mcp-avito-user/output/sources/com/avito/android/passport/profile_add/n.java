package com.avito.android.passport.profile_add;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileStateProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f213539a;

    public n(Provider<InterfaceC35863o4> provider) {
        this.f213539a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f213539a.get());
    }
}
