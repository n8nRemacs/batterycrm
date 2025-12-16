package com.avito.android.reputation.di;

import Hm0.InterfaceC14008b;
import Mm0.C14508a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideCriteriaDetailsLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<C14508a> {

    /* renamed from: a, reason: collision with root package name */
    public final Hm0.d f254735a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f254736b;

    public g(Hm0.d dVar, dv.b bVar) {
        this.f254735a = dVar;
        this.f254736b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14008b interfaceC14008b = (InterfaceC14008b) this.f254735a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f254736b.get();
        d.f254731a.getClass();
        return new C14508a(interfaceC14008b, interfaceC4053a);
    }
}
