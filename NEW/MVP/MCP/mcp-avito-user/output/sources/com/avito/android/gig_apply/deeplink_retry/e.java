package com.avito.android.gig_apply.deeplink_retry;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigSlotRetryPaymentDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f159620a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<HG.a> f159621b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f159622c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f159623d;

    public e(dagger.internal.f fVar, dv.b bVar, Provider provider, Provider provider2) {
        this.f159620a = bVar;
        this.f159621b = provider;
        this.f159622c = fVar;
        this.f159623d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.g) this.f159620a.get(), this.f159621b.get(), (com.avito.android.deep_linking.x) this.f159622c.get(), this.f159623d.get());
    }
}
