package com.avito.android.universal_map.map.di;

import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;

/* compiled from: UniversalMapModule_ProvideIconFactory$_avito_universal_map_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class K implements dagger.internal.h<AvitoMarkerIconFactory> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305027a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.universal_map.map.common.marker.s f305028b;

    public K(dagger.internal.l lVar, com.avito.android.universal_map.map.common.marker.s sVar) {
        this.f305027a = lVar;
        this.f305028b = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f305027a.f393949a;
        this.f305028b.getClass();
        com.avito.android.universal_map.map.common.marker.r rVar = new com.avito.android.universal_map.map.common.marker.r();
        I.f305025a.getClass();
        return new com.avito.android.universal_map.map.common.marker.m(LayoutInflater.from(fragment.requireContext()), rVar);
    }
}
