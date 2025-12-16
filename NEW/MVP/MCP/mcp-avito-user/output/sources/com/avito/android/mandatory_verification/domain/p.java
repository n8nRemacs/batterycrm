package com.avito.android.mandatory_verification.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UploadFileUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.domain.file_uploader.k f184602a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f184603b;

    public p(com.avito.android.mandatory_verification.domain.file_uploader.k kVar, Provider provider) {
        this.f184602a = kVar;
        this.f184603b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.mandatory_verification.domain.file_uploader.c) this.f184602a.get(), this.f184603b.get());
    }
}
