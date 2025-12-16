package com.avito.android.autoteka.presentation.previewsearch.mvi;

import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaPreviewSearchOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f97661a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f97662b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PhotoGalleryIntentFactory> f97663c;

    public k(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.autoteka.data.a> provider2, Provider<PhotoGalleryIntentFactory> provider3) {
        this.f97661a = provider;
        this.f97662b = provider2;
        this.f97663c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f97661a.get(), this.f97662b.get(), this.f97663c.get());
    }
}
