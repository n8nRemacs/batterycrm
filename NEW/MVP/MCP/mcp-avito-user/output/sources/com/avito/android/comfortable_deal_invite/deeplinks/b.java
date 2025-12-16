package com.avito.android.comfortable_deal_invite.deeplinks;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComfortableDealInviteDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f123505a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f123506b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f123507c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f123508d;

    public b(C30102l3 c30102l3, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f123505a = c30102l3;
        this.f123506b = bVar;
        this.f123507c = bVar2;
        this.f123508d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f123505a.get(), (a.InterfaceC4053a) this.f123507c.get(), (a.b) this.f123506b.get(), this.f123508d.get());
    }
}
