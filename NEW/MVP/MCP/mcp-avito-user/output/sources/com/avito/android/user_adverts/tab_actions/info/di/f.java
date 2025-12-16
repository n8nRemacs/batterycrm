package com.avito.android.user_adverts.tab_actions.info.di;

import com.avito.android.user_adverts.tab_actions.info.di.a;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wJ0.InterfaceC49521b;
import xJ0.InterfaceC49850b;

/* compiled from: UserAdvertsActionResultInfoModule_ProvideResultActionItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49850b> f314652a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f314653b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.tab_actions.info.items.block.c f314654c;

    public f(Provider provider, Provider provider2, com.avito.android.user_adverts.tab_actions.info.items.block.c cVar) {
        this.f314652a = provider;
        this.f314653b = provider2;
        this.f314654c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        InterfaceC49850b interfaceC49850bX1 = ((a.c.d) this.f314652a).f314649a.x1();
        com.avito.android.util.text.a aVarE = ((a.c.C9729a) this.f314653b).f314646a.e();
        com.avito.android.user_adverts.tab_actions.info.items.block.b bVar = (com.avito.android.user_adverts.tab_actions.info.items.block.b) this.f314654c.get();
        d.f314650a.getClass();
        InterfaceC49521b interfaceC49521bA = InterfaceC49850b.a.a(interfaceC49850bX1, null, new InterfaceC49850b.InterfaceC12859b.a(aVarE, null, 2, null), 15).a();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(interfaceC49521bA);
        c10493a.b(bVar);
        return c10493a.a();
    }
}
