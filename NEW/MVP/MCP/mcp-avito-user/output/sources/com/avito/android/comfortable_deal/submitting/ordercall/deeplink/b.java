package com.avito.android.comfortable_deal.submitting.ordercall.deeplink;

import Xp.InterfaceC17035a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iq.C42090c;
import javax.inject.Provider;

/* compiled from: OrderCallDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f123025a;

    /* renamed from: b, reason: collision with root package name */
    public final C42090c f123026b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f123027c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f123028d;

    public b(dv.b bVar, C42090c c42090c, dv.b bVar2, Provider provider) {
        this.f123025a = bVar;
        this.f123026b = c42090c;
        this.f123027c = bVar2;
        this.f123028d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f123025a.get(), (InterfaceC17035a) this.f123026b.get(), (a.b) this.f123027c.get(), this.f123028d.get());
    }
}
