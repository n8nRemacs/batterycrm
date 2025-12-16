package com.avito.android.reputation.di;

import Hm0.InterfaceC14008b;
import Qm0.C14909a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideRestrictionLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<C14909a> {

    /* renamed from: a, reason: collision with root package name */
    public final Hm0.d f254750a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f254751b;

    public q(Hm0.d dVar, dv.b bVar) {
        this.f254750a = dVar;
        this.f254751b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14008b interfaceC14008b = (InterfaceC14008b) this.f254750a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f254751b.get();
        d.f254731a.getClass();
        return new C14909a(interfaceC14008b, interfaceC4053a);
    }
}
