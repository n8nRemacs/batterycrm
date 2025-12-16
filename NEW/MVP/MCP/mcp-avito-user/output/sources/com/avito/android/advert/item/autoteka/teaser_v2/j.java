package com.avito.android.advert.item.autoteka.teaser_v2;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaTeaserV2Filter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f73119a;

    /* renamed from: b, reason: collision with root package name */
    public final l f73120b;

    public j(l lVar, Provider provider) {
        this.f73119a = provider;
        this.f73120b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f73119a.get(), (String) this.f73120b.f393949a);
    }
}
