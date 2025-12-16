package com.avito.android.section.item.redesign;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ComplementaryAdvertRedesignVerticalItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264820a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f264821b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f264822c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f264823d;

    public q(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f264820a = uVar;
        this.f264821b = provider;
        this.f264822c = provider2;
        this.f264823d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((g) this.f264820a.get(), this.f264821b.get(), this.f264822c.get(), this.f264823d.get());
    }
}
