package com.avito.android.suggest_institutes_bottom_sheet.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestInstitutesModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.suggest_institutes_bottom_sheet.blueprints.d f292014a;

    public i(com.avito.android.suggest_institutes_bottom_sheet.blueprints.d dVar) {
        this.f292014a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.suggest_institutes_bottom_sheet.blueprints.c cVar = (com.avito.android.suggest_institutes_bottom_sheet.blueprints.c) this.f292014a.get();
        int i12 = e.f292008a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        return c10493a.a();
    }
}
