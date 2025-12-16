package com.avito.android.profile.user_profile.cards.service_booking;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingCardPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f225483a;

    /* renamed from: b, reason: collision with root package name */
    public final u f225484b;

    public l(dagger.internal.l lVar, u uVar) {
        this.f225483a = lVar;
        this.f225484b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Y41.l) this.f225483a.f393949a, (com.avito.konveyor.adapter.d) this.f225484b.get());
    }
}
