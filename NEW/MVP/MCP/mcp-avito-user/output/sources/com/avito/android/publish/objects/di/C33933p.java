package com.avito.android.publish.objects.di;

import android.app.Application;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.photo_picker.c0;

/* compiled from: ImageUploadModule_ProvideUploadingInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33933p implements dagger.internal.h<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final C33930m f238022a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f238023b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f238024c;

    public C33933p(C33930m c33930m, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f238022a = c33930m;
        this.f238023b = uVar;
        this.f238024c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c0((Application) this.f238023b.get(), this.f238022a.f238013a, (PhotoPickerIntentFactory) this.f238024c.get(), true);
    }
}
