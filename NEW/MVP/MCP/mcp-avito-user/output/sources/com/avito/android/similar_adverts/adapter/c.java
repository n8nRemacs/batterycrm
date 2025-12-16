package com.avito.android.similar_adverts.adapter;

import com.avito.android.serp.adapter.InterfaceC34748n0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: SimilarAdvertBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f283806a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f283807b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f283808c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f283809d;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f283806a = uVar;
        this.f283807b = provider;
        this.f283808c = provider2;
        this.f283809d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC34748n0) this.f283806a.get(), this.f283807b.get(), this.f283808c.get(), this.f283809d.get());
    }
}
