package com.avito.android.universal_map.map_mvi.di.module;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalMapPointInfoMviModule_ProvidePointInfoComponentFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.android.universal_map.map_mvi.point_info.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f306128a;

    public h(Provider<InterfaceC40691b> provider) {
        this.f306128a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = this.f306128a.get();
        g.f306127a.getClass();
        return new com.avito.android.universal_map.map_mvi.point_info.a(interfaceC40691b.j(), interfaceC40691b.j(), interfaceC40691b.j());
    }
}
