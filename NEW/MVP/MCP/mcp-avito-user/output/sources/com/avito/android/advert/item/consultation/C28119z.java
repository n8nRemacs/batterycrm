package com.avito.android.advert.item.consultation;

import javax.inject.Provider;

/* compiled from: ConsultationAfterIceBreakersItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.consultation.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28119z implements dagger.internal.h<C28118y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f74857a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f74858b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.advert.l> f74859c;

    public C28119z(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f74857a = uVar;
        this.f74858b = provider;
        this.f74859c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28118y((com.avito.android.advert.item.consultation.view_model.a) this.f74857a.get(), this.f74858b.get(), this.f74859c.get());
    }
}
