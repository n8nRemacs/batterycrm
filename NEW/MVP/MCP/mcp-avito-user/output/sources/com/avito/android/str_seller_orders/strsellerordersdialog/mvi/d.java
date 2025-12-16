package com.avito.android.str_seller_orders.strsellerordersdialog.mvi;

import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersDialogBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f290144a;

    public d(l lVar) {
        this.f290144a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((StrSellerOrdersDialogData) this.f290144a.f393949a);
    }
}
