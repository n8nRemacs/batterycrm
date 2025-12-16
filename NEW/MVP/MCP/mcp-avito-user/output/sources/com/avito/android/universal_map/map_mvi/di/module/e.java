package com.avito.android.universal_map.map_mvi.di.module;

import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.universal_map.map.common.marker.m;
import com.avito.android.universal_map.map.common.marker.r;
import com.avito.android.universal_map.map.common.marker.s;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalMapMviModule_ProvideIconFactory$_avito_universal_map_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<AvitoMarkerIconFactory> {

    /* renamed from: a, reason: collision with root package name */
    public final l f306125a;

    /* renamed from: b, reason: collision with root package name */
    public final s f306126b;

    public e(l lVar, s sVar) {
        this.f306125a = lVar;
        this.f306126b = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f306125a.f393949a;
        this.f306126b.getClass();
        r rVar = new r();
        c.f306123a.getClass();
        return new m(LayoutInflater.from(fragment.requireContext()), rVar);
    }
}
