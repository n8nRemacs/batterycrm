package com.avito.android.photo_picker.gallery.di;

import android.app.Application;
import android.content.ContentResolver;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryPickerModule_ProvideContentResolverFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<ContentResolver> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f219495a;

    public f(Provider<Application> provider) {
        this.f219495a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f219495a.get();
        int i12 = d.f219492a;
        return application.getContentResolver();
    }
}
