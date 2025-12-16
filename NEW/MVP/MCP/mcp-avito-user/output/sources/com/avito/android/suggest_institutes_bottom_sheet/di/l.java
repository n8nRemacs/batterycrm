package com.avito.android.suggest_institutes_bottom_sheet.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestInstitutesModule_ProvideListUpdateCallback$_avito_job_suggest_institutes_bottom_sheet_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f292018a;

    public l(dagger.internal.f fVar) {
        this.f292018a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f292018a.get();
        int i12 = e.f292008a;
        return jVar;
    }
}
