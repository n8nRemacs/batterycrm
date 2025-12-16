package com.avito.android.passport.profile_add.create_flow;

import android.app.Application;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReAgentShortFlowCreationDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f211358a;

    /* renamed from: b, reason: collision with root package name */
    public final l f211359b;

    public f(dv.b bVar, l lVar) {
        this.f211358a = bVar;
        this.f211359b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((a.InterfaceC4053a) this.f211358a.get(), (Application) this.f211359b.f393949a);
    }
}
