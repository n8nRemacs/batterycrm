package com.avito.android.das_date_picker.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.das_date_picker.DasCalendarScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DasCalendarModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final h f132298a;

    /* renamed from: b, reason: collision with root package name */
    public final l f132299b;

    public i(h hVar, l lVar) {
        this.f132298a = hVar;
        this.f132299b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f132299b.f393949a;
        this.f132298a.getClass();
        return new C28478k(DasCalendarScreen.f132244d, rVar, null, 4, null);
    }
}
