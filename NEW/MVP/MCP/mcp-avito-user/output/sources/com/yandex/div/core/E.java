package com.yandex.div.core;

import com.yandex.div.internal.viewpool.i;

/* compiled from: DivConfiguration_GetViewPoolReporterFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class E implements dagger.internal.h<i.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367244a;

    public E(C37918m c37918m) {
        this.f367244a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i.b bVar = this.f367244a.f367586q;
        dagger.internal.t.d(bVar);
        return bVar;
    }
}
