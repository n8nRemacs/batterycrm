package com.avito.android.quic.tracking;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.W6;
import com.avito.android.di.module.Y6;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.quic.p;
import com.avito.android.remote.analytics.C34250g;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mj0.C44089b;
import og0.InterfaceC44773a;

/* compiled from: QuicRequestsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246384a;

    /* renamed from: b, reason: collision with root package name */
    public final W6 f246385b;

    /* renamed from: c, reason: collision with root package name */
    public final Y6 f246386c;

    /* renamed from: d, reason: collision with root package name */
    public final C34250g f246387d;

    /* renamed from: e, reason: collision with root package name */
    public final C44089b f246388e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<p> f246389f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f246390g;

    public i(dagger.internal.f fVar, W6 w62, Y6 y62, C34250g c34250g, C44089b c44089b, Provider provider, Provider provider2) {
        this.f246384a = fVar;
        this.f246385b = w62;
        this.f246386c = y62;
        this.f246387d = c34250g;
        this.f246388e = c44089b;
        this.f246389f = provider;
        this.f246390g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC28373a) this.f246384a.get(), (p.b) this.f246385b.get(), (p.e) this.f246386c.get(), (CronetTcpRstReporter.b) this.f246387d.get(), (InterfaceC44773a) this.f246388e.get(), this.f246389f.get(), this.f246390g.get());
    }
}
