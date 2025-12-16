package com.avito.android.di.module;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideCommercialConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.k8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30096k8 implements dagger.internal.h<gr0.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144367a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.G> f144368b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.G> f144369c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f144370d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f144371e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f144372f;

    public C30096k8(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider, Provider provider2) {
        this.f144367a = uVar;
        this.f144368b = provider;
        this.f144369c = provider2;
        this.f144370d = uVar2;
        this.f144371e = uVar3;
        this.f144372f = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.a aVar = (com.avito.android.server_time.a) this.f144367a.get();
        com.avito.android.serp.adapter.G g12 = this.f144368b.get();
        com.avito.android.serp.adapter.G g13 = this.f144369c.get();
        com.avito.android.advertising.d dVar = (com.avito.android.advertising.d) this.f144370d.get();
        InterfaceC35863o4 interfaceC35863o4 = (InterfaceC35863o4) this.f144371e.get();
        com.avito.android.advertising.loaders.avito_targeting.a aVar2 = (com.avito.android.advertising.loaders.avito_targeting.a) this.f144372f.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new gr0.c(aVar, g12, g13, dVar, interfaceC35863o4, aVar2);
    }
}
