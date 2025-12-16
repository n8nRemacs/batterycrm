package com.avito.android.reputation.di;

import Hm0.InterfaceC14008b;
import Om0.C14710a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideGrayStateCriteriaLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<C14710a> {

    /* renamed from: a, reason: collision with root package name */
    public final Hm0.d f254741a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f254742b;

    public k(Hm0.d dVar, dv.b bVar) {
        this.f254741a = dVar;
        this.f254742b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14008b interfaceC14008b = (InterfaceC14008b) this.f254741a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f254742b.get();
        d.f254731a.getClass();
        return new C14710a(interfaceC14008b, interfaceC4053a);
    }
}
