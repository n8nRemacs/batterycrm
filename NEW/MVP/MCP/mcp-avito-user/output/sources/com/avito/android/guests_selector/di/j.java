package com.avito.android.guests_selector.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.GuestsSelector;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GuestsSelectorTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f161435a;

    public j(dagger.internal.l lVar) {
        this.f161435a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f161435a.f393949a;
        i.f161434a.getClass();
        return new C28478k(GuestsSelector.f90369d, rVar, null, 4, null);
    }
}
