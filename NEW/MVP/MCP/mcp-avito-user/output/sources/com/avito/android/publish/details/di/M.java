package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideCvUploadButtonBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class M implements dagger.internal.h<com.avito.android.publish.slots.cv_upload.item.cvUploadButton.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.cv_upload.item.cvUploadButton.e> f233645a;

    public M(Provider<com.avito.android.publish.slots.cv_upload.item.cvUploadButton.e> provider) {
        this.f233645a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.cv_upload.item.cvUploadButton.e eVar = this.f233645a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.cv_upload.item.cvUploadButton.a(eVar);
    }
}
