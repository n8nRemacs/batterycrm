package com.avito.android.inline_filters.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FiltersCalendarPickerModule_ProvideItemBinder$_avito_inline_filters_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.c f171120a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.c f171121b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.c f171122c;

    public j(com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.c cVar, com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.c cVar2, com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.c cVar3) {
        this.f171120a = cVar;
        this.f171121b = cVar2;
        this.f171122c = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.b bVar = (com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.b) this.f171120a.get();
        com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.b bVar2 = (com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.b) this.f171121b.get();
        com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.b bVar3 = (com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.b) this.f171122c.get();
        e eVar = e.f171113a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        return c10493a.a();
    }
}
