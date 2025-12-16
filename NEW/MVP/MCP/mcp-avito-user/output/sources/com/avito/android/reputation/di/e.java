package com.avito.android.reputation.di;

import Hm0.InterfaceC14008b;
import Km0.C14330a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideBenefitLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<C14330a> {

    /* renamed from: a, reason: collision with root package name */
    public final Hm0.d f254732a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f254733b;

    public e(Hm0.d dVar, dv.b bVar) {
        this.f254732a = dVar;
        this.f254733b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14008b interfaceC14008b = (InterfaceC14008b) this.f254732a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f254733b.get();
        d.f254731a.getClass();
        return new C14330a(interfaceC14008b, interfaceC4053a);
    }
}
