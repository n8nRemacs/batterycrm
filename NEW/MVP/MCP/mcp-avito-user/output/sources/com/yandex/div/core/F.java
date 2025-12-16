package com.yandex.div.core;

/* compiled from: DivConfiguration_IsAccessibilityEnabledFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class F implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367245a;

    public F(C37918m c37918m) {
        this.f367245a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Boolean.valueOf(this.f367245a.f367594y);
    }
}
