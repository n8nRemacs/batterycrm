package com.avito.android.section.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: SectionAdvertItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264734a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f264735b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f264736c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f264737d;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f264734a = uVar;
        this.f264735b = provider;
        this.f264736c = provider2;
        this.f264737d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((m) this.f264734a.get(), this.f264735b.get(), this.f264736c.get(), this.f264737d.get());
    }
}
