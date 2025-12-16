package com.avito.android.publish.analytics;

import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: PublishInputsAnalyticTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class O implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f232177a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34155z> f232178b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Set<TV0.d<?, ?>>> f232179c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC36030r0> f232180d;

    public O(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f232177a = uVar;
        this.f232178b = provider;
        this.f232179c = provider2;
        this.f232180d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F((InterfaceC33535v) this.f232177a.get(), this.f232178b.get(), this.f232179c.get(), this.f232180d.get());
    }
}
