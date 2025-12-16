package com.avito.android.photo_gallery.di;

import android.app.Application;
import com.avito.android.advert_core.contactbar.C28263b;
import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import javax.inject.Provider;

/* compiled from: LegacyPhotoGalleryModule_ProvideAdvertActionIconFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<InterfaceC28262a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f217030a;

    public m(Provider<Application> provider) {
        this.f217030a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l.f217029a.getClass();
        return new C28263b(true);
    }
}
