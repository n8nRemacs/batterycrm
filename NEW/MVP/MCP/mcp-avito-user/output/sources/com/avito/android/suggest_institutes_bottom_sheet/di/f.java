package com.avito.android.suggest_institutes_bottom_sheet.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestInstitutesModule_ProvideAdapterPresenter$_avito_job_suggest_institutes_bottom_sheet_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f292009a;

    public f(u uVar) {
        this.f292009a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f292009a.get();
        int i12 = e.f292008a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
