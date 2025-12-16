package com.avito.android.advert.item.anchor_trust_factors.topbar;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTopBarAnchorsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f72856a;

    /* renamed from: b, reason: collision with root package name */
    public final u f72857b;

    public c(u uVar, Provider provider) {
        this.f72856a = provider;
        this.f72857b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f72856a.get(), (d) this.f72857b.get());
    }
}
