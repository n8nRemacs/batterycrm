package com.avito.android.messenger.channels.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RefreshLockTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f187136a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f187137b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<b> f187138c;

    public l(Provider<InterfaceC28373a> provider, Provider<InterfaceC35745a5> provider2, Provider<b> provider3) {
        this.f187136a = provider;
        this.f187137b = provider2;
        this.f187138c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f187136a.get(), this.f187137b.get(), this.f187138c.get());
    }
}
