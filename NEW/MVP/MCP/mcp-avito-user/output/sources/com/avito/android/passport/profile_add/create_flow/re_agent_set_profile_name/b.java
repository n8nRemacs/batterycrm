package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name;

import android.app.Application;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReAgentSetProfileNameDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f211409a;

    /* renamed from: b, reason: collision with root package name */
    public final l f211410b;

    public b(dv.b bVar, l lVar) {
        this.f211409a = bVar;
        this.f211410b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f211409a.get(), (Application) this.f211410b.f393949a);
    }
}
