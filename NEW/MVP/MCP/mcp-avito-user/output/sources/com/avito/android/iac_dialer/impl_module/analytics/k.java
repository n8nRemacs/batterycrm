package com.avito.android.iac_dialer.impl_module.analytics;

import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.iac_avcalls.public_module.analytics.AvCallsFunnelEventsObserver;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.permissions.z;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacEvent4101TrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AvCallsFunnelEventsObserver> f165688a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H> f165689b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<z> f165690c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.device_status.connection_status.a> f165691d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<UJ.a> f165692e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.notifications.channels.g> f165693f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<q> f165694g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f165695h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f165696i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<F> f165697j;

    /* renamed from: k, reason: collision with root package name */
    public final u f165698k;

    public k(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, dagger.internal.f fVar, Provider provider9, u uVar) {
        this.f165688a = provider;
        this.f165689b = provider2;
        this.f165690c = provider3;
        this.f165691d = provider4;
        this.f165692e = provider5;
        this.f165693f = provider6;
        this.f165694g = provider7;
        this.f165695h = provider8;
        this.f165696i = fVar;
        this.f165697j = provider9;
        this.f165698k = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f165688a.get(), this.f165689b.get(), this.f165690c.get(), this.f165691d.get(), this.f165692e.get(), this.f165693f.get(), this.f165694g.get(), this.f165695h.get(), (InterfaceC28373a) this.f165696i.get(), this.f165697j.get(), (IacTechInfoStorage) this.f165698k.get());
    }
}
