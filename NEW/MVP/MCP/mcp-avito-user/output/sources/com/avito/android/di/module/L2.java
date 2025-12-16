package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: ClickStreamSendingModule_ProvideClickStreamApiUrlFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class L2 implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.H0> f144039a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144040b;

    public L2(Provider<com.avito.android.H0> provider, Provider<com.avito.android.util.C> provider2) {
        this.f144039a = provider;
        this.f144040b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f144039a.get();
        com.avito.android.util.C c12 = this.f144040b.get();
        J2.f144015a.getClass();
        c12.o().getClass();
        return "https://www.avito.ru/clickstream/events/";
    }
}
