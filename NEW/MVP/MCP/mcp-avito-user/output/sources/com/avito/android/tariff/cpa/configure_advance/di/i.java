package com.avito.android.tariff.cpa.configure_advance.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff.cpa.configure_advance.viewmodel.p;
import com.avito.android.tariff.cpa.configure_advance.viewmodel.q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfigureAdvanceModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f294273a;

    /* renamed from: b, reason: collision with root package name */
    public final u f294274b;

    public i(dagger.internal.l lVar, u uVar) {
        this.f294273a = lVar;
        this.f294274b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f294273a.f393949a;
        P0.c cVar = (P0.c) this.f294274b.get();
        d dVar = d.f294266a;
        return (p) new P0(fragment, cVar).a(q.class);
    }
}
