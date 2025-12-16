package com.avito.android.serp.adapter.witcher;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: WitcherItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.witcher.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34896o implements dagger.internal.h<C34895n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.favorite.m f273882a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f273883b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.d> f273884c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f273885d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f273886e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f273887f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f273888g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f273889h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<M> f273890i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.h f273891j;

    public C34896o(com.avito.android.favorite.m mVar, dagger.internal.u uVar, Provider provider, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider2, dagger.internal.u uVar4, dagger.internal.u uVar5, Provider provider3, dagger.internal.h hVar) {
        this.f273882a = mVar;
        this.f273883b = uVar;
        this.f273884c = provider;
        this.f273885d = uVar2;
        this.f273886e = uVar3;
        this.f273887f = provider2;
        this.f273888g = uVar4;
        this.f273889h = uVar5;
        this.f273890i = provider3;
        this.f273891j = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34895n((com.avito.android.favorite.h) this.f273882a.get(), (com.avito.android.advert.viewed.a) this.f273883b.get(), this.f273884c.get(), (R0) this.f273885d.get(), (InterfaceC35745a5) this.f273886e.get(), this.f273887f.get(), (r) this.f273888g.get(), (L0) this.f273889h.get(), this.f273890i.get(), (String) this.f273891j.get());
    }
}
