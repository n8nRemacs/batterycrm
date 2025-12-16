package com.avito.android.profile.remove.screen.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RemoveItemListModule_ProvideItemBinder$_avito_profile_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.title.c f224037a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.link.c f224038b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.text.c f224039c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.subtitle.c f224040d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.header.c f224041e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.banner.c f224042f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.text_area_item.b f224043g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.list_item.c f224044h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.profile.remove.screen.items.spacer.c f224045i;

    public i(com.avito.android.profile.remove.screen.items.title.c cVar, com.avito.android.profile.remove.screen.items.link.c cVar2, com.avito.android.profile.remove.screen.items.text.c cVar3, com.avito.android.profile.remove.screen.items.subtitle.c cVar4, com.avito.android.profile.remove.screen.items.header.c cVar5, com.avito.android.profile.remove.screen.items.banner.c cVar6, com.avito.android.profile.remove.screen.items.text_area_item.b bVar, com.avito.android.profile.remove.screen.items.list_item.c cVar7, com.avito.android.profile.remove.screen.items.spacer.c cVar8) {
        this.f224037a = cVar;
        this.f224038b = cVar2;
        this.f224039c = cVar3;
        this.f224040d = cVar4;
        this.f224041e = cVar5;
        this.f224042f = cVar6;
        this.f224043g = bVar;
        this.f224044h = cVar7;
        this.f224045i = cVar8;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.profile.remove.screen.items.title.b bVar = (com.avito.android.profile.remove.screen.items.title.b) this.f224037a.get();
        com.avito.android.profile.remove.screen.items.link.b bVar2 = (com.avito.android.profile.remove.screen.items.link.b) this.f224038b.get();
        com.avito.android.profile.remove.screen.items.text.b bVar3 = (com.avito.android.profile.remove.screen.items.text.b) this.f224039c.get();
        com.avito.android.profile.remove.screen.items.subtitle.b bVar4 = (com.avito.android.profile.remove.screen.items.subtitle.b) this.f224040d.get();
        com.avito.android.profile.remove.screen.items.header.b bVar5 = (com.avito.android.profile.remove.screen.items.header.b) this.f224041e.get();
        com.avito.android.profile.remove.screen.items.banner.b bVar6 = (com.avito.android.profile.remove.screen.items.banner.b) this.f224042f.get();
        com.avito.android.profile.remove.screen.items.text_area_item.a aVar = (com.avito.android.profile.remove.screen.items.text_area_item.a) this.f224043g.get();
        com.avito.android.profile.remove.screen.items.list_item.b bVar7 = (com.avito.android.profile.remove.screen.items.list_item.b) this.f224044h.get();
        com.avito.android.profile.remove.screen.items.spacer.b bVar8 = (com.avito.android.profile.remove.screen.items.spacer.b) this.f224045i.get();
        f.f224033a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(bVar4);
        c10493a.b(bVar5);
        c10493a.b(bVar6);
        c10493a.b(aVar);
        c10493a.b(bVar7);
        c10493a.b(bVar8);
        return c10493a.a();
    }
}
