package com.avito.android.travel_payment_selector.di;

import com.avito.android.travel_payment_methods.items.loan_terms.InterfaceC35262a;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentSelectorModule_ProvideResultActionItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302627a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.travel_payment_selector.view.items.title.b f302628b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.travel_payment_selector.view.items.description.b f302629c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.payment_method.a> f302630d;

    /* renamed from: e, reason: collision with root package name */
    public final u f302631e;

    public r(g gVar, com.avito.android.travel_payment_selector.view.items.title.b bVar, com.avito.android.travel_payment_selector.view.items.description.b bVar2, Provider provider, u uVar) {
        this.f302627a = gVar;
        this.f302628b = bVar;
        this.f302629c = bVar2;
        this.f302630d = provider;
        this.f302631e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.travel_payment_selector.view.items.title.a aVar = (com.avito.android.travel_payment_selector.view.items.title.a) this.f302628b.get();
        com.avito.android.travel_payment_selector.view.items.description.a aVar2 = (com.avito.android.travel_payment_selector.view.items.description.a) this.f302629c.get();
        com.avito.android.travel_payment_methods.items.payment_method.a aVar3 = this.f302630d.get();
        InterfaceC35262a interfaceC35262a = (InterfaceC35262a) this.f302631e.get();
        this.f302627a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(interfaceC35262a);
        return c10493a.a();
    }
}
