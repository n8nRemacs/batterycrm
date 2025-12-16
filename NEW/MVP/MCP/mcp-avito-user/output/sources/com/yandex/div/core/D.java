package com.yandex.div.core;

/* compiled from: DivConfiguration_GetTypefaceProviderFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class D implements dagger.internal.h<com.yandex.div.core.font.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367243a;

    public D(C37918m c37918m) {
        this.f367243a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.yandex.div.core.font.a aVar = this.f367243a.f367584o;
        dagger.internal.t.d(aVar);
        return aVar;
    }
}
