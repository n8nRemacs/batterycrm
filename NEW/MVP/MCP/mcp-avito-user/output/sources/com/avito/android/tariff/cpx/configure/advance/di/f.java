package com.avito.android.tariff.cpx.configure.advance.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureAdvanceListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.advance.items.header.c f295587a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.advance.items.cards.d f295588b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.advance.items.chips.d f295589c;

    public f(com.avito.android.tariff.cpx.configure.advance.items.header.c cVar, com.avito.android.tariff.cpx.configure.advance.items.cards.d dVar, com.avito.android.tariff.cpx.configure.advance.items.chips.d dVar2) {
        this.f295587a = cVar;
        this.f295588b = dVar;
        this.f295589c = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff.cpx.configure.advance.items.header.b bVar = (com.avito.android.tariff.cpx.configure.advance.items.header.b) this.f295587a.get();
        com.avito.android.tariff.cpx.configure.advance.items.cards.c cVar = (com.avito.android.tariff.cpx.configure.advance.items.cards.c) this.f295588b.get();
        com.avito.android.tariff.cpx.configure.advance.items.chips.c cVar2 = (com.avito.android.tariff.cpx.configure.advance.items.chips.c) this.f295589c.get();
        d.f295585a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(cVar);
        c10493a.b(cVar2);
        return c10493a.a();
    }
}
