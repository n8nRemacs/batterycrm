package com.avito.android.calendar_select.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalendarSelectRecyclerModule_ProvideItemBinder$_avito_calendar_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.calendar_select.presentation.view.konveyor.items.month.c> f113330a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.calendar_select.presentation.view.konveyor.items.day.c f113331b;

    /* renamed from: c, reason: collision with root package name */
    public final u f113332c;

    public i(Provider provider, com.avito.android.calendar_select.presentation.view.konveyor.items.day.c cVar, u uVar) {
        this.f113330a = provider;
        this.f113331b = cVar;
        this.f113332c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.calendar_select.presentation.view.konveyor.items.month.c cVar = this.f113330a.get();
        com.avito.android.calendar_select.presentation.view.konveyor.items.day.b bVar = (com.avito.android.calendar_select.presentation.view.konveyor.items.day.b) this.f113331b.get();
        com.avito.android.calendar_select.presentation.view.konveyor.items.empty.c cVar2 = (com.avito.android.calendar_select.presentation.view.konveyor.items.empty.c) this.f113332c.get();
        int i12 = d.f113324a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        c10493a.b(bVar);
        c10493a.b(cVar2);
        return c10493a.a();
    }
}
