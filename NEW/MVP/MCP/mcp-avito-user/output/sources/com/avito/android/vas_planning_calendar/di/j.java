package com.avito.android.vas_planning_calendar.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanCalendarModule_ProvideItemBinder$_avito_vas_planning_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_planning_calendar.view.konveyor.items.month.c f322649a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_planning_calendar.view.konveyor.items.day.c f322650b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.vas_planning_calendar.view.konveyor.items.empty.c f322651c;

    public j(com.avito.android.vas_planning_calendar.view.konveyor.items.month.c cVar, com.avito.android.vas_planning_calendar.view.konveyor.items.day.c cVar2, com.avito.android.vas_planning_calendar.view.konveyor.items.empty.c cVar3) {
        this.f322649a = cVar;
        this.f322650b = cVar2;
        this.f322651c = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.vas_planning_calendar.view.konveyor.items.month.b bVar = (com.avito.android.vas_planning_calendar.view.konveyor.items.month.b) this.f322649a.get();
        com.avito.android.vas_planning_calendar.view.konveyor.items.day.b bVar2 = (com.avito.android.vas_planning_calendar.view.konveyor.items.day.b) this.f322650b.get();
        com.avito.android.vas_planning_calendar.view.konveyor.items.empty.b bVar3 = (com.avito.android.vas_planning_calendar.view.konveyor.items.empty.b) this.f322651c.get();
        int i12 = f.f322643a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        return c10493a.a();
    }
}
