package com.avito.android.inline_filters.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.FiltersCalendarPickerScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FiltersCalendarPickerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f171123a;

    public k(dagger.internal.l lVar) {
        this.f171123a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f171123a.f393949a;
        e.f171113a.getClass();
        return new C28478k(FiltersCalendarPickerScreen.f90357d, rVar, null, 4, null);
    }
}
