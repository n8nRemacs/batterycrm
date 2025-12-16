package com.avito.android.str_booking.di;

import com.avito.android.str_booking.ui.ScreenType;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StrBookingModule_ProvideFooterDelegateFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<com.avito.android.str_booking.ui.delegates.c> {

    /* renamed from: a, reason: collision with root package name */
    public final o f285564a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f285565b;

    public p(o oVar, dagger.internal.l lVar) {
        this.f285564a = oVar;
        this.f285565b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ScreenType screenType = (ScreenType) this.f285565b.f393949a;
        this.f285564a.getClass();
        int iOrdinal = screenType.ordinal();
        if (iOrdinal == 0) {
            return new com.avito.android.str_booking.ui.delegates.a();
        }
        if (iOrdinal == 1) {
            return new com.avito.android.str_booking.ui.delegates.f();
        }
        throw new NoWhenBranchMatchedException();
    }
}
