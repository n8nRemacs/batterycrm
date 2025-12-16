package com.avito.android.cv_validation_bottom_sheet.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvValidationBottomSheetModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cv_validation_bottom_sheet.list.b f131822a;

    public e(com.avito.android.cv_validation_bottom_sheet.list.b bVar) {
        this.f131822a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.cv_validation_bottom_sheet.list.a aVar = (com.avito.android.cv_validation_bottom_sheet.list.a) this.f131822a.get();
        c.f131820a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
