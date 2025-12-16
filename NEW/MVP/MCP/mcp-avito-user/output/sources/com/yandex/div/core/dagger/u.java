package com.yandex.div.core.dagger;

import com.yandex.div.core.c0;
import com.yandex.div.core.d0;
import com.yandex.div.histogram.f;

/* compiled from: DivKitHistogramsModule_ProvideDivParsingHistogramReporterFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class u implements dagger.internal.h<com.yandex.div.histogram.f> {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f367420a;

    public u(d0 d0Var, v vVar, c0 c0Var) {
        this.f367420a = d0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f367420a.get();
        t.f367419a.getClass();
        com.yandex.div.histogram.f.f370012a.getClass();
        com.yandex.div.histogram.c value = f.a.f370014b.getValue();
        dagger.internal.t.d(value);
        return value;
    }
}
