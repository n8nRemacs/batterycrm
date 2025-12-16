package com.avito.android.publish_limits_info.history;

import com.avito.android.remote.K0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishLimitsHistoryInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K0> f245848a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f245849b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f245850c;

    public k(Provider<K0> provider, Provider<InterfaceC35745a5> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f245848a = provider;
        this.f245849b = provider2;
        this.f245850c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f245848a.get(), this.f245849b.get(), this.f245850c.get());
    }
}
