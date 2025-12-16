package com.avito.android.auto_evidence_request.di;

import android.app.Application;
import com.avito.android.auto_evidence_request.di.l;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.photo_picker.c0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoEvidencePhotoPickerModule_ProvideUploadingInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f95057a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f95058b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f95059c;

    public c(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f95057a = provider;
        this.f95058b = provider2;
        this.f95059c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) ((l.b.C2823b) this.f95057a).get();
        PhotoPickerIntentFactory photoPickerIntentFactory = (PhotoPickerIntentFactory) ((l.b.f) this.f95058b).get();
        String str = (String) this.f95059c.f393949a;
        a.f95053a.getClass();
        return new c0(application.getApplicationContext(), str, photoPickerIntentFactory, true);
    }
}
