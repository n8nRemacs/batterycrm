package com.avito.android.evidence_request.details.di;

import android.app.Application;
import com.avito.android.evidence_request.AppealId;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.photo_picker.c0;
import javax.inject.Provider;

/* compiled from: EvidenceFilesUploadModule_ProvideUploadingInteractor$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148266a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f148267b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f148268c;

    public D(Provider<AppealId> provider, Provider<Application> provider2, Provider<PhotoPickerIntentFactory> provider3) {
        this.f148266a = provider;
        this.f148267b = provider2;
        this.f148268c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AppealId appealId = this.f148266a.get();
        Application application = this.f148267b.get();
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f148268c.get();
        w.f148426a.getClass();
        return new c0(application, appealId.f148206b, photoPickerIntentFactory, true);
    }
}
