package com.avito.android.hotel_booking.select_single_value.mvi;

import com.avito.android.hotel_booking.select_single_value.SelectSingleValueOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectSingleValueBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f164106a;

    public e(dagger.internal.l lVar) {
        this.f164106a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((SelectSingleValueOpenParams) this.f164106a.f393949a);
    }
}
