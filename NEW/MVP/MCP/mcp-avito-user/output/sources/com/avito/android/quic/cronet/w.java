package com.avito.android.quic.cronet;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.X6;
import com.avito.android.quic.cronet.CronetTcpRstReporter;
import com.avito.android.quic.p;
import com.avito.android.remote.analytics.C34250g;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CronetTcpRstReporter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class w implements dagger.internal.h<CronetTcpRstReporter> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f246234a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f246235b;

    /* renamed from: c, reason: collision with root package name */
    public final X6 f246236c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<f> f246237d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<o> f246238e;

    /* renamed from: f, reason: collision with root package name */
    public final C34250g f246239f;

    public w(dagger.internal.l lVar, dagger.internal.f fVar, X6 x62, Provider provider, Provider provider2, C34250g c34250g) {
        this.f246234a = lVar;
        this.f246235b = fVar;
        this.f246236c = x62;
        this.f246237d = provider;
        this.f246238e = provider2;
        this.f246239f = c34250g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new CronetTcpRstReporter((Application) this.f246234a.f393949a, (InterfaceC28373a) this.f246235b.get(), (p.d) this.f246236c.get(), this.f246237d.get(), this.f246238e.get(), (CronetTcpRstReporter.b) this.f246239f.get());
    }
}
