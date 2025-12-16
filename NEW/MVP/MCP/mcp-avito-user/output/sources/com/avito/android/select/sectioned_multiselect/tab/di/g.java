package com.avito.android.select.sectioned_multiselect.tab.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectTabModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_list.c f266753a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.c f266754b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.c f266755c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.c f266756d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.select.glow_animation.c f266757e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b f266758f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.select.bottom_sheet_pagination.blueprints.error.b f266759g;

    public g(com.avito.android.select.sectioned_multiselect.Items.section_list.c cVar, com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.c cVar2, com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.c cVar3, com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.c cVar4, com.avito.android.select.glow_animation.c cVar5, com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b bVar, com.avito.android.select.bottom_sheet_pagination.blueprints.error.b bVar2) {
        this.f266753a = cVar;
        this.f266754b = cVar2;
        this.f266755c = cVar3;
        this.f266756d = cVar4;
        this.f266757e = cVar5;
        this.f266758f = bVar;
        this.f266759g = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.select.sectioned_multiselect.Items.section_list.b bVar = (com.avito.android.select.sectioned_multiselect.Items.section_list.b) this.f266753a.get();
        com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.b bVar2 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.b) this.f266754b.get();
        com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.b bVar3 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.b) this.f266755c.get();
        com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.b bVar4 = (com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.b) this.f266756d.get();
        com.avito.android.select.glow_animation.b bVar5 = (com.avito.android.select.glow_animation.b) this.f266757e.get();
        com.avito.android.select.bottom_sheet_pagination.blueprints.loading.a aVar = (com.avito.android.select.bottom_sheet_pagination.blueprints.loading.a) this.f266758f.get();
        com.avito.android.select.bottom_sheet_pagination.blueprints.error.a aVar2 = (com.avito.android.select.bottom_sheet_pagination.blueprints.error.a) this.f266759g.get();
        e.f266751a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(bVar4);
        c10493a.b(bVar5);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
