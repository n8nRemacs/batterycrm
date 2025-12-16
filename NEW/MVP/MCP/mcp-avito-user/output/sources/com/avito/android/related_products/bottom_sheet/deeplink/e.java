package com.avito.android.related_products.bottom_sheet.deeplink;

import bj0.C25665e;
import bj0.InterfaceC25667g;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.analytics.screens.tracker.b0;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.related_products.bottom_sheet.g;
import com.avito.android.related_products.bottom_sheet.v;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RelatedProductsBottomSheetDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25667g> f252874a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f252875b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.related_products.bottom_sheet.di.d f252876c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<g> f252877d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f252878e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f252879f;

    /* renamed from: g, reason: collision with root package name */
    public final C25665e f252880g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.related_products.bottom_sheet.b> f252881h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<R0> f252882i;

    /* renamed from: j, reason: collision with root package name */
    public final b0 f252883j;

    public e(Provider provider, dagger.internal.f fVar, com.avito.android.related_products.bottom_sheet.di.d dVar, Provider provider2, dv.b bVar, dv.b bVar2, C25665e c25665e, Provider provider3, Provider provider4, b0 b0Var) {
        this.f252874a = provider;
        this.f252875b = fVar;
        this.f252876c = dVar;
        this.f252877d = provider2;
        this.f252878e = bVar;
        this.f252879f = bVar2;
        this.f252880g = c25665e;
        this.f252881h = provider3;
        this.f252882i = provider4;
        this.f252883j = b0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f252874a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f252875b.get(), (AW.b) this.f252876c.get(), this.f252877d.get(), (a.InterfaceC4053a) this.f252878e.get(), (a.b) this.f252879f.get(), (v) this.f252880g.get(), dagger.internal.g.b(this.f252881h), this.f252882i.get(), (Z) this.f252883j.get());
    }
}
