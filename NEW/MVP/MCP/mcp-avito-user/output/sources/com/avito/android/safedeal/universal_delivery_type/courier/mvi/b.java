package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import Zi.InterfaceC19564a;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import java.util.List;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeCourierActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f256509a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC19564a> f256510b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f256511c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f256512d;

    public b(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f256509a = lVar;
        this.f256510b = provider;
        this.f256511c = provider2;
        this.f256512d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f256509a.f393949a, this.f256510b.get(), this.f256511c.get(), (List) this.f256512d.f393949a);
    }
}
