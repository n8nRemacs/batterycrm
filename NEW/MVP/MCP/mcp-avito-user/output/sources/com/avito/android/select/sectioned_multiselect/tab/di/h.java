package com.avito.android.select.sectioned_multiselect.tab.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectTabModule_ProvideSectionItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.c f266760a;

    public h(com.avito.android.select.sectioned_multiselect.Items.section_item.c cVar) {
        this.f266760a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.select.sectioned_multiselect.Items.section_item.b bVar = (com.avito.android.select.sectioned_multiselect.Items.section_item.b) this.f266760a.get();
        e.f266751a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
