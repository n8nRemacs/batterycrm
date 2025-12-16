package com.avito.android.user_advert.soa_with_price.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CloseReasonSheetDialogModule_ProvideItemBinder$_avito_user_advert_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f311886a;

    public e(u uVar) {
        this.f311886a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.user_advert.soa_with_price.blueprint.a aVar = (com.avito.android.user_advert.soa_with_price.blueprint.a) this.f311886a.get();
        int i12 = c.f311884a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
