package com.avito.android.tariff.cpa.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpa.prepaid_expense.viewmodel.o;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpaPublicationSaveHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f294590a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f294591b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f294592c;

    /* renamed from: d, reason: collision with root package name */
    public final o f294593d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f294594e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f294595f;

    public m(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, o oVar, dv.b bVar3, Provider provider) {
        this.f294590a = fVar;
        this.f294591b = bVar;
        this.f294592c = bVar2;
        this.f294593d = oVar;
        this.f294594e = bVar3;
        this.f294595f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.deeplink_handler.handler.composite.a) this.f294590a.get(), (a.g) this.f294591b.get(), (a.i) this.f294592c.get(), (com.avito.android.tariff.cpa.prepaid_expense.viewmodel.j) this.f294593d.get(), (a.InterfaceC4053a) this.f294594e.get(), this.f294595f.get());
    }
}
