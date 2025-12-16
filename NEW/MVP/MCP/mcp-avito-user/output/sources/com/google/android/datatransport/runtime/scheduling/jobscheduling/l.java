package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes10.dex */
public final class l implements com.google.android.datatransport.runtime.dagger.internal.g<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Executor> f343226a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.d> f343227b;

    /* renamed from: c, reason: collision with root package name */
    public final FX0.i f343228c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<GX0.a> f343229d;

    public l(Provider provider, Provider provider2, FX0.i iVar, Provider provider3) {
        this.f343226a = provider;
        this.f343227b = provider2;
        this.f343228c = iVar;
        this.f343229d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f343226a.get(), this.f343227b.get(), (m) this.f343228c.get(), this.f343229d.get());
    }
}
