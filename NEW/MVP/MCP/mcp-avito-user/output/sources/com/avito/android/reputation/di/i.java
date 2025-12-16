package com.avito.android.reputation.di;

import Hm0.InterfaceC14008b;
import Lm0.C14413a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideCriteriaLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<C14413a> {

    /* renamed from: a, reason: collision with root package name */
    public final Hm0.d f254738a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f254739b;

    public i(Hm0.d dVar, dv.b bVar) {
        this.f254738a = dVar;
        this.f254739b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14008b interfaceC14008b = (InterfaceC14008b) this.f254738a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f254739b.get();
        d.f254731a.getClass();
        return new C14413a(interfaceC14008b, interfaceC4053a);
    }
}
