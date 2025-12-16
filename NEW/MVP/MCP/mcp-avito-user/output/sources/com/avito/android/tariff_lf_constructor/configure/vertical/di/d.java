package com.avito.android.tariff_lf_constructor.configure.vertical.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureVerticalModule_ProvideItemBinder$_avito_tariff_lf_constructor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.c f300576a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.vertical.items.content.c f300577b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.c f300578c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.vertical.items.text.c f300579d;

    public d(com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.c cVar, com.avito.android.tariff_lf_constructor.configure.vertical.items.content.c cVar2, com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.c cVar3, com.avito.android.tariff_lf_constructor.configure.vertical.items.text.c cVar4) {
        this.f300576a = cVar;
        this.f300577b = cVar2;
        this.f300578c = cVar3;
        this.f300579d = cVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.b bVar = (com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.b) this.f300576a.get();
        com.avito.android.tariff_lf_constructor.configure.vertical.items.content.b bVar2 = (com.avito.android.tariff_lf_constructor.configure.vertical.items.content.b) this.f300577b.get();
        com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.b bVar3 = (com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.b) this.f300578c.get();
        com.avito.android.tariff_lf_constructor.configure.vertical.items.text.b bVar4 = (com.avito.android.tariff_lf_constructor.configure.vertical.items.text.b) this.f300579d.get();
        b.f300574a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(bVar4);
        return c10493a.a();
    }
}
