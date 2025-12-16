package com.avito.android.mortgage.document_upload.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DocumentUploadActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f199402a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.document_upload.interactor.l f199403b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f199404c;

    public c(u uVar, com.avito.android.mortgage.document_upload.interactor.l lVar, com.avito.android.mortgage.util.e eVar) {
        this.f199402a = uVar;
        this.f199403b = lVar;
        this.f199404c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.document_upload.interactor.f fVar = (com.avito.android.mortgage.document_upload.interactor.f) this.f199402a.get();
        com.avito.android.mortgage.document_upload.interactor.k kVar = (com.avito.android.mortgage.document_upload.interactor.k) this.f199403b.get();
        this.f199404c.getClass();
        return new b(fVar, kVar, new com.avito.android.mortgage.util.d());
    }
}
