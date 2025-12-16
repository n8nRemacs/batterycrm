package com.avito.android.bottom_sheet_group.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BottomSheetGroupModule_ProvideGroupListItemBinder$_avito_bottom_sheet_group_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bottom_sheet_group.items.multiselect_item.b f107298a;

    public j(com.avito.android.bottom_sheet_group.items.multiselect_item.b bVar) {
        this.f107298a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.bottom_sheet_group.items.multiselect_item.a aVar = (com.avito.android.bottom_sheet_group.items.multiselect_item.a) this.f107298a.get();
        e.f107294a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
