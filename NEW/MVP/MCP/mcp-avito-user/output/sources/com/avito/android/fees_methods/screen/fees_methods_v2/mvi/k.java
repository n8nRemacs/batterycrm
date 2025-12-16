package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import Mf0.C14483c;
import Mf0.InterfaceC14484d;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesMethodsV2OneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f158304a;

    /* renamed from: b, reason: collision with root package name */
    public final C14483c f158305b;

    public k(Provider provider, C14483c c14483c) {
        this.f158304a = provider;
        this.f158305b = c14483c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f158304a.get(), (InterfaceC14484d) this.f158305b.get());
    }
}
