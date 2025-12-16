package com.yandex.div.core.dagger;

/* compiled from: DivHistogramsModule_ProvideHistogramReporterFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class p implements dagger.internal.h<com.yandex.div.histogram.reporter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final v f367418a;

    public p(v vVar) {
        this.f367418a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.yandex.div.histogram.reporter.b bVar = (com.yandex.div.histogram.reporter.b) this.f367418a.get();
        m.f367417a.getClass();
        return new com.yandex.div.histogram.reporter.a(bVar);
    }
}
