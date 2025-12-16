package com.yandex.div.core;

/* compiled from: DivKitConfiguration_CpuUsageHistogramReporterFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class b0 implements dagger.internal.h<com.yandex.div.histogram.b> {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f367285a;

    public b0(a0 a0Var) {
        this.f367285a = a0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f367285a.f367273c.get().a().get();
    }
}
