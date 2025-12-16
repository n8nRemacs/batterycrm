package com.avito.android.select.bottom_sheet.di;

import com.avito.android.select.bottom_sheet.blueprints.s;
import com.avito.android.select.bottom_sheet.blueprints.t;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBottomSheetModule_ProvideItemBinder$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.select.title.f> f265263a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.select.bottom_sheet.blueprints.b> f265264b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.select.bottom_sheet.blueprints.i> f265265c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.select.bottom_sheet.blueprints.e> f265266d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.select.bottom_sheet.blueprints.group.b> f265267e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.select.bottom_sheet.blueprints.chips.c f265268f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.select.bottom_sheet_pagination.blueprints.error.b f265269g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b f265270h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.select.bottom_sheet.blueprints.candy.b> f265271i;

    /* renamed from: j, reason: collision with root package name */
    public final t f265272j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.select.glow_animation.c f265273k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.select.collapsable_chips.d> f265274l;

    /* renamed from: m, reason: collision with root package name */
    public final u f265275m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.select.bottom_sheet.blueprints.icon_button_right.d f265276n;

    public e(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, com.avito.android.select.bottom_sheet.blueprints.chips.c cVar, com.avito.android.select.bottom_sheet_pagination.blueprints.error.b bVar, com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b bVar2, Provider provider6, t tVar, com.avito.android.select.glow_animation.c cVar2, Provider provider7, u uVar, com.avito.android.select.bottom_sheet.blueprints.icon_button_right.d dVar) {
        this.f265263a = provider;
        this.f265264b = provider2;
        this.f265265c = provider3;
        this.f265266d = provider4;
        this.f265267e = provider5;
        this.f265268f = cVar;
        this.f265269g = bVar;
        this.f265270h = bVar2;
        this.f265271i = provider6;
        this.f265272j = tVar;
        this.f265273k = cVar2;
        this.f265274l = provider7;
        this.f265275m = uVar;
        this.f265276n = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.select.title.f fVar = this.f265263a.get();
        com.avito.android.select.bottom_sheet.blueprints.b bVar = this.f265264b.get();
        com.avito.android.select.bottom_sheet.blueprints.i iVar = this.f265265c.get();
        com.avito.android.select.bottom_sheet.blueprints.e eVar = this.f265266d.get();
        com.avito.android.select.bottom_sheet.blueprints.group.b bVar2 = this.f265267e.get();
        com.avito.android.select.bottom_sheet.blueprints.chips.b bVar3 = (com.avito.android.select.bottom_sheet.blueprints.chips.b) this.f265268f.get();
        com.avito.android.select.bottom_sheet_pagination.blueprints.error.a aVar = (com.avito.android.select.bottom_sheet_pagination.blueprints.error.a) this.f265269g.get();
        com.avito.android.select.bottom_sheet_pagination.blueprints.loading.a aVar2 = (com.avito.android.select.bottom_sheet_pagination.blueprints.loading.a) this.f265270h.get();
        com.avito.android.select.bottom_sheet.blueprints.candy.b bVar4 = this.f265271i.get();
        s sVar = (s) this.f265272j.get();
        com.avito.android.select.glow_animation.b bVar5 = (com.avito.android.select.glow_animation.b) this.f265273k.get();
        com.avito.android.select.collapsable_chips.d dVar = this.f265274l.get();
        com.avito.android.select.bottom_sheet.blueprints.nd_trx.b bVar6 = (com.avito.android.select.bottom_sheet.blueprints.nd_trx.b) this.f265275m.get();
        com.avito.android.select.bottom_sheet.blueprints.icon_button_right.c cVar = (com.avito.android.select.bottom_sheet.blueprints.icon_button_right.c) this.f265276n.get();
        int i12 = c.f265261a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(fVar);
        c10493a.b(bVar);
        c10493a.b(iVar);
        c10493a.b(eVar);
        c10493a.b(bVar2);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(dVar);
        c10493a.b(bVar4);
        c10493a.b(sVar);
        c10493a.b(bVar5);
        c10493a.b(bVar6);
        c10493a.b(bVar3);
        c10493a.b(cVar);
        return c10493a.a();
    }
}
