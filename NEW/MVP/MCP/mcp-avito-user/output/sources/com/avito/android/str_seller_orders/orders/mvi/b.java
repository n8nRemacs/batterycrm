package com.avito.android.str_seller_orders.orders.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.str_seller_orders.orders.mvi.entity.StrOrdersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mz0.C44158c;
import mz0.InterfaceC44156a;

/* compiled from: StrOrdersActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lmz0/a;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "Lmz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC44156a, StrOrdersInternalAction, C44158c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f288879a;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f288879a = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrOrdersInternalAction> b(InterfaceC44156a interfaceC44156a, C44158c c44158c) {
        return C43175k.G(new a(interfaceC44156a, this, null));
    }
}
