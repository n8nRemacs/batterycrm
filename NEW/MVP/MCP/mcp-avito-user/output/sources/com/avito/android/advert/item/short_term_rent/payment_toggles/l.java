package com.avito.android.advert.item.short_term_rent.payment_toggles;

import com.avito.android.advert.item.short_term_rent.payment_toggles.h;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTravelPaymentTogglesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f80101a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f80102b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f80103c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<c> f80104d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f80105e;

    public l(dagger.internal.f fVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f80101a = uVar;
        this.f80102b = provider;
        this.f80103c = fVar;
        this.f80104d = provider2;
        this.f80105e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.a(w.a(this.f80101a)), this.f80102b.get(), (h.a) this.f80103c.get(), this.f80104d.get(), this.f80105e.get());
    }
}
