package com.avito.android.service_booking.mvi.step;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: ServiceBookingMviStepViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class S implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking.mvi.step.mvi.m f274481a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f274482b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.beduin.v2.engine.component.B> f274483c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f274484d;

    /* renamed from: e, reason: collision with root package name */
    public final C31144q0 f274485e;

    public S(com.avito.android.service_booking.mvi.step.mvi.m mVar, Provider provider, Provider provider2, Provider provider3, C31144q0 c31144q0) {
        this.f274481a = mVar;
        this.f274482b = provider;
        this.f274483c = provider2;
        this.f274484d = provider3;
        this.f274485e = c31144q0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new P((com.avito.android.service_booking.mvi.step.mvi.l) this.f274481a.get(), this.f274482b.get(), this.f274483c.get(), this.f274484d.get(), (aU0.b) this.f274485e.get());
    }
}
