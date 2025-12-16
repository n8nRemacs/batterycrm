package com.yandex.div.core;

/* compiled from: DivConfiguration_GetDisplayTypefaceProviderFactory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37921p implements dagger.internal.h<com.yandex.div.core.font.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367613a;

    public C37921p(C37918m c37918m) {
        this.f367613a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.yandex.div.core.font.a aVar = this.f367613a.f367585p;
        dagger.internal.t.d(aVar);
        return aVar;
    }
}
