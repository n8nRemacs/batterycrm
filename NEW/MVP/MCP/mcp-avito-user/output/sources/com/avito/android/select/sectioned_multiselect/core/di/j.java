package com.avito.android.select.sectioned_multiselect.core.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectModule_ProvideSectionedMultiselectItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.j f266627a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.c f266628b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.c f266629c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.select.bottom_sheet_pagination.blueprints.error.b f266630d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b f266631e;

    public j(com.avito.android.select.sectioned_multiselect.Items.section_item.j jVar, com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.c cVar, com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.c cVar2, com.avito.android.select.bottom_sheet_pagination.blueprints.error.b bVar, com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b bVar2) {
        this.f266627a = jVar;
        this.f266628b = cVar;
        this.f266629c = cVar2;
        this.f266630d = bVar;
        this.f266631e = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.select.sectioned_multiselect.Items.section_item.i iVar = (com.avito.android.select.sectioned_multiselect.Items.section_item.i) this.f266627a.get();
        com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.b bVar = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.b) this.f266628b.get();
        com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.b bVar2 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.b) this.f266629c.get();
        com.avito.android.select.bottom_sheet_pagination.blueprints.error.a aVar = (com.avito.android.select.bottom_sheet_pagination.blueprints.error.a) this.f266630d.get();
        com.avito.android.select.bottom_sheet_pagination.blueprints.loading.a aVar2 = (com.avito.android.select.bottom_sheet_pagination.blueprints.loading.a) this.f266631e.get();
        d.f266618a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(iVar);
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
