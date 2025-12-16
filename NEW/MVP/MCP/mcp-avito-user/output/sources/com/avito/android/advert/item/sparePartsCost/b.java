package com.avito.android.advert.item.sparePartsCost;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SparePartsCostItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f80379a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f80380b;

    public b(f fVar, Provider provider) {
        this.f80379a = fVar;
        this.f80380b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f80379a.get(), this.f80380b.get());
    }
}
