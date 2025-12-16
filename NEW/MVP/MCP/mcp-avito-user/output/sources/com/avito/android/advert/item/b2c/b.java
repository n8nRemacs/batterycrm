package com.avito.android.advert.item.b2c;

import com.avito.android.advert_core.safedeal.v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsB2CBottomBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f73195a;

    /* renamed from: b, reason: collision with root package name */
    public final u f73196b;

    public b(u uVar, Provider provider) {
        this.f73195a = provider;
        this.f73196b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f73195a.get(), (v) this.f73196b.get());
    }
}
