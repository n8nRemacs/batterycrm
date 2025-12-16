package com.avito.android.mortgage.document_upload.di;

import android.content.ContentResolver;
import android.content.Context;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DocumentUploadModule_Companion_ProvideContentResolverFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<ContentResolver> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f199203a;

    public e(Provider<Context> provider) {
        this.f199203a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f199203a.get();
        d.f199201a.getClass();
        return context.getContentResolver();
    }
}
