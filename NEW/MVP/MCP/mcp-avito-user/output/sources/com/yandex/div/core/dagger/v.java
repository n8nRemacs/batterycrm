package com.yandex.div.core.dagger;

import com.yandex.div.core.d0;
import com.yandex.div.histogram.reporter.b;

/* compiled from: DivKitHistogramsModule_ProvideHistogramReporterDelegateFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class v implements dagger.internal.h<com.yandex.div.histogram.reporter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f367421a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f367422b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f367423c;

    public v(d0 d0Var, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f367421a = d0Var;
        this.f367422b = uVar;
        this.f367423c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f367421a.get();
        t.f367419a.getClass();
        b.a aVar = b.a.f370035a;
        dagger.internal.t.d(aVar);
        return aVar;
    }
}
