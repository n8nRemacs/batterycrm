package com.yandex.div.core;

/* compiled from: DivKitConfiguration_HistogramRecorderFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class f0 implements dagger.internal.h<com.yandex.div.histogram.s> {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f367530a;

    public f0(a0 a0Var) {
        this.f367530a = a0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.yandex.div.histogram.s(this.f367530a.f367273c.get().c().get());
    }
}
