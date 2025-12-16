package com.avito.android.short_term_rent.bookingform.domain;

import Hl0.InterfaceC14002a;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateBookingRequestUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final h f281354a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14002a> f281355b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f281356c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f281357d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f281358e;

    public f(h hVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f281354a = hVar;
        this.f281355b = provider;
        this.f281356c = provider2;
        this.f281357d = provider3;
        this.f281358e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f281354a.getClass();
        return new b(new g(), this.f281355b.get(), this.f281356c.get(), this.f281357d.get(), this.f281358e.get());
    }
}
