package com.avito.android.comfortable_deal.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: PpRecallDeeplinkDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class K implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f121873a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f121874b;

    /* renamed from: c, reason: collision with root package name */
    public final Yo.r f121875c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.domain.f f121876d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f121877e;

    public K(dv.b bVar, dv.b bVar2, Yo.r rVar, com.avito.android.comfortable_deal.domain.f fVar, Provider provider) {
        this.f121873a = bVar;
        this.f121874b = bVar2;
        this.f121875c = rVar;
        this.f121876d = fVar;
        this.f121877e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I((a.i) this.f121873a.get(), (a.g) this.f121874b.get(), (Yo.p) this.f121875c.get(), (com.avito.android.comfortable_deal.domain.e) this.f121876d.get(), this.f121877e.get());
    }
}
