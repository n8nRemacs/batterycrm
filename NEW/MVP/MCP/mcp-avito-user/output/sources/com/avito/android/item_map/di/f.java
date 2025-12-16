package com.avito.android.item_map.di;

import ac.C19864a;
import com.avito.android.C29640d;
import com.avito.android.C30563f;
import com.avito.android.X;
import com.avito.android.account.E;
import com.avito.android.advert_core.analytics.AdvertDetailsAnalyticsInteractorImpl;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.permissions.z;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemMapModule_ProvideAdvertDetailsAnalyticsInteractor$_avito_item_map_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.android.advert_core.analytics.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f173320a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advertising.di.y f173321b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f173322c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.analytics.provider.f f173323d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f173324e;

    /* renamed from: f, reason: collision with root package name */
    public final C30563f f173325f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<z> f173326g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.advert_core.offers.analytics.e f173327h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C19864a> f173328i;

    /* renamed from: j, reason: collision with root package name */
    public final c8.f f173329j;

    public f(dagger.internal.f fVar, com.avito.android.advertising.di.y yVar, Provider provider, com.avito.android.analytics.provider.f fVar2, dagger.internal.l lVar, C30563f c30563f, Provider provider2, com.avito.android.advert_core.offers.analytics.e eVar, Provider provider3, c8.f fVar3) {
        this.f173320a = fVar;
        this.f173321b = yVar;
        this.f173322c = provider;
        this.f173323d = fVar2;
        this.f173324e = lVar;
        this.f173325f = c30563f;
        this.f173326g = provider2;
        this.f173327h = eVar;
        this.f173328i = provider3;
        this.f173329j = fVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f173320a.get();
        com.avito.android.advertising.loaders.j jVar = (com.avito.android.advertising.loaders.j) this.f173321b.get();
        E e12 = this.f173322c.get();
        this.f173323d.getClass();
        com.avito.android.analytics.provider.e eVar = new com.avito.android.analytics.provider.e();
        TreeClickStreamParent treeClickStreamParent = (TreeClickStreamParent) this.f173324e.f393949a;
        C29640d c29640d = (C29640d) this.f173325f.get();
        z zVar = this.f173326g.get();
        this.f173327h.getClass();
        com.avito.android.advert_core.offers.analytics.d dVar = new com.avito.android.advert_core.offers.analytics.d();
        C19864a c19864a = this.f173328i.get();
        c8.e eVar2 = (c8.e) this.f173329j.get();
        d.f173318a.getClass();
        return new AdvertDetailsAnalyticsInteractorImpl(interfaceC28373a, jVar, new X(), dVar, e12, eVar, treeClickStreamParent, c29640d, zVar, c19864a, eVar2);
    }
}
