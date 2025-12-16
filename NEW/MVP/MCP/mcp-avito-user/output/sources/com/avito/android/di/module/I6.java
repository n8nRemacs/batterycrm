package com.avito.android.di.module;

import java.util.Set;

/* compiled from: PhotoPickerAnalyticModule_ProvideEventStream$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I6 implements dagger.internal.h<com.avito.android.analytics.b0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.A f144008a;

    public I6(dagger.internal.A a12) {
        this.f144008a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f144008a.get();
        int i12 = H6.f143986a;
        return new com.avito.android.analytics.c0(set);
    }
}
