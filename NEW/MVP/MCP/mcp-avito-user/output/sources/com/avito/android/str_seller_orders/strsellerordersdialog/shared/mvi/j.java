package com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi;

import Dz0.b;
import com.avito.android.arch.mvi.u;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SharedViewModelReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/shared/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LDz0/b;", "LDz0/d;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<Dz0.b, Dz0.d> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Dz0.d a(Dz0.b bVar, Dz0.d dVar) {
        Dz0.b bVar2 = bVar;
        Dz0.d dVar2 = dVar;
        boolean z12 = false;
        if (bVar2 instanceof b.a) {
            throw null;
        }
        if (!(bVar2 instanceof b.d)) {
            return dVar2;
        }
        StrSellerOrdersDialogData strSellerOrdersDialogData = ((b.d) bVar2).f3601a;
        StrSellerOrdersDialogData strSellerOrdersDialogData2 = dVar2.f3606a;
        if (strSellerOrdersDialogData2 != null && strSellerOrdersDialogData.f290171e == strSellerOrdersDialogData2.f290171e) {
            z12 = true;
        }
        return new Dz0.d(strSellerOrdersDialogData, !z12);
    }
}
