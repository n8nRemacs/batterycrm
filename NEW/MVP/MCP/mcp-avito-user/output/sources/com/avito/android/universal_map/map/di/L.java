package com.avito.android.universal_map.map.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: UniversalMapModule_ProvideUniversalMapViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class L implements dagger.internal.h<oG0.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305029a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f305030b;

    public L(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f305029a = lVar;
        this.f305030b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f305029a.f393949a;
        oG0.g gVar = (oG0.g) this.f305030b.get();
        I.f305025a.getClass();
        return (oG0.f) new P0(fragment, gVar).a(oG0.i.class);
    }
}
