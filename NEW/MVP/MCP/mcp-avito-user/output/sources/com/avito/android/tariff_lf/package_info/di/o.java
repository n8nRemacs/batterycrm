package com.avito.android.tariff_lf.package_info.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff_lf.package_info.viewmodel.v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffPackageInfoModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<com.avito.android.tariff_lf.package_info.viewmodel.l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f299228a;

    /* renamed from: b, reason: collision with root package name */
    public final u f299229b;

    public o(dagger.internal.l lVar, u uVar) {
        this.f299228a = lVar;
        this.f299229b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f299228a.f393949a;
        P0.c cVar = (P0.c) this.f299229b.get();
        h hVar = h.f299220a;
        return (com.avito.android.tariff_lf.package_info.viewmodel.l) new P0(fragment, cVar).a(v.class);
    }
}
