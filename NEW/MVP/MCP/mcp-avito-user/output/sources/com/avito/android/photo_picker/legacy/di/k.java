package com.avito.android.photo_picker.legacy.di;

import com.avito.android.photo_picker.legacy.di.a;
import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvideDisplayAnalyzer$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<com.avito.android.photo_picker.legacy.details_list.c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219737a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L0> f219738b;

    public k(f fVar, Provider<L0> provider) {
        this.f219737a = fVar;
        this.f219738b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        L0 l02 = (L0) ((a.c.d) this.f219738b).get();
        this.f219737a.getClass();
        return new com.avito.android.photo_picker.legacy.details_list.d(l02);
    }
}
