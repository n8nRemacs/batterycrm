package com.avito.android.rating_form.item.photo_picker.di;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormPhotoPickerModule_Companion_ProvideImageUploadedProgressInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.photo_cache.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f248528a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f248529b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f248530c;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f248528a = lVar;
        this.f248529b = provider;
        this.f248530c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f248528a.f393949a;
        com.avito.android.photo_cache.b bVar = this.f248529b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f248530c.get();
        b.f248514a.getClass();
        return new com.avito.android.photo_cache.n(str, bVar, interfaceC35745a5);
    }
}
