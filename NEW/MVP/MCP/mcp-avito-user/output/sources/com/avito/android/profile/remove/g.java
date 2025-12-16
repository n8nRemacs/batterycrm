package com.avito.android.profile.remove;

import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileRemoveInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f223933a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f223934b;

    /* renamed from: c, reason: collision with root package name */
    public final H90.a f223935c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f223936d;

    public g(Provider provider, Provider provider2, H90.a aVar, Provider provider3) {
        this.f223933a = provider;
        this.f223934b = provider2;
        this.f223935c = aVar;
        this.f223936d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f223933a.get(), this.f223934b.get(), (ProfileRemoveAnalytics) this.f223935c.get(), this.f223936d.get());
    }
}
