package com.avito.android.mortgage.document_upload.interactor;

import android.content.ContentResolver;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileUploaderInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f199227a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.document_upload.di.e f199228b;

    public e(Provider provider, com.avito.android.mortgage.document_upload.di.e eVar) {
        this.f199227a = provider;
        this.f199228b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.a(w.a(this.f199227a)), (ContentResolver) this.f199228b.get());
    }
}
