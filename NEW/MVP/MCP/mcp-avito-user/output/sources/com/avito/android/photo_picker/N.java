package com.avito.android.photo_picker;

import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.legacy.InterfaceC33243e;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: PhotoPickerViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33243e> f218769a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f218770b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.b0> f218771c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.computer_vision.a> f218772d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f218773e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.photo_picker.legacy.di.m f218774f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f218775g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f218776h;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, com.avito.android.photo_picker.legacy.di.m mVar, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f218769a = provider;
        this.f218770b = provider2;
        this.f218771c = provider3;
        this.f218772d = provider4;
        this.f218773e = provider5;
        this.f218774f = mVar;
        this.f218775g = lVar;
        this.f218776h = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new M(this.f218769a.get(), this.f218770b.get(), this.f218771c.get(), this.f218772d.get(), this.f218773e.get(), (InterfaceC30978i) this.f218774f.get(), (PhotoPickerIntentFactory.PhotoPickerMode) this.f218775g.f393949a, ((Integer) this.f218776h.f393949a).intValue());
    }
}
