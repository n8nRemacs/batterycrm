package com.yandex.div.core;

/* compiled from: DivConfiguration_IsHyphenationSupportedFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class I implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C37918m f367247a;

    public I(C37918m c37918m) {
        this.f367247a = c37918m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Boolean.valueOf(this.f367247a.f367593x);
    }
}
