package com.avito.android.quic;

import com.avito.android.quic.b;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QuicModule_ProvideQuicInterceptorFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f246272a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f246273b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f246274c;

    public n(f fVar, dagger.internal.u uVar, Provider provider) {
        this.f246272a = fVar;
        this.f246273b = uVar;
        this.f246274c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = this.f246274c.get();
        this.f246272a.getClass();
        Object obj = pVar.c() ? (b) this.f246273b.get() : b.a.f246166b;
        dagger.internal.t.d(obj);
        return obj;
    }
}
