package com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VinCroppedImageItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final c f245190a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f245191b;

    public m(c cVar, Provider provider) {
        this.f245190a = cVar;
        this.f245191b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f245190a.getClass();
        return new l(new b(), this.f245191b.get());
    }
}
