package com.avito.android.photo_picker.legacy.di;

import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvidesResponsiveAdapterPresenter$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class y implements dagger.internal.h<com.avito.android.recycler.responsive.e> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219784a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f219785b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f219786c;

    public y(f fVar, dagger.internal.u uVar, Provider provider) {
        this.f219784a = fVar;
        this.f219785b = provider;
        this.f219786c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f219785b.get();
        com.avito.android.recycler.responsive.a aVar2 = (com.avito.android.recycler.responsive.a) this.f219786c.get();
        this.f219784a.getClass();
        return new com.avito.android.recycler.responsive.f(aVar, aVar2);
    }
}
