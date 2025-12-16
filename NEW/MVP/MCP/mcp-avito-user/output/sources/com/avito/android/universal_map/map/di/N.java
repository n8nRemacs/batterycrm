package com.avito.android.universal_map.map.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: UniversalMapPinFiltersModule_ProvideUniversalMapPinFiltersViewModel$_avito_universal_map_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class N implements dagger.internal.h<com.avito.android.universal_map.map.pin_filters.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305032a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.universal_map.map.pin_filters.l f305033b;

    public N(dagger.internal.l lVar, com.avito.android.universal_map.map.pin_filters.l lVar2) {
        this.f305032a = lVar;
        this.f305033b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f305032a.f393949a;
        com.avito.android.universal_map.map.pin_filters.k kVar = (com.avito.android.universal_map.map.pin_filters.k) this.f305033b.get();
        M.f305031a.getClass();
        return (com.avito.android.universal_map.map.pin_filters.j) new P0(fragment, kVar).a(com.avito.android.universal_map.map.pin_filters.o.class);
    }
}
