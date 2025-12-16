package com.yandex.div.core;

/* compiled from: DivConfiguration_GetAreVisualErrorsEnabledFactory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37920o implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367612a;

    public C37920o(C37918m c37918m) {
        this.f367612a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Boolean.valueOf(this.f367612a.f367592w);
    }
}
