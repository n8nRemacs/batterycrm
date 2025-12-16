package com.avito.android.analytics.clickstream;

import com.avito.android.analytics.inhouse_transport.C28458a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ClickStreamCommonModule_ProvideInstantEventThrottlingTimerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28388m implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f89817a;

    public C28388m(Provider<InterfaceC35745a5> provider) {
        this.f89817a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f89817a.get();
        C28379d c28379d = C28379d.f89781a;
        return new C28458a(interfaceC35745a5);
    }
}
