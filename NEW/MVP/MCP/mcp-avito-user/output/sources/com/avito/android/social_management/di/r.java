package com.avito.android.social_management.di;

import dagger.internal.x;
import dagger.internal.y;
import jx0.InterfaceC42441a;

/* compiled from: SocialManagementPluginModule_ProvideAuthorizationPluginFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final jx0.c f284672a;

    public r(jx0.c cVar) {
        this.f284672a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42441a interfaceC42441a = (InterfaceC42441a) this.f284672a.get();
        q.f284671a.getClass();
        return new p(interfaceC42441a);
    }
}
