package com.avito.android.reputation.di;

import Hm0.InterfaceC14008b;
import Pm0.C14810a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideReputationLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<C14810a> {

    /* renamed from: a, reason: collision with root package name */
    public final Hm0.d f254747a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f254748b;

    public o(Hm0.d dVar, dv.b bVar) {
        this.f254747a = dVar;
        this.f254748b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14008b interfaceC14008b = (InterfaceC14008b) this.f254747a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f254748b.get();
        d.f254731a.getClass();
        return new C14810a(interfaceC14008b, interfaceC4053a);
    }
}
