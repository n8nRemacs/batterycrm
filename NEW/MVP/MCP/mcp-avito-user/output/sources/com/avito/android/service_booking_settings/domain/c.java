package com.avito.android.service_booking_settings.domain;

import Qt0.InterfaceC14932a;
import com.avito.android.service_booking_settings.domain.converters.g;
import com.avito.android.service_booking_settings.domain.converters.j;
import com.avito.android.service_booking_settings.domain.converters.m;
import com.avito.android.service_booking_settings.domain.converters.p;
import com.avito.android.service_booking_settings.domain.converters.s;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingSettingsMviInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14932a> f277868a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f277869b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<g> f277870c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<s> f277871d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<p> f277872e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_settings.domain.converters.d> f277873f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<m> f277874g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<j> f277875h;

    /* renamed from: i, reason: collision with root package name */
    public final u f277876i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.service_booking_settings.data.preferences.b f277877j;

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, u uVar, com.avito.android.service_booking_settings.data.preferences.b bVar) {
        this.f277868a = provider;
        this.f277869b = provider2;
        this.f277870c = provider3;
        this.f277871d = provider4;
        this.f277872e = provider5;
        this.f277873f = provider6;
        this.f277874g = provider7;
        this.f277875h = provider8;
        this.f277876i = uVar;
        this.f277877j = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.a(w.a(this.f277868a)), this.f277869b.get(), this.f277870c.get(), this.f277871d.get(), this.f277872e.get(), this.f277873f.get(), this.f277874g.get(), this.f277875h.get(), (com.avito.android.service_booking_settings.domain.converters.a) this.f277876i.get(), (com.avito.android.service_booking_settings.data.preferences.a) this.f277877j.get());
    }
}
