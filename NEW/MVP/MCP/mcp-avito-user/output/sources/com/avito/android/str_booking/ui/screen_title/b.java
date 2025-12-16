package com.avito.android.str_booking.ui.screen_title;

import com.avito.android.str_booking.ui.ScreenType;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingScreenTitleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f286170a;

    /* renamed from: b, reason: collision with root package name */
    public final l f286171b;

    public b(l lVar, u uVar) {
        this.f286170a = uVar;
        this.f286171b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f286170a.get(), (ScreenType) this.f286171b.f393949a);
    }
}
