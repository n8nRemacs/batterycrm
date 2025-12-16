package com.avito.android.service_booking.mvi.step.mvi;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: ServiceBookingMviStepBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking.mvi.domain.interactors.a> f274770a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f274771b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f274772c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f274773d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f274774e;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider) {
        this.f274770a = provider;
        this.f274771b = lVar;
        this.f274772c = lVar2;
        this.f274773d = lVar3;
        this.f274774e = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f274770a.get(), (Map) this.f274771b.f393949a, (String) this.f274772c.f393949a, (String) this.f274773d.f393949a, (String) this.f274774e.f393949a);
    }
}
