package com.avito.android.tariff_lf_constructor.configure.locations.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.r;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfigureLocationsModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f299887a;

    /* renamed from: b, reason: collision with root package name */
    public final u f299888b;

    public i(l lVar, u uVar) {
        this.f299887a = lVar;
        this.f299888b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f299887a.f393949a;
        P0.c cVar = (P0.c) this.f299888b.get();
        b bVar = b.f299879a;
        return (com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i) new P0(fragment, cVar).a(r.class);
    }
}
