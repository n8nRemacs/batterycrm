package com.avito.android.hotel_booking.enter_data.mvi;

import com.avito.android.hotel_booking.enter_data.EnterDataOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EnterDataBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f163576a;

    public f(dagger.internal.l lVar) {
        this.f163576a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((EnterDataOpenParams) this.f163576a.f393949a);
    }
}
