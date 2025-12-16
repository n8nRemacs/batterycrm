package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.C34755r0;
import com.avito.android.serp.adapter.InterfaceC34748n0;
import java.util.Collections;
import javax.inject.Provider;

/* compiled from: AdvertItemPresenterModule_ProvideRdsRecommendationAdvertItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M implements dagger.internal.h<InterfaceC34748n0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144051a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f144052b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C36135w2> f144053c;

    public M(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f144051a = fVar;
        this.f144052b = provider;
        this.f144053c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f144051a);
        InterfaceC28373a interfaceC28373a = this.f144052b.get();
        C36135w2 c36135w2 = this.f144053c.get();
        D d12 = D.f143878a;
        return new C34755r0(eVarB, interfaceC28373a, c36135w2, Collections.singleton("ex_date"));
    }
}
