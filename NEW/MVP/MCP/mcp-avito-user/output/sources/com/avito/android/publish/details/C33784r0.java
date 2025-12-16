package com.avito.android.publish.details;

import javax.inject.Provider;

/* compiled from: PublishDetailsElementConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.r0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33784r0 implements dagger.internal.h<C33782q0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.category_parameters.a> f234908a;

    /* renamed from: b, reason: collision with root package name */
    public final Z0 f234909b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234910c;

    public C33784r0(Provider provider, Z0 z02, dagger.internal.u uVar) {
        this.f234908a = provider;
        this.f234909b = z02;
        this.f234910c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33782q0(this.f234908a.get(), (Y0) this.f234909b.get(), (com.avito.android.publish.details.item_wrapper.a) this.f234910c.get());
    }
}
