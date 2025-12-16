package com.avito.android.advert.item.beduin;

import bj.InterfaceC25659b;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBeduinItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f73232a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f73233b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.c f73234c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.advert.l> f73235d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f73236e;

    public e(u uVar, Provider provider, B4.c cVar, Provider provider2, Provider provider3) {
        this.f73232a = uVar;
        this.f73233b = provider;
        this.f73234c = cVar;
        this.f73235d = provider2;
        this.f73236e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f73232a.get(), this.f73233b.get(), (k) this.f73234c.get(), this.f73235d.get(), this.f73236e.get());
    }
}
