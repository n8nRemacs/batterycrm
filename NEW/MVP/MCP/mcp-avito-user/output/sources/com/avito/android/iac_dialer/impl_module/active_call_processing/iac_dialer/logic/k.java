package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.permissions.z;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacStateInitialProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f165432a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.device_status.connection_status.a> f165433b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.device_status.power_status.a> f165434c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.audio.ringtone.c> f165435d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<PK.a> f165436e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<z> f165437f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<HK.a> f165438g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.splitter.features.c f165439h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<FK.a> f165440i;

    /* renamed from: j, reason: collision with root package name */
    public final u f165441j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<PL.i> f165442k;

    /* renamed from: l, reason: collision with root package name */
    public final C30102l3 f165443l;

    public k(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, com.avito.android.iac_dialer.impl_module.splitter.features.c cVar, Provider provider8, u uVar, Provider provider9, C30102l3 c30102l3) {
        this.f165432a = provider;
        this.f165433b = provider2;
        this.f165434c = provider3;
        this.f165435d = provider4;
        this.f165436e = provider5;
        this.f165437f = provider6;
        this.f165438g = provider7;
        this.f165439h = cVar;
        this.f165440i = provider8;
        this.f165441j = uVar;
        this.f165442k = provider9;
        this.f165443l = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f165432a.get(), this.f165433b.get(), this.f165434c.get(), this.f165435d.get(), this.f165436e.get(), this.f165437f.get(), this.f165438g.get(), (com.avito.android.iac_dialer.impl_module.splitter.features.a) this.f165439h.get(), this.f165440i.get(), (HJ.a) this.f165441j.get(), this.f165442k.get(), (Context) this.f165443l.get());
    }
}
