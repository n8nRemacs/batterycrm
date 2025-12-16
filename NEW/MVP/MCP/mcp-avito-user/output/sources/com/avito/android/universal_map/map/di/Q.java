package com.avito.android.universal_map.map.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: UniversalMapPointInfoModule_ProvideUniversalMapPointInfoViewModel$_avito_universal_map_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class Q implements dagger.internal.h<com.avito.android.universal_map.map.point_info.n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305035a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.universal_map.map.point_info.p f305036b;

    public Q(dagger.internal.l lVar, com.avito.android.universal_map.map.point_info.p pVar) {
        this.f305035a = lVar;
        this.f305036b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f305035a.f393949a;
        com.avito.android.universal_map.map.point_info.o oVar = (com.avito.android.universal_map.map.point_info.o) this.f305036b.get();
        O.f305034a.getClass();
        return (com.avito.android.universal_map.map.point_info.n) new P0(fragment, oVar).a(com.avito.android.universal_map.map.point_info.s.class);
    }
}
