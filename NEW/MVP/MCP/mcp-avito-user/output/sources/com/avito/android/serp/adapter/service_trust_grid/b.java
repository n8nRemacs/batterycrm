package com.avito.android.serp.adapter.service_trust_grid;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertGridServiceTrustItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f272217a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f272218b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f272219c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f272220d;

    public b(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f272217a = uVar;
        this.f272218b = provider;
        this.f272219c = provider2;
        this.f272220d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f272217a.get(), this.f272218b.get(), this.f272219c.get(), this.f272220d.get());
    }
}
