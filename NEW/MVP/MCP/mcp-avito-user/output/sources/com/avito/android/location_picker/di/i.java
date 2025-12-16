package com.avito.android.location_picker.di;

import com.avito.android.location_picker.entities.LocationPickerState;

/* compiled from: LocationPickerModule_ProvideAnalyticsProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<com.avito.android.location_picker.providers.w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.location_picker.providers.y f182321a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f182322b;

    public i(com.avito.android.location_picker.providers.y yVar, dagger.internal.l lVar) {
        this.f182321a = yVar;
        this.f182322b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.location_picker.providers.x xVar = (com.avito.android.location_picker.providers.x) this.f182321a.get();
        LocationPickerState locationPickerState = (LocationPickerState) this.f182322b.f393949a;
        g.f182320a.getClass();
        if (locationPickerState.f182375t.f182383d) {
            return null;
        }
        return xVar;
    }
}
