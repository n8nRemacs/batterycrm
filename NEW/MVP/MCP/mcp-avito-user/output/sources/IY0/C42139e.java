package iy0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iy0.InterfaceC42138d;

/* compiled from: StrBookingPaymentModule_InnerProvider_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: iy0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42139e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_booking.ui.payment_details.table_row.b f405409a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_booking.ui.payment_details.divider.b f405410b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_booking.ui.payment_details.terms.b f405411c;

    public C42139e(com.avito.android.str_booking.ui.payment_details.table_row.b bVar, com.avito.android.str_booking.ui.payment_details.divider.b bVar2, com.avito.android.str_booking.ui.payment_details.terms.b bVar3) {
        this.f405409a = bVar;
        this.f405410b = bVar2;
        this.f405411c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.str_booking.ui.payment_details.table_row.a aVar = (com.avito.android.str_booking.ui.payment_details.table_row.a) this.f405409a.get();
        com.avito.android.str_booking.ui.payment_details.divider.a aVar2 = (com.avito.android.str_booking.ui.payment_details.divider.a) this.f405410b.get();
        com.avito.android.str_booking.ui.payment_details.terms.a aVar3 = (com.avito.android.str_booking.ui.payment_details.terms.a) this.f405411c.get();
        InterfaceC42138d.a.f405408a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
