package com.avito.android.iac_dialer.impl_module.push_handler;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.permissions.z;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vK.InterfaceC49223a;

/* compiled from: IacPushHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f166205a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<BL.a> f166206b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<z> f166207c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f166208d;

    /* renamed from: e, reason: collision with root package name */
    public final C30102l3 f166209e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<F> f166210f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f166211g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f166212h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<Bk0.f> f166213i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<IacTechInfoStorage> f166214j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<R0> f166215k;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3, C30102l3 c30102l3, Provider provider4, dagger.internal.f fVar, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f166205a = uVar;
        this.f166206b = provider;
        this.f166207c = provider2;
        this.f166208d = provider3;
        this.f166209e = c30102l3;
        this.f166210f = provider4;
        this.f166211g = fVar;
        this.f166212h = provider5;
        this.f166213i = provider6;
        this.f166214j = provider7;
        this.f166215k = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC49223a) this.f166205a.get(), this.f166206b.get(), this.f166207c.get(), dagger.internal.g.b(this.f166208d), (Context) this.f166209e.get(), this.f166210f.get(), (InterfaceC28373a) this.f166211g.get(), this.f166212h.get(), this.f166213i.get(), this.f166214j.get(), this.f166215k.get());
    }
}
