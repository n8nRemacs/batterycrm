package com.avito.android.calendar_select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarSelectRecyclerModule_ProvideEmptyItemBlueprint$_avito_calendar_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.avito.android.calendar_select.presentation.view.konveyor.items.empty.c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113328a;

    public g(u uVar) {
        this.f113328a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.calendar_select.presentation.view.konveyor.items.empty.d dVar = (com.avito.android.calendar_select.presentation.view.konveyor.items.empty.d) this.f113328a.get();
        int i12 = d.f113324a;
        return new com.avito.android.calendar_select.presentation.view.konveyor.items.empty.c(dVar);
    }
}
