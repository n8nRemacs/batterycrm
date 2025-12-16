package com.avito.android.str_seller_orders.orders_buyer.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.StrOrdersBuyerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pz0.C47173d;
import pz0.InterfaceC47170a;

/* compiled from: StrOrdersBuyerActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lpz0/a;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "Lpz0/d;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC47170a, StrOrdersBuyerInternalAction, C47173d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_buyer.domain.a f289071a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f289072b;

    @Inject
    public b(@Y61.k com.avito.android.str_seller_orders.orders_buyer.domain.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f289071a = aVar;
        this.f289072b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrOrdersBuyerInternalAction> b(InterfaceC47170a interfaceC47170a, C47173d c47173d) {
        return C43175k.G(new a(interfaceC47170a, this, c47173d, null));
    }
}
