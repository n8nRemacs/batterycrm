package com.avito.android.comfortable_deal.submitting.success.deeplink;

import Xp.InterfaceC17035a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iq.C42090c;
import javax.inject.Provider;

/* compiled from: SubmittingSuccessDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f123394a;

    /* renamed from: b, reason: collision with root package name */
    public final C42090c f123395b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f123396c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f123397d;

    public b(dv.b bVar, C42090c c42090c, dv.b bVar2, Provider provider) {
        this.f123394a = bVar;
        this.f123395b = c42090c;
        this.f123396c = bVar2;
        this.f123397d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f123394a.get(), (InterfaceC17035a) this.f123395b.get(), (a.b) this.f123396c.get(), this.f123397d.get());
    }
}
