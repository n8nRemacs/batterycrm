package com.avito.android.di.module;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import javax.inject.Provider;

/* compiled from: ConstructorAdvertModule_ProvideConstructorItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class W2 implements dagger.internal.h<com.avito.android.serp.adapter.constructor.v> {

    /* renamed from: a, reason: collision with root package name */
    public final T2 f144167a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.constructor.A> f144168b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.serp.adapter.F0 f144169c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f144170d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f144171e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f144172f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f144173g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f144174h;

    public W2(T2 t22, Provider provider, com.avito.android.serp.adapter.F0 f02, dagger.internal.u uVar, Provider provider2, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4) {
        this.f144167a = t22;
        this.f144168b = provider;
        this.f144169c = f02;
        this.f144170d = uVar;
        this.f144171e = provider2;
        this.f144172f = uVar2;
        this.f144173g = uVar3;
        this.f144174h = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.constructor.A a12 = this.f144168b.get();
        com.avito.android.serp.adapter.E0 e02 = (com.avito.android.serp.adapter.E0) this.f144169c.get();
        InterfaceC25659b interfaceC25659b = (InterfaceC25659b) this.f144170d.get();
        com.avito.android.constructor_advert.ui.serp.constructor.b bVar = this.f144171e.get();
        com.avito.android.video_snippets.g gVar = (com.avito.android.video_snippets.g) this.f144172f.get();
        C36135w2 c36135w2 = (C36135w2) this.f144173g.get();
        RecyclerView.t tVar = (RecyclerView.t) this.f144174h.get();
        this.f144167a.getClass();
        return new com.avito.android.serp.adapter.constructor.v(a12, e02, interfaceC25659b, bVar, gVar, c36135w2, tVar);
    }
}
