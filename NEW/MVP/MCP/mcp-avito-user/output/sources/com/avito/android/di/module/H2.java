package com.avito.android.di.module;

import com.avito.android.analytics.inhouse_transport.C28458a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ClickStreamModule_ProvideClickstreamTimerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H2 implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f143981a;

    public H2(Provider<InterfaceC35745a5> provider) {
        this.f143981a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f143981a.get();
        E2 e22 = E2.f143902a;
        return new C28458a(interfaceC35745a5);
    }
}
