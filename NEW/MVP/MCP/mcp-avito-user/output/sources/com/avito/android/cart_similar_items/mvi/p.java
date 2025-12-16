package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.model.CartSimilarItemsArguments;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: CartSimilarItemsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<C29353a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<I> f116096a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f116097b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f116098c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.cart_snippet_actions.e> f116099d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.cart_snippet_actions.a> f116100e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f116101f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f116102g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f116103h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f116104i;

    public p(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f116096a = provider;
        this.f116097b = uVar;
        this.f116098c = provider2;
        this.f116099d = provider3;
        this.f116100e = provider4;
        this.f116101f = provider5;
        this.f116102g = provider6;
        this.f116103h = lVar;
        this.f116104i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C29353a(this.f116096a.get(), (F) this.f116097b.get(), this.f116098c.get(), this.f116099d.get(), this.f116100e.get(), this.f116101f.get(), this.f116102g.get(), (CartSimilarItemsArguments) this.f116103h.f393949a, this.f116104i.get());
    }
}
