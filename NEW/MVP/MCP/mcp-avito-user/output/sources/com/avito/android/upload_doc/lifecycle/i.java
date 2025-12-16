package com.avito.android.upload_doc.lifecycle;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigUploadDocViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.upload_doc.mvi.logic.i f306849a;

    public i(com.avito.android.upload_doc.mvi.logic.i iVar) {
        this.f306849a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.upload_doc.mvi.logic.h) this.f306849a.get(), null, 2, null);
    }
}
