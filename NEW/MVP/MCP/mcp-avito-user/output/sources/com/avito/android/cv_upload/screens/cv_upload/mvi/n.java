package com.avito.android.cv_upload.screens.cv_upload.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvUploadReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cv_upload.domain.f f131786a;

    public n(com.avito.android.cv_upload.domain.f fVar) {
        this.f131786a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.cv_upload.domain.e) this.f131786a.get());
    }
}
