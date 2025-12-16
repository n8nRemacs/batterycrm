package com.avito.android.str_cancellation_settings.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrCancellationSettingsScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCancellationSettingsCoreModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final c f288323a;

    /* renamed from: b, reason: collision with root package name */
    public final l f288324b;

    public d(c cVar, l lVar) {
        this.f288323a = cVar;
        this.f288324b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f288324b.f393949a;
        this.f288323a.getClass();
        return new C28478k(StrCancellationSettingsScreen.f90511d, rVar, null, 4, null);
    }
}
