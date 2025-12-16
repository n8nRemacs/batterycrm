package com.avito.android.advert.item.compatibility.v3;

import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV3PresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.spare_parts.a> f74479a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f74480b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<b> f74481c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<e> f74482d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f74483e;

    public n(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f74479a = provider;
        this.f74480b = provider2;
        this.f74481c = provider3;
        this.f74482d = provider4;
        this.f74483e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f74479a.get(), this.f74480b.get(), this.f74481c.get(), this.f74482d.get(), (Kundle) this.f74483e.f393949a);
    }
}
