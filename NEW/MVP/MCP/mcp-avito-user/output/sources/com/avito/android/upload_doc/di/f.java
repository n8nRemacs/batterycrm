package com.avito.android.upload_doc.di;

import com.avito.android.remote.R0;
import com.avito.android.upload_doc.di.a;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigUploadDocModule_GetFileUploadApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<MG0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f306785a;

    public f(Provider<R0> provider) {
        this.f306785a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) ((a.c.n) this.f306785a).get();
        e.f306784a.getClass();
        MG0.a aVar = (MG0.a) r02.create(MG0.a.class);
        t.d(aVar);
        return aVar;
    }
}
