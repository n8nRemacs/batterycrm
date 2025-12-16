package com.avito.android.suggest_institutes_bottom_sheet.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestInstitutesModule_ProvideDataAwareAdapterPresenterImpl$_avito_job_suggest_institutes_bottom_sheet_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f292010a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f292011b;

    /* renamed from: c, reason: collision with root package name */
    public final u f292012c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f292010a = provider;
        this.f292011b = provider2;
        this.f292012c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f292010a);
        com.avito.konveyor.adapter.h hVar = this.f292011b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f292012c.get();
        int i12 = e.f292008a;
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
