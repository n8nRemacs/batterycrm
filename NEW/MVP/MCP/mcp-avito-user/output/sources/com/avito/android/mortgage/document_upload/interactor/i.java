package com.avito.android.mortgage.document_upload.interactor;

import android.content.ContentResolver;
import com.avito.android.K0;
import com.avito.android.L0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FilesInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final L0 f199349a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.document_upload.di.e f199350b;

    /* renamed from: c, reason: collision with root package name */
    public final e f199351c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f199352d;

    public i(L0 l02, com.avito.android.mortgage.document_upload.di.e eVar, e eVar2, Provider provider) {
        this.f199349a = l02;
        this.f199350b = eVar;
        this.f199351c = eVar2;
        this.f199352d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f199349a.getClass();
        return new f(new K0(), (ContentResolver) this.f199350b.get(), (d) this.f199351c.get(), this.f199352d.get());
    }
}
