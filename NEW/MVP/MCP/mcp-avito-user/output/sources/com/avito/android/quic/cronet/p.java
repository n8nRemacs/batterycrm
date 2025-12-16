package com.avito.android.quic.cronet;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CronetExceptionsConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246222a;

    /* renamed from: b, reason: collision with root package name */
    public final K1 f246223b;

    public p(dagger.internal.f fVar, K1 k12) {
        this.f246222a = fVar;
        this.f246223b = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((I1) this.f246223b.get(), (InterfaceC28373a) this.f246222a.get());
    }
}
