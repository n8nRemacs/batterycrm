package com.avito.android.inline_filters.di;

import com.avito.android.inline_filters.dialog.calendar.D;
import com.avito.android.inline_filters.dialog.calendar.E;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FiltersCalendarPickerModule_ProvideCalendarViewModel$_avito_inline_filters_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.android.inline_filters.dialog.calendar.o> {

    /* renamed from: a, reason: collision with root package name */
    public final E f171118a;

    public h(E e12) {
        this.f171118a = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D d12 = (D) this.f171118a.get();
        e eVar = e.f171113a;
        return (com.avito.android.inline_filters.dialog.calendar.o) d12.create(com.avito.android.inline_filters.dialog.calendar.p.class);
    }
}
