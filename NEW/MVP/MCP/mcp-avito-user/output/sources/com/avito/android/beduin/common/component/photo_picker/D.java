package com.avito.android.beduin.common.component.photo_picker;

import javax.inject.Provider;

/* compiled from: UploadConverterProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.b> f101936a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f101937b;

    public D(dagger.internal.u uVar, Provider provider) {
        this.f101936a = provider;
        this.f101937b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f101936a.get(), (N70.b) this.f101937b.get());
    }
}
