package com.avito.android.photo_gallery.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.photo_gallery.di.C33182b;
import com.avito.android.photo_gallery.tracker.GalleryScreen;
import javax.inject.Provider;

/* compiled from: LegacyPhotoTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class A implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f216905a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f216906b;

    public A(dagger.internal.l lVar, Provider provider) {
        this.f216905a = provider;
        this.f216906b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C33182b.c.w) this.f216905a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f216906b.f393949a;
        int i12 = w.f217072a;
        return interfaceC28481c.b(GalleryScreen.f217664d, rVar);
    }
}
