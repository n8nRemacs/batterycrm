package com.avito.android.calendar_select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarSelectRecyclerModule_ProvideMonthItemBlueprint$_avito_calendar_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<com.avito.android.calendar_select.presentation.view.konveyor.items.month.c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113333a;

    public j(u uVar) {
        this.f113333a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.calendar_select.presentation.view.konveyor.items.month.d dVar = (com.avito.android.calendar_select.presentation.view.konveyor.items.month.d) this.f113333a.get();
        int i12 = d.f113324a;
        return new com.avito.android.calendar_select.presentation.view.konveyor.items.month.c(dVar);
    }
}
