package com.yandex.div.core;

/* compiled from: DivConfiguration_IsResourceCacheEnabledFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class L implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367250a;

    public L(C37918m c37918m) {
        this.f367250a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Boolean.valueOf(this.f367250a.f367567B);
    }
}
