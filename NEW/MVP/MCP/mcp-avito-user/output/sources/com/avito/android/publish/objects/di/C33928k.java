package com.avito.android.publish.objects.di;

import javax.inject.Provider;

/* compiled from: ImageListUploadModule_ProvidePublishImageListPresenter$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33928k implements dagger.internal.h<com.avito.android.publish.photo_picker.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C33921d f238010a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view.s> f238011b;

    public C33928k(C33921d c33921d, Provider<com.avito.android.photo_list_view.s> provider) {
        this.f238010a = c33921d;
        this.f238011b = provider;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.avito.android.publish.photo_picker.c, com.avito.android.publish.view.ItemDetailsBaseFragment] */
    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.publish.photo_picker.b(this.f238011b.get(), this.f238010a.f237987c);
    }
}
