package com.yandex.div.core;

/* compiled from: DivConfiguration_IsMultipleStateChangeEnabledFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class K implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367249a;

    public K(C37918m c37918m) {
        this.f367249a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Boolean.valueOf(this.f367249a.f367568C);
    }
}
