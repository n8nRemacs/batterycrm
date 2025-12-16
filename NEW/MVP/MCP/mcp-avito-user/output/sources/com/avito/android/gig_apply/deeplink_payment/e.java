package com.avito.android.gig_apply.deeplink_payment;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigSlotReceivePaymentDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f159599a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<HG.a> f159600b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f159601c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f159602d;

    public e(dagger.internal.f fVar, dv.b bVar, Provider provider, Provider provider2) {
        this.f159599a = bVar;
        this.f159600b = provider;
        this.f159601c = fVar;
        this.f159602d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.g) this.f159599a.get(), this.f159600b.get(), (com.avito.android.deep_linking.x) this.f159601c.get(), this.f159602d.get());
    }
}
