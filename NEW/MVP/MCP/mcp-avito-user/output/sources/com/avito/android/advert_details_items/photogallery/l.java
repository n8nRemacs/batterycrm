package com.avito.android.advert_details_items.photogallery;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsGalleryPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f85084a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R70.b> f85085b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.advert.l> f85086c;

    /* renamed from: d, reason: collision with root package name */
    public final u f85087d;

    /* renamed from: e, reason: collision with root package name */
    public final u f85088e;

    /* renamed from: f, reason: collision with root package name */
    public final u f85089f;

    /* renamed from: g, reason: collision with root package name */
    public final u f85090g;

    /* renamed from: h, reason: collision with root package name */
    public final u f85091h;

    /* renamed from: i, reason: collision with root package name */
    public final u f85092i;

    public l(Provider provider, Provider provider2, Provider provider3, u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6) {
        this.f85084a = provider;
        this.f85085b = provider2;
        this.f85086c = provider3;
        this.f85087d = uVar;
        this.f85088e = uVar2;
        this.f85089f = uVar3;
        this.f85090g = uVar4;
        this.f85091h = uVar5;
        this.f85092i = uVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f85084a.get(), this.f85085b.get(), this.f85086c.get(), (InterfaceC28373a) this.f85087d.get(), (R0) this.f85088e.get(), (com.avito.android.pinch_to_zoom.b) this.f85089f.get(), (E) this.f85090g.get(), (u3.l) this.f85091h.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f85092i.get());
    }
}
