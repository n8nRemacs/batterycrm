package com.avito.android.service_booking_common;

import android.content.res.Resources;
import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f276680a;

    /* renamed from: b, reason: collision with root package name */
    public final u f276681b;

    public p(dagger.internal.l lVar, u uVar) {
        this.f276680a = lVar;
        this.f276681b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Resources) this.f276680a.f393949a, (InterfaceC35945t1) this.f276681b.get());
    }
}
