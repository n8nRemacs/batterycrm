package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Y1;

/* compiled from: FlatInfoItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f290946a;

    /* renamed from: b, reason: collision with root package name */
    public final u f290947b;

    public i(dagger.internal.l lVar, u uVar) {
        this.f290946a = lVar;
        this.f290947b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Y41.l) this.f290946a.f393949a, (Y1) this.f290947b.get());
    }
}
