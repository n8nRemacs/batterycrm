package com.avito.android.advert.item.safedeal.trust_factors.text;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrustFactorsTextBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f79240a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f79241b;

    public b(e eVar, Provider provider) {
        this.f79240a = eVar;
        this.f79241b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f79240a.get(), this.f79241b.get());
    }
}
