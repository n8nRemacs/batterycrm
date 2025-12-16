package com.avito.android.str_seller_orders.strsellerordersdialog;

import com.avito.android.str_seller_orders.strsellerordersdialog.mvi.f;
import com.avito.android.str_seller_orders.strsellerordersdialog.mvi.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersDialogViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f290097a;

    public c(g gVar) {
        this.f290097a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f290097a.get(), null, 2, null);
    }
}
