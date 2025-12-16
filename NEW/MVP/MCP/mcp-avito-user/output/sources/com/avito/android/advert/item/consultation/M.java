package com.avito.android.advert.item.consultation;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import javax.inject.Provider;

/* compiled from: ConsultationButtonPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f74684a;

    public M(Provider<InterfaceC28265d> provider) {
        this.f74684a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L(this.f74684a.get());
    }
}
