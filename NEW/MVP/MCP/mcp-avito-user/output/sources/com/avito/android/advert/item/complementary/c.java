package com.avito.android.advert.item.complementary;

import Tp0.u;
import android.content.Context;
import com.avito.android.advert.item.C28144l;
import com.avito.android.favorite.n;
import com.avito.android.util.L0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComplementaryBottomSheetDialog_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f74579a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.a> f74580b;

    /* renamed from: c, reason: collision with root package name */
    public final u f74581c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<n> f74582d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.f> f74583e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f74584f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<L0> f74585g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C28144l> f74586h;

    public c(Provider provider, Provider provider2, u uVar, Provider provider3, Provider provider4, dagger.internal.u uVar2, Provider provider5, Provider provider6) {
        this.f74579a = provider;
        this.f74580b = provider2;
        this.f74581c = uVar;
        this.f74582d = provider3;
        this.f74583e = provider4;
        this.f74584f = uVar2;
        this.f74585g = provider5;
        this.f74586h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f74579a.get(), this.f74580b.get(), this.f74581c, this.f74582d, this.f74583e, (com.avito.konveyor.a) this.f74584f.get(), this.f74585g.get(), this.f74586h.get());
    }
}
