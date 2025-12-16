package com.avito.android.cv_upload.domain;

import android.content.Context;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvUploadMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f131667a;

    public f(Provider<Context> provider) {
        this.f131667a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f131667a.get());
    }
}
