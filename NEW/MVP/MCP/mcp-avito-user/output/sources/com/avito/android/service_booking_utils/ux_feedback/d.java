package com.avito.android.service_booking_utils.ux_feedback;

import com.avito.android.account.E;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f278403a;

    /* renamed from: b, reason: collision with root package name */
    public final u f278404b;

    public d(u uVar, u uVar2) {
        this.f278403a = uVar;
        this.f278404b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((E) this.f278403a.get(), (SK0.b) this.f278404b.get());
    }
}
