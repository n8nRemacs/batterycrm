package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import Fz0.InterfaceC13858a;
import com.avito.android.arch.mvi.a;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeInternalAction;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrSellerOrdersRangeActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LFz0/a;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeState;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC13858a, StrSellerOrdersRangeInternalAction, StrSellerOrdersRangeState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.strsellerordersrange.domain.b f290270a;

    @Inject
    public d(@Y61.k com.avito.android.str_seller_orders.strsellerordersrange.domain.b bVar) {
        this.f290270a = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrSellerOrdersRangeInternalAction> b(InterfaceC13858a interfaceC13858a, StrSellerOrdersRangeState strSellerOrdersRangeState) {
        InterfaceC13858a interfaceC13858a2 = interfaceC13858a;
        StrSellerOrdersRangeState strSellerOrdersRangeState2 = strSellerOrdersRangeState;
        if (interfaceC13858a2 instanceof InterfaceC13858a.b) {
            return C43175k.G(new a(interfaceC13858a2, null));
        }
        if (interfaceC13858a2 instanceof InterfaceC13858a.C0318a) {
            return C43175k.G(new b(2, null));
        }
        if (interfaceC13858a2 instanceof InterfaceC13858a.c) {
            return C43175k.G(new c(this, strSellerOrdersRangeState2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
