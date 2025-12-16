package com.avito.android.advert.item.compatibility.v4;

import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV4PresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.spare_parts.a> f74549a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f74550b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f74551c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f74552d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f74553e;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f74549a = provider;
        this.f74550b = provider2;
        this.f74551c = provider3;
        this.f74552d = provider4;
        this.f74553e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f74549a.get(), this.f74550b.get(), this.f74551c.get(), this.f74552d.get(), (Kundle) this.f74553e.f393949a);
    }
}
