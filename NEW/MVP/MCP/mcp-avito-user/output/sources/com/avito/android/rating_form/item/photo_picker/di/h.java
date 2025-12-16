package com.avito.android.rating_form.item.photo_picker.di;

import android.app.Application;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.photo_picker.c0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormPhotoPickerModule_Companion_ProvideUploadingInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f248531a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f248532b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f248533c;

    public h(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f248531a = provider;
        this.f248532b = provider2;
        this.f248533c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f248531a.get();
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f248532b.get();
        String str = (String) this.f248533c.f393949a;
        b.f248514a.getClass();
        return new c0(application.getApplicationContext(), str, photoPickerIntentFactory, true);
    }
}
