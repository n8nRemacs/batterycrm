package com.avito.android.profile.pro.impl.screen.item.recommendations;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProRecommendationsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f223417a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f223418b;

    public b(e eVar, Provider provider) {
        this.f223417a = eVar;
        this.f223418b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f223417a.get(), this.f223418b.get());
    }
}
