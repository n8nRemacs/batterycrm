package com.avito.android.photo_gallery_carousel.di;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.photo_gallery_carousel.di.h;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import javax.inject.Provider;
import kj.C42699b;
import kotlin.collections.C42745f0;
import pj.C47099b;

/* compiled from: CarouselPhotoGalleryViewModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final c f217743a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<gj.d> f217744b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f217745c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<a.b> f217746d;

    public e(c cVar, Provider<gj.d> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2, Provider<a.b> provider3) {
        this.f217743a = cVar;
        this.f217744b = provider;
        this.f217745c = provider2;
        this.f217746d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((h.b.C6527b) this.f217744b).f217786a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((h.b.e) this.f217745c).get();
        a.b bVar = (a.b) ((h.b.f) this.f217746d).get();
        this.f217743a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, null, null, new C42699b(null, C42745f0.U(Owners.f210511l3, Owners.f210519n3), "CarouselPhotoGallery", false, 8, null), 56);
    }
}
