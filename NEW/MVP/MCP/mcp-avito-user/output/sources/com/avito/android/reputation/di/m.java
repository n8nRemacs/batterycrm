package com.avito.android.reputation.di;

import Hm0.InterfaceC14008b;
import Nm0.C14589a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideGrayStateLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<C14589a> {

    /* renamed from: a, reason: collision with root package name */
    public final Hm0.d f254744a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f254745b;

    public m(Hm0.d dVar, dv.b bVar) {
        this.f254744a = dVar;
        this.f254745b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14008b interfaceC14008b = (InterfaceC14008b) this.f254744a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f254745b.get();
        d.f254731a.getClass();
        return new C14589a(interfaceC14008b, interfaceC4053a);
    }
}
