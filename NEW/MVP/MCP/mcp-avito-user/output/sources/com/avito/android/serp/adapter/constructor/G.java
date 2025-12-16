package com.avito.android.serp.adapter.constructor;

import com.avito.android.analytics.InterfaceC28373a;
import vN.C49237a;

/* compiled from: TargetButtonsAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f269450a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f269451b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f269452c;

    public G(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f269450a = uVar;
        this.f269451b = uVar2;
        this.f269452c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new F((InterfaceC28373a) this.f269450a.get(), (com.avito.android.analytics.statsd.F) this.f269451b.get(), (C49237a) this.f269452c.get());
    }
}
