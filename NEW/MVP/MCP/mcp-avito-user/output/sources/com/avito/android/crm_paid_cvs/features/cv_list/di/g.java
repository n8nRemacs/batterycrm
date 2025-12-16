package com.avito.android.crm_paid_cvs.features.cv_list.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvListModule_ProvideCvBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.crm_paid_cvs.view.list_items.cv_item.b f130385a;

    public g(com.avito.android.crm_paid_cvs.view.list_items.cv_item.b bVar) {
        this.f130385a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.crm_paid_cvs.view.list_items.cv_item.a aVar = (com.avito.android.crm_paid_cvs.view.list_items.cv_item.a) this.f130385a.get();
        d.f130382a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
