package com.avito.android.advert.item.consultation.secondary;

import com.avito.android.advert_core.advert.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SecondaryConsultationItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.consultation.view_model.a> f74812a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l> f74813b;

    public f(Provider<com.avito.android.advert.item.consultation.view_model.a> provider, Provider<l> provider2) {
        this.f74812a = provider;
        this.f74813b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f74812a.get(), this.f74813b.get());
    }
}
