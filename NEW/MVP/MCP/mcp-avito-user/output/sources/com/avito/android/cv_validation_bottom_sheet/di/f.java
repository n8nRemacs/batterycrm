package com.avito.android.cv_validation_bottom_sheet.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvValidationBottomSheetModule_ProvideListAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f131823a;

    /* renamed from: b, reason: collision with root package name */
    public final e f131824b;

    /* renamed from: c, reason: collision with root package name */
    public final u f131825c;

    public f(Provider provider, e eVar, u uVar) {
        this.f131823a = provider;
        this.f131824b = eVar;
        this.f131825c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f131823a);
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f131824b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f131825c.get();
        c.f131820a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), eVar);
    }
}
