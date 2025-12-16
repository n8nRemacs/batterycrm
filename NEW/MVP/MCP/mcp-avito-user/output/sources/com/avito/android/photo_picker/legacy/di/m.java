package com.avito.android.photo_picker.legacy.di;

import com.avito.android.image.enhancement.C30979j;
import com.avito.android.image.enhancement.InterfaceC30973d;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvideImageEnhanceViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<InterfaceC30978i> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219741a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f219742b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30973d> f219743c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f219744d;

    public m(f fVar, Provider<InterfaceC35745a5> provider, Provider<InterfaceC30973d> provider2, Provider<com.avito.android.photo_cache.b> provider3) {
        this.f219741a = fVar;
        this.f219742b = provider;
        this.f219743c = provider2;
        this.f219744d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30979j(this.f219742b.get(), this.f219741a.f219718b, this.f219743c.get(), this.f219744d.get(), null, 16, null);
    }
}
