package com.avito.android.imv_goods_advert;

import com.avito.android.J0;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvGoodsAdvertConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f170322a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<hJ.i> f170323b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<hJ.h> f170324c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<q> f170325d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f170326e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f170327f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f170328g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f170329h;

    public b(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f170322a = provider;
        this.f170323b = provider2;
        this.f170324c = provider3;
        this.f170325d = provider4;
        this.f170326e = provider5;
        this.f170327f = provider6;
        this.f170328g = provider7;
        this.f170329h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f170322a.get(), this.f170323b.get(), this.f170324c.get(), this.f170325d.get(), this.f170326e.get(), this.f170327f.get(), this.f170328g.get(), (InterfaceC28280j) this.f170329h.get());
    }
}
