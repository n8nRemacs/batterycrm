package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.C28076x1;
import com.avito.android.advert.item.blocks.items_factories.N5;
import javax.inject.Provider;

/* compiled from: TabbedAdvertDetailsBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class m3 implements dagger.internal.h<l3> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.blocks.items_factories.Q0 f73622a;

    /* renamed from: b, reason: collision with root package name */
    public final C28076x1 f73623b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f73624c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.blocks.h> f73625d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f73626e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28240u> f73627f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73628g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f73629h;

    public m3(com.avito.android.advert.item.blocks.items_factories.Q0 q02, C28076x1 c28076x1, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f73622a = q02;
        this.f73623b = c28076x1;
        this.f73624c = uVar;
        this.f73625d = provider;
        this.f73626e = provider2;
        this.f73627f = provider3;
        this.f73628g = provider4;
        this.f73629h = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l3((com.avito.android.advert.item.blocks.items_factories.P0) this.f73622a.get(), (C28070w1) this.f73623b.get(), (N5) this.f73624c.get(), this.f73625d.get(), this.f73626e.get(), this.f73627f.get(), this.f73628g.get(), this.f73629h.get());
    }
}
