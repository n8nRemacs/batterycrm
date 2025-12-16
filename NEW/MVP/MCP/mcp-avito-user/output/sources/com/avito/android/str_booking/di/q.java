package com.avito.android.str_booking.di;

import com.avito.android.str_booking.ui.ScreenType;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StrBookingModule_ProvideScreenInsetsDelegateFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<com.avito.android.str_booking.ui.delegates.e> {

    /* renamed from: a, reason: collision with root package name */
    public final o f285566a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f285567b;

    public q(o oVar, dagger.internal.l lVar) {
        this.f285566a = oVar;
        this.f285567b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ScreenType screenType = (ScreenType) this.f285567b.f393949a;
        this.f285566a.getClass();
        int iOrdinal = screenType.ordinal();
        if (iOrdinal == 0) {
            return new com.avito.android.str_booking.ui.delegates.b();
        }
        if (iOrdinal == 1) {
            return new com.avito.android.str_booking.ui.delegates.g();
        }
        throw new NoWhenBranchMatchedException();
    }
}
