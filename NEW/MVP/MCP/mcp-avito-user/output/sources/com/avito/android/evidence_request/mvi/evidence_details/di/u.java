package com.avito.android.evidence_request.mvi.evidence_details.di;

import android.app.Application;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.photo_picker.c0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsModule_ProvideUploadingInteractor$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148979a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f148980b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f148981c;

    public u(Provider<AppealId> provider, Provider<Application> provider2, Provider<PhotoPickerIntentFactory> provider3) {
        this.f148979a = provider;
        this.f148980b = provider2;
        this.f148981c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AppealId appealId = this.f148979a.get();
        Application application = this.f148980b.get();
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f148981c.get();
        d.f148929a.getClass();
        return new c0(application, appealId.f148723b, photoPickerIntentFactory, true);
    }
}
