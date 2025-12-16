package com.avito.android.quic;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.quic.tracking.a;
import dagger.internal.y;

/* compiled from: QuicModule_ProvideNetworkRequestsResultsTracker$_common_quic_implFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<com.avito.android.quic.tracking.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f246267a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.quic.tracking.d f246268b;

    /* renamed from: c, reason: collision with root package name */
    public final K1 f246269c;

    public l(f fVar, com.avito.android.quic.tracking.d dVar, K1 k12) {
        this.f246267a = fVar;
        this.f246268b = dVar;
        this.f246269c = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = (I1) this.f246269c.get();
        this.f246267a.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[50];
        Object obj = ((Boolean) i12.f67302X.a().invoke()).booleanValue() ? (com.avito.android.quic.tracking.a) this.f246268b.get() : a.b.f246331a;
        dagger.internal.t.d(obj);
        return obj;
    }
}
