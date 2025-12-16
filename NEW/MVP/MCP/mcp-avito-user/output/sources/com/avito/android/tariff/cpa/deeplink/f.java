package com.avito.android.tariff.cpa.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpa.configure_advance.viewmodel.o;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpaConfigureSaveHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f294574a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f294575b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f294576c;

    /* renamed from: d, reason: collision with root package name */
    public final o f294577d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f294578e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f294579f;

    public f(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, o oVar, dv.b bVar3, Provider provider) {
        this.f294574a = fVar;
        this.f294575b = bVar;
        this.f294576c = bVar2;
        this.f294577d = oVar;
        this.f294578e = bVar3;
        this.f294579f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.deeplink_handler.handler.composite.a) this.f294574a.get(), (a.g) this.f294575b.get(), (a.i) this.f294576c.get(), (com.avito.android.tariff.cpa.configure_advance.viewmodel.j) this.f294577d.get(), (a.InterfaceC4053a) this.f294578e.get(), this.f294579f.get());
    }
}
