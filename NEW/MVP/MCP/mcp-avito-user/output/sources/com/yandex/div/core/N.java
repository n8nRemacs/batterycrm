package com.yandex.div.core;

/* compiled from: DivConfiguration_IsViewPoolEnabledFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class N implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367252a;

    public N(C37918m c37918m) {
        this.f367252a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Boolean.valueOf(this.f367252a.f367595z);
    }
}
