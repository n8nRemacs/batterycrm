package com.yandex.div.core;

/* compiled from: DivConfiguration_IsTapBeaconsEnabledFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class M implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367251a;

    public M(C37918m c37918m) {
        this.f367251a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Boolean.valueOf(this.f367251a.f367588s);
    }
}
