package com.avito.android.service_booking_calendar.domain.use_case;

import Ys0.InterfaceC18323a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadDayScheduleUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC18323a> f275578a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.domain.c> f275579b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f275580c;

    /* renamed from: d, reason: collision with root package name */
    public final l f275581d;

    /* renamed from: e, reason: collision with root package name */
    public final l f275582e;

    /* renamed from: f, reason: collision with root package name */
    public final l f275583f;

    public d(Provider provider, Provider provider2, Provider provider3, l lVar, l lVar2, l lVar3) {
        this.f275578a = provider;
        this.f275579b = provider2;
        this.f275580c = provider3;
        this.f275581d = lVar;
        this.f275582e = lVar2;
        this.f275583f = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f275578a.get(), this.f275579b.get(), this.f275580c.get(), (Integer) this.f275581d.f393949a, ((Boolean) this.f275582e.f393949a).booleanValue(), ((Boolean) this.f275583f.f393949a).booleanValue());
    }
}
