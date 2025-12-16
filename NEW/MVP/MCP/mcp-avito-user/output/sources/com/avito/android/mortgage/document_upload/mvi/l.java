package com.avito.android.mortgage.document_upload.mvi;

import c00.InterfaceC26916b;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DocumentUploadReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.document_upload.mvi.builder.c f199440a;

    /* renamed from: b, reason: collision with root package name */
    public final c00.d f199441b;

    public l(com.avito.android.mortgage.document_upload.mvi.builder.c cVar, c00.d dVar) {
        this.f199440a = cVar;
        this.f199441b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.mortgage.document_upload.mvi.builder.a) this.f199440a.get(), (InterfaceC26916b) this.f199441b.get());
    }
}
