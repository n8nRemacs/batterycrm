package com.avito.android.service_booking.mvi.domain.interactors;

import Gt0.InterfaceC13916a;
import Ks0.InterfaceC14347a;
import com.avito.android.B2;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.domain.converters.k;
import com.avito.android.service_booking_common.n;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import rt0.InterfaceC47722d;

/* compiled from: ServiceBookingCoroutinesInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14347a> f274393a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC13916a> f274394b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f274395c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC47722d> f274396d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking.mvi.domain.converters.h> f274397e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking.mvi.domain.converters.e> f274398f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<k> f274399g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<n> f274400h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<Map<String, List<String>>> f274401i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking.mvi.domain.converters.a> f274402j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<B2> f274403k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<BookingFlow> f274404l;

    /* renamed from: m, reason: collision with root package name */
    public final l f274405m;

    public e(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, l lVar) {
        this.f274393a = provider;
        this.f274394b = provider2;
        this.f274395c = provider3;
        this.f274396d = provider4;
        this.f274397e = provider5;
        this.f274398f = provider6;
        this.f274399g = provider7;
        this.f274400h = provider8;
        this.f274401i = provider9;
        this.f274402j = provider10;
        this.f274403k = provider11;
        this.f274404l = provider12;
        this.f274405m = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.b(this.f274393a), g.b(this.f274394b), this.f274395c.get(), this.f274396d.get(), this.f274397e.get(), this.f274398f.get(), this.f274399g.get(), this.f274400h.get(), this.f274401i.get(), this.f274402j.get(), this.f274403k.get(), this.f274404l.get(), (BookingFlowSource) this.f274405m.f393949a);
    }
}
