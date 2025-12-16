package com.yandex.div.core;

/* compiled from: DivConfiguration_GetDivStateCacheFactory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38051x implements dagger.internal.h<com.yandex.div.state.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f369366a;

    public C38051x(C37918m c37918m) {
        this.f369366a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.yandex.div.state.a aVar = this.f369366a.f367575f;
        dagger.internal.t.d(aVar);
        return aVar;
    }
}
