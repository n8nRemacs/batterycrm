package com.avito.android.confirm_documents_bottom_sheet.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmDocumentsModule_ProvideListAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f125524a;

    /* renamed from: b, reason: collision with root package name */
    public final f f125525b;

    /* renamed from: c, reason: collision with root package name */
    public final u f125526c;

    public g(Provider provider, f fVar, u uVar) {
        this.f125524a = provider;
        this.f125525b = fVar;
        this.f125526c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f125524a);
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f125525b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f125526c.get();
        d.f125521a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), eVar);
    }
}
