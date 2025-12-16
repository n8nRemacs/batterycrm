package com.avito.android.mortgage.document_upload;

import kotlinx.coroutines.flow.i2;

/* compiled from: DocumentUploadViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class h0 implements dagger.internal.h<g0> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.document_upload.mvi.h f199208a;

    public h0(com.avito.android.mortgage.document_upload.mvi.h hVar) {
        this.f199208a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.document_upload.mvi.g gVar = (com.avito.android.mortgage.document_upload.mvi.g) this.f199208a.get();
        i2.f411430a.getClass();
        return new g0(gVar, i2.a.f411433c);
    }
}
