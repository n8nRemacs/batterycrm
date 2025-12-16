package com.avito.android.tariff_lf.edit_info.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditInfoModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<com.avito.android.tariff_lf.edit_info.viewmodel.k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f298865a;

    /* renamed from: b, reason: collision with root package name */
    public final u f298866b;

    public l(dagger.internal.l lVar, u uVar) {
        this.f298865a = lVar;
        this.f298866b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f298865a.f393949a;
        P0.c cVar = (P0.c) this.f298866b.get();
        c cVar2 = c.f298839a;
        return (com.avito.android.tariff_lf.edit_info.viewmodel.k) new P0(fragment, cVar).a(com.avito.android.tariff_lf.edit_info.viewmodel.r.class);
    }
}
