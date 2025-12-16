package com.avito.android.str_seller_orders.strsellerorders.domain;

import Y41.p;
import Y41.q;
import Y61.k;
import com.avito.android.remote.model.StrOrdersListBody;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerOrdersInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/domain/a;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @k
    InterfaceC43160i<StrSellerOrdersInternalAction> a(@k String str, @k p<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Continuation<? super G0>, ? extends Object> pVar, @k q<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Throwable, ? super Continuation<? super G0>, ? extends Object> qVar);

    @k
    InterfaceC43160i<StrSellerOrdersInternalAction> b(boolean z12, @k StrOrdersListBody strOrdersListBody);

    @k
    InterfaceC43160i<StrSellerOrdersInternalAction> c(@k String str, @k Map<String, String> map, @k p<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Continuation<? super G0>, ? extends Object> pVar, @k q<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Throwable, ? super Continuation<? super G0>, ? extends Object> qVar);

    @k
    InterfaceC43160i<StrSellerOrdersInternalAction> d(@k StrSellerOrdersDialogData strSellerOrdersDialogData);
}
