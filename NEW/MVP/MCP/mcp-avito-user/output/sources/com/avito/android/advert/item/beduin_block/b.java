package com.avito.android.advert.item.beduin_block;

import bj.InterfaceC25659b;
import com.avito.android.advert.item.beduin_block.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBeduinFormBlueprint_Deps_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a.C2203a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f73405a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f73406b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.b f73407c;

    public b(Provider provider, Provider provider2, B4.b bVar) {
        this.f73405a = provider;
        this.f73406b = provider2;
        this.f73407c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a.C2203a(this.f73405a.get(), this.f73406b.get(), (InterfaceC40691b) this.f73407c.get());
    }
}
