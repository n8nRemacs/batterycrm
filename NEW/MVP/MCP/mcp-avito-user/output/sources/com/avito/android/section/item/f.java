package com.avito.android.section.item;

import com.avito.android.serp.adapter.InterfaceC34748n0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ComplementaryAdvertItemDoubleBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34748n0> f264724a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f264725b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f264726c;

    /* renamed from: d, reason: collision with root package name */
    public final u f264727d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f264728e;

    public f(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f264724a = provider;
        this.f264725b = provider2;
        this.f264726c = provider3;
        this.f264727d = uVar;
        this.f264728e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f264724a.get(), this.f264725b.get(), this.f264726c.get(), (s) this.f264727d.get(), this.f264728e.get());
    }
}
