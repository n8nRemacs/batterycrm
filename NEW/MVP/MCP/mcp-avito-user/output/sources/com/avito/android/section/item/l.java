package com.avito.android.section.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: SectionAdvertItemDoubleBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264744a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f264745b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f264746c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f264747d;

    public l(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f264744a = uVar;
        this.f264745b = provider;
        this.f264746c = provider2;
        this.f264747d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((m) this.f264744a.get(), this.f264745b.get(), this.f264746c.get(), this.f264747d.get());
    }
}
