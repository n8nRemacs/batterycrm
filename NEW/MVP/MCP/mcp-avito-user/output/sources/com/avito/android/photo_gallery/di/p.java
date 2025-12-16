package com.avito.android.photo_gallery.di;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.MessengerApi;

/* compiled from: LegacyPhotoGalleryModule_ProvideAdvertMessengerInteractor$_avito_photo_gallery_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<com.avito.android.advert_core.messenger.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerApi> f217063a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f217064b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f217065c;

    public p(Provider<MessengerApi> provider, Provider<E> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f217063a = provider;
        this.f217064b = provider2;
        this.f217065c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f217063a);
        E e12 = this.f217064b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f217065c.get();
        l.f217029a.getClass();
        return new com.avito.android.advert_core.messenger.f(eVarB, e12, interfaceC35745a5);
    }
}
