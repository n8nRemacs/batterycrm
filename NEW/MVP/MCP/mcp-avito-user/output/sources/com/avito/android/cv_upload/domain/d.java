package com.avito.android.cv_upload.domain;

import Jt.InterfaceC14244a;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvUploadInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14244a> f131663a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.cv_upload.domain.mapper.b f131664b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.cv_upload.domain.mapper.d f131665c;

    public d(Provider provider, com.avito.android.cv_upload.domain.mapper.b bVar, com.avito.android.cv_upload.domain.mapper.d dVar) {
        this.f131663a = provider;
        this.f131664b = bVar;
        this.f131665c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f131663a));
        this.f131664b.getClass();
        com.avito.android.cv_upload.domain.mapper.a aVar = new com.avito.android.cv_upload.domain.mapper.a();
        this.f131665c.getClass();
        return new c(eVarA, aVar, new com.avito.android.cv_upload.domain.mapper.c());
    }
}
