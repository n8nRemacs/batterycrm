package com.avito.android.seller_promotions.mvi;

import com.avito.android.seller_promotions.model.SellerPromotionsArguments;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SellerPromotionsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<C34670a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f268048a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B> f268049b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f268050c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f268051d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f268052e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f268053f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f268054g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.cart_snippet_actions.a> f268055h;

    public t(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f268048a = lVar;
        this.f268049b = provider;
        this.f268050c = provider2;
        this.f268051d = provider3;
        this.f268052e = provider4;
        this.f268053f = lVar2;
        this.f268054g = provider5;
        this.f268055h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34670a(((Integer) this.f268048a.f393949a).intValue(), this.f268049b.get(), this.f268050c.get(), this.f268051d.get(), this.f268052e.get(), (SellerPromotionsArguments) this.f268053f.f393949a, this.f268054g.get(), this.f268055h.get());
    }
}
