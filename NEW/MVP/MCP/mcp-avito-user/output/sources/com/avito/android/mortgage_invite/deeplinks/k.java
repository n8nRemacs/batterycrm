package com.avito.android.mortgage_invite.deeplinks;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import l20.InterfaceC43530a;
import q20.InterfaceC47187a;

/* compiled from: MortgageApplicationLeadDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f205832a;

    /* renamed from: b, reason: collision with root package name */
    public final l20.c f205833b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47187a> f205834c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f205835d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f205836e;

    public k(dv.b bVar, l20.c cVar, Provider provider, C25721c c25721c, Provider provider2) {
        this.f205832a = bVar;
        this.f205833b = cVar;
        this.f205834c = provider;
        this.f205835d = c25721c;
        this.f205836e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((a.InterfaceC4053a) this.f205832a.get(), (InterfaceC43530a) this.f205833b.get(), this.f205834c.get(), (C25719a) this.f205835d.get(), this.f205836e.get());
    }
}
