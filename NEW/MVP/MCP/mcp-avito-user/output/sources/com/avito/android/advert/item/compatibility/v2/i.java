package com.avito.android.advert.item.compatibility.v2;

import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV2PresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.spare_parts.a> f74369a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f74370b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f74371c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f74372d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f74373e;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f74369a = provider;
        this.f74370b = provider2;
        this.f74371c = provider3;
        this.f74372d = provider4;
        this.f74373e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f74369a.get(), this.f74370b.get(), this.f74371c.get(), this.f74372d.get(), (Kundle) this.f74373e.f393949a);
    }
}
