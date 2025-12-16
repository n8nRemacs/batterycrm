package com.avito.android.credits.di;

import Ds.InterfaceC13437a;
import Ds.InterfaceC13438b;
import androidx.view.P0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditCalculatorModule_ProvideViewModel$_avito_credits_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<InterfaceC13437a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.advert.l> f128855a;

    /* renamed from: b, reason: collision with root package name */
    public final u f128856b;

    public h(u uVar, Provider provider) {
        this.f128855a = provider;
        this.f128856b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_core.advert.l lVar = this.f128855a.get();
        InterfaceC13438b interfaceC13438b = (InterfaceC13438b) this.f128856b.get();
        g.f128854a.getClass();
        return (InterfaceC13437a) new P0(lVar.b(), interfaceC13438b).a(Ds.e.class);
    }
}
