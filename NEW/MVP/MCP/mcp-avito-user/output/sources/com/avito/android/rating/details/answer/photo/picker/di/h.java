package com.avito.android.rating.details.answer.photo.picker.di;

import android.app.Application;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.photo_picker.c0;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerPhotoPickerModule_ProvideUploadingInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f246795a;

    /* renamed from: b, reason: collision with root package name */
    public final l f246796b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f246797c;

    public h(l lVar, Provider provider, Provider provider2) {
        this.f246795a = provider;
        this.f246796b = lVar;
        this.f246797c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f246795a.get();
        RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments = (RatingAddAnswerPhotoArguments) this.f246796b.f393949a;
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f246797c.get();
        a.f246778a.getClass();
        return new c0(application.getApplicationContext(), ratingAddAnswerPhotoArguments.f246622d, photoPickerIntentFactory, true);
    }
}
