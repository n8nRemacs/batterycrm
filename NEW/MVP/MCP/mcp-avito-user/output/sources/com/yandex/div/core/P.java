package com.yandex.div.core;

/* compiled from: DivConfiguration_IsVisibilityBeaconsEnabledFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class P implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367254a;

    public P(C37918m c37918m) {
        this.f367254a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Boolean.valueOf(this.f367254a.f367589t);
    }
}
