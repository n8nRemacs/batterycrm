package com.avito.android.re_agent_landing.deeplink;

import Qh0.C14897a;
import android.app.Application;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReAgentProfileCreateLandingDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C25721c f250540a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f250541b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.re_agent_landing.di.e f250542c;

    /* renamed from: d, reason: collision with root package name */
    public final l f250543d;

    public c(C25721c c25721c, dv.b bVar, com.avito.android.re_agent_landing.di.e eVar, l lVar) {
        this.f250540a = c25721c;
        this.f250541b = bVar;
        this.f250542c = eVar;
        this.f250543d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((C25719a) this.f250540a.get(), (a.InterfaceC4053a) this.f250541b.get(), (C14897a) this.f250542c.get(), (Application) this.f250543d.f393949a);
    }
}
