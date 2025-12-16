package com.avito.android.advertising.adapter.items.yandex;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: YandexBigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f87723a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87724b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f87725c;

    public b(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f87723a = provider;
        this.f87724b = uVar;
        this.f87725c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f87723a.get(), (com.avito.android.serp.e) this.f87724b.get(), (com.avito.android.advertising.a) this.f87725c.f393949a);
    }
}
