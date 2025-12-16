package com.avito.android.upload_doc.mvi.logic;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigUploadDocBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f306959a;

    public f(u uVar) {
        this.f306959a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.upload_doc.mvi.interactor.a) this.f306959a.get());
    }
}
