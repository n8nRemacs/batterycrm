package com.avito.android.photo_picker.legacy.di;

import android.app.Application;
import com.avito.android.photo_picker.legacy.di.a;
import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvideThumbnailProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class t implements dagger.internal.h<D70.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219772a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f219773b;

    public t(f fVar, Provider<Application> provider) {
        this.f219772a = fVar;
        this.f219773b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) ((a.c.C6606a) this.f219773b).get();
        this.f219772a.getClass();
        return new D70.b(application.getContentResolver());
    }
}
