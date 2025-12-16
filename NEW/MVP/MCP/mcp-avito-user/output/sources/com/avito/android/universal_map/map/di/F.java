package com.avito.android.universal_map.map.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.universal_map.map.g0;

/* compiled from: UniversalMapFragmentModule_ProvideUniversalPointViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class F implements dagger.internal.h<com.avito.android.universal_map.map.T> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305021a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.universal_map.map.V f305022b;

    public F(dagger.internal.l lVar, com.avito.android.universal_map.map.V v12) {
        this.f305021a = lVar;
        this.f305022b = v12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f305021a.f393949a;
        com.avito.android.universal_map.map.U u12 = (com.avito.android.universal_map.map.U) this.f305022b.get();
        C35315v.f305153a.getClass();
        return (com.avito.android.universal_map.map.T) new P0(fragment, u12).a(g0.class);
    }
}
