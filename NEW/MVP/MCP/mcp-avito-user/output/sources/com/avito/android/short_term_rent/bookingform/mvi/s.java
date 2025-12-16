package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import javax.inject.Provider;

/* compiled from: BookingFormActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<C34968a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f282004a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.bookingform.mvi.interactor.d> f282005b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f282006c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.bookingform.mvi.interactor.u> f282007d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.bookingform.mvi.interactor.a> f282008e;

    public s(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f282004a = lVar;
        this.f282005b = provider;
        this.f282006c = uVar;
        this.f282007d = provider2;
        this.f282008e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34968a((BookingFormOpenParams) this.f282004a.f393949a, this.f282005b.get(), (com.avito.android.short_term_rent.bookingform.mvi.interactor.r) this.f282006c.get(), this.f282007d.get(), this.f282008e.get());
    }
}
