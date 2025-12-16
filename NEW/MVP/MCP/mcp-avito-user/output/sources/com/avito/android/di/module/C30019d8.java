package com.avito.android.di.module;

import android.content.res.Resources;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideAdvertConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.d8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30019d8 implements dagger.internal.h<InterfaceC34904z0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.G> f144269a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144270b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Resources> f144271c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f144272d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.serp.adapter.P f144273e;

    public C30019d8(Provider provider, dagger.internal.u uVar, Provider provider2, dagger.internal.u uVar2, com.avito.android.serp.adapter.P p12) {
        this.f144269a = provider;
        this.f144270b = uVar;
        this.f144271c = provider2;
        this.f144272d = uVar2;
        this.f144273e = p12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.G g12 = this.f144269a.get();
        com.avito.android.serp.adapter.G g13 = (com.avito.android.serp.adapter.G) this.f144270b.get();
        Resources resources = this.f144271c.get();
        C36135w2 c36135w2 = (C36135w2) this.f144272d.get();
        com.avito.android.serp.adapter.N n12 = (com.avito.android.serp.adapter.N) this.f144273e.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.A0(g12, g13, resources.getBoolean(R.bool.is_tablet), c36135w2, n12);
    }
}
