package com.avito.android.str_seller_orders.orders_filters.mvi;

import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import com.avito.android.str_seller_orders.orders_filters.mvi.entity.StrOrdersFiltersInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrOrdersFiltersBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.b<StrOrdersFiltersInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final StrOrdersFiltersOpenParams f289189a;

    @Inject
    public d(@Y61.k StrOrdersFiltersOpenParams strOrdersFiltersOpenParams) {
        this.f289189a = strOrdersFiltersOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrOrdersFiltersInternalAction> a() {
        return new C43210w(new StrOrdersFiltersInternalAction.Init(this.f289189a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
