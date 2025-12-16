package com.avito.android.adaptive.image.di;

import com.avito.android.adaptive.image.di.j;
import com.avito.android.analytics.H;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdaptiveImagePickerModule_ProvideAdaptiveAlgorithmFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<com.avito.android.adaptive.image.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R3.a> f68507a;

    /* renamed from: b, reason: collision with root package name */
    public final u f68508b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H> f68509c;

    /* renamed from: d, reason: collision with root package name */
    public final h f68510d;

    public d(Provider provider, u uVar, Provider provider2, h hVar) {
        this.f68507a = provider;
        this.f68508b = uVar;
        this.f68509c = provider2;
        this.f68510d = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R3.a aVar = this.f68507a.get();
        R3.e eVar = (R3.e) this.f68508b.get();
        H h12 = (H) ((j.b.C2145b) this.f68509c).get();
        R3.c cVar = (R3.c) this.f68510d.get();
        c.f68506a.getClass();
        return new com.avito.android.adaptive.image.b(aVar, eVar, h12, cVar);
    }
}
