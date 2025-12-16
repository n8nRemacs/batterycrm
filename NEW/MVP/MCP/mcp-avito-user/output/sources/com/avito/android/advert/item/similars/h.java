package com.avito.android.advert.item.similars;

import com.avito.android.InterfaceC34162r0;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.section.SectionItemConverter;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertAsyncComplementaryPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f80281a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.recomendations.j> f80282b;

    /* renamed from: c, reason: collision with root package name */
    public final u f80283c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f80284d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f80285e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<A7.b> f80286f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC34162r0> f80287g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<j> f80288h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<R0> f80289i;

    public h(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f80281a = provider;
        this.f80282b = provider2;
        this.f80283c = uVar;
        this.f80284d = provider3;
        this.f80285e = lVar;
        this.f80286f = provider4;
        this.f80287g = provider5;
        this.f80288h = provider6;
        this.f80289i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f80281a.get(), this.f80282b.get(), (SectionItemConverter) this.f80283c.get(), this.f80284d.get(), (AdvertDetailsFastOpenParams) this.f80285e.f393949a, this.f80286f.get(), this.f80287g.get(), this.f80288h.get(), this.f80289i.get());
    }
}
