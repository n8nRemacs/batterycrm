package com.avito.android.cv_actualization.view.phone_select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationPhoneSelectModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f131329a;

    public e(u uVar) {
        this.f131329a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f131329a.get();
        d.f131328a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
