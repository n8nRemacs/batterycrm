package com.avito.android.soa_stat.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.soa_stat.tracker.SoaStatProfileSettingsScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SoaStatProfileSettingsTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f284055a;

    public f(l lVar) {
        this.f284055a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f284055a.f393949a;
        e.f284054a.getClass();
        return new C28478k(SoaStatProfileSettingsScreen.f284266d, rVar, null, 4, null);
    }
}
