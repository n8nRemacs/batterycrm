package com.avito.android.photo_gallery.di;

import ac.C19864a;
import com.avito.android.C29640d;
import com.avito.android.X;
import com.avito.android.account.E;
import com.avito.android.advert_core.analytics.AdvertDetailsAnalyticsInteractorImpl;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.photo_gallery.di.C33182b;
import javax.inject.Provider;

/* compiled from: LegacyPhotoGalleryModule_ProvideAdvertDetailsAnalyticsInteractor$_avito_photo_gallery_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<com.avito.android.advert_core.analytics.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f217053a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advertising.di.y f217054b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f217055c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.e> f217056d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f217057e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C29640d> f217058f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f217059g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.advert_core.offers.analytics.e f217060h;

    /* renamed from: i, reason: collision with root package name */
    public final q f217061i;

    /* renamed from: j, reason: collision with root package name */
    public final c8.f f217062j;

    public o(Provider provider, com.avito.android.advertising.di.y yVar, Provider provider2, Provider provider3, dagger.internal.l lVar, Provider provider4, Provider provider5, com.avito.android.advert_core.offers.analytics.e eVar, q qVar, c8.f fVar) {
        this.f217053a = provider;
        this.f217054b = yVar;
        this.f217055c = provider2;
        this.f217056d = provider3;
        this.f217057e = lVar;
        this.f217058f = provider4;
        this.f217059g = provider5;
        this.f217060h = eVar;
        this.f217061i = qVar;
        this.f217062j = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C33182b.c.C6498c) this.f217053a).get();
        com.avito.android.advertising.loaders.j jVar = (com.avito.android.advertising.loaders.j) this.f217054b.get();
        E e12 = (E) ((C33182b.c.a) this.f217055c).get();
        com.avito.android.analytics.provider.e eVarZ0 = ((C33182b.c.y) this.f217056d).f217012a.Z0();
        TreeClickStreamParent treeClickStreamParent = (TreeClickStreamParent) this.f217057e.f393949a;
        C29640d c29640d = (C29640d) ((C33182b.c.C6497b) this.f217058f).get();
        com.avito.android.permissions.z zVar = (com.avito.android.permissions.z) ((C33182b.c.r) this.f217059g).get();
        this.f217060h.getClass();
        com.avito.android.advert_core.offers.analytics.d dVar = new com.avito.android.advert_core.offers.analytics.d();
        C19864a c19864a = (C19864a) this.f217061i.get();
        c8.e eVar = (c8.e) this.f217062j.get();
        l.f217029a.getClass();
        return new AdvertDetailsAnalyticsInteractorImpl(interfaceC28373a, jVar, new X(), dVar, e12, eVarZ0, treeClickStreamParent, c29640d, zVar, c19864a, eVar);
    }
}
