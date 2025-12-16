package com.avito.android.di.module;

import com.avito.android.util.C35958v0;
import com.avito.android.util.InterfaceC35879r0;
import com.avito.android.util.InterfaceC35951u0;
import javax.inject.Provider;

/* compiled from: SendMetricsModule_ProvideDataDiskUsageMetricProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K7 implements dagger.internal.h<com.avito.android.service.short_task.metrics.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35879r0> f144033a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144034b;

    public K7(dagger.internal.u uVar, Provider provider) {
        this.f144033a = provider;
        this.f144034b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35879r0 interfaceC35879r0 = this.f144033a.get();
        InterfaceC35951u0 interfaceC35951u0 = (InterfaceC35951u0) this.f144034b.get();
        H7 h72 = H7.f143987a;
        return new com.avito.android.service.short_task.metrics.g(new C35958v0(interfaceC35879r0, interfaceC35951u0));
    }
}
