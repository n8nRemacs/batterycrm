package com.avito.android.advert.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.advert.di.t0;
import com.avito.android.serp.adapter.b1;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideCommercialConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class I implements dagger.internal.h<gr0.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f69106a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f69107b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f69108c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f69109d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.avito_targeting.a> f69110e;

    public I(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f69106a = provider;
        this.f69107b = lVar;
        this.f69108c = uVar;
        this.f69109d = provider2;
        this.f69110e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.a aVar = (com.avito.android.server_time.a) ((t0.b.Q0) this.f69106a).get();
        Resources resources = (Resources) this.f69107b.f393949a;
        com.avito.android.advertising.d dVar = (com.avito.android.advertising.d) this.f69108c.get();
        InterfaceC35863o4 interfaceC35863o4 = (InterfaceC35863o4) ((t0.b.C27786z1) this.f69109d).get();
        com.avito.android.advertising.loaders.avito_targeting.a aVar2 = (com.avito.android.advertising.loaders.avito_targeting.a) ((t0.b.C27772v) this.f69110e).get();
        C27710t.f69463a.getClass();
        b1 b1Var = new b1(resources.getInteger(R.integer.serp_big_item_span_count));
        return new gr0.c(aVar, b1Var, b1Var, dVar, interfaceC35863o4, aVar2);
    }
}
