package com.avito.android.confirm_documents_bottom_sheet.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmDocumentsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.confirm_documents_bottom_sheet.list.d f125523a;

    public f(com.avito.android.confirm_documents_bottom_sheet.list.d dVar) {
        this.f125523a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.confirm_documents_bottom_sheet.list.c cVar = (com.avito.android.confirm_documents_bottom_sheet.list.c) this.f125523a.get();
        d.f125521a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        return c10493a.a();
    }
}
