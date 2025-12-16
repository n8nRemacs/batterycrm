package com.avito.android.publish.input_vin.mvi.mvi;

import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputVinMviActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.input_vin.mvi.mvi.handlers.c f236649a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f236650b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f236651c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f236652d;

    public b(com.avito.android.publish.input_vin.mvi.mvi.handlers.c cVar, Provider provider, dagger.internal.l lVar, Provider provider2) {
        this.f236649a = cVar;
        this.f236650b = provider;
        this.f236651c = lVar;
        this.f236652d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.publish.input_vin.mvi.mvi.handlers.a) this.f236649a.get(), this.f236650b.get(), ((Integer) this.f236651c.f393949a).intValue(), this.f236652d.get());
    }
}
