package com.avito.android.service_booking.mvi.step;

import android.content.res.Resources;

/* compiled from: ServiceBookingItemDecorator_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.service_booking.mvi.step.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34908b implements dagger.internal.h<C34907a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f274519a;

    public C34908b(dagger.internal.l lVar) {
        this.f274519a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34907a((Resources) this.f274519a.f393949a);
    }
}
