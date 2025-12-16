package com.avito.android.model_card.screen.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: ModelCardBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f198101a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<FZ.b> f198102b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f198103c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.model_card.screen.domain.c f198104d;

    public g(Provider provider, Provider provider2, Provider provider3, com.avito.android.model_card.screen.domain.c cVar) {
        this.f198101a = provider;
        this.f198102b = provider2;
        this.f198103c = provider3;
        this.f198104d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f198101a.get(), this.f198102b.get(), this.f198103c.get(), (com.avito.android.model_card.screen.domain.a) this.f198104d.get());
    }
}
