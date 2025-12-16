package com.avito.android.quic.tracking;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.W6;
import com.avito.android.di.module.Y6;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.quic.p;
import com.avito.android.quic.tracking.a;
import com.avito.android.remote.analytics.C34250g;
import com.avito.android.remote.analytics.C34251h;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mj0.C44089b;
import og0.InterfaceC44773a;

/* compiled from: NetworkRequestsResultsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246350a;

    /* renamed from: b, reason: collision with root package name */
    public final W6 f246351b;

    /* renamed from: c, reason: collision with root package name */
    public final Y6 f246352c;

    /* renamed from: d, reason: collision with root package name */
    public final C34250g f246353d;

    /* renamed from: e, reason: collision with root package name */
    public final C34251h f246354e;

    /* renamed from: f, reason: collision with root package name */
    public final C44089b f246355f;

    /* renamed from: g, reason: collision with root package name */
    public final u f246356g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f246357h;

    public d(dagger.internal.f fVar, W6 w62, Y6 y62, C34250g c34250g, C34251h c34251h, C44089b c44089b, u uVar, Provider provider) {
        this.f246350a = fVar;
        this.f246351b = w62;
        this.f246352c = y62;
        this.f246353d = c34250g;
        this.f246354e = c34251h;
        this.f246355f = c44089b;
        this.f246356g = uVar;
        this.f246357h = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC28373a) this.f246350a.get(), (p.b) this.f246351b.get(), (p.e) this.f246352c.get(), (CronetTcpRstReporter.b) this.f246353d.get(), (a.InterfaceC7383a) this.f246354e.get(), (InterfaceC44773a) this.f246355f.get(), (p) this.f246356g.get(), this.f246357h.get());
    }
}
