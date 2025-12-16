package com.avito.android.tariff.cpa.configure_info.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff.cpa.configure_info.viewmodel.k;
import com.avito.android.tariff.cpa.configure_info.viewmodel.r;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpaConfigureInfoModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f294468a;

    /* renamed from: b, reason: collision with root package name */
    public final u f294469b;

    public h(l lVar, u uVar) {
        this.f294468a = lVar;
        this.f294469b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f294468a.f393949a;
        P0.c cVar = (P0.c) this.f294469b.get();
        int i12 = d.f294463a;
        return (k) new P0(fragment, cVar).a(r.class);
    }
}
