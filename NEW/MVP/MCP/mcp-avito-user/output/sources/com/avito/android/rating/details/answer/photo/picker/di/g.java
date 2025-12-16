package com.avito.android.rating.details.answer.photo.picker.di;

import com.avito.android.photo_cache.n;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerPhotoPickerModule_ProvideImageUploadedProgressInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.photo_cache.j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f246792a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f246793b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f246794c;

    public g(l lVar, Provider provider, Provider provider2) {
        this.f246792a = lVar;
        this.f246793b = provider;
        this.f246794c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments = (RatingAddAnswerPhotoArguments) this.f246792a.f393949a;
        com.avito.android.photo_cache.b bVar = this.f246793b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f246794c.get();
        a.f246778a.getClass();
        return new n(ratingAddAnswerPhotoArguments.f246622d, bVar, interfaceC35745a5);
    }
}
