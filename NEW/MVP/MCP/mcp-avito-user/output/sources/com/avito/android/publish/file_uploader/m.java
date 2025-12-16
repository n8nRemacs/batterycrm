package com.avito.android.publish.file_uploader;

import android.app.Application;
import android.content.ContentResolver;

/* compiled from: FileUploaderModule_ProvideContentResolver$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<ContentResolver> {

    /* renamed from: a, reason: collision with root package name */
    public final l f235697a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f235698b;

    public m(l lVar, dagger.internal.u uVar) {
        this.f235697a = lVar;
        this.f235698b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f235698b.get();
        this.f235697a.getClass();
        return application.getContentResolver();
    }
}
