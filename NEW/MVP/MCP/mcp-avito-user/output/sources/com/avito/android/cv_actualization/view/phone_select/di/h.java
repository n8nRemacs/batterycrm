package com.avito.android.cv_actualization.view.phone_select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationPhoneSelectModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f131332a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f131333b;

    public h(u uVar, Provider provider) {
        this.f131332a = uVar;
        this.f131333b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f131332a.get();
        com.avito.konveyor.a aVar2 = this.f131333b.get();
        d.f131328a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
