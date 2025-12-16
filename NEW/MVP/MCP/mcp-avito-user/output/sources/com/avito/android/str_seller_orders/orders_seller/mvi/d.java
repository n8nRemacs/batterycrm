package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState;
import com.avito.android.travel_seller_banners.models.PageForBanner;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sz0.C48445f;
import tz0.InterfaceC48745a;

/* compiled from: StrSellerOrdersActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Ltz0/a;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC48745a, StrSellerOrdersInternalAction, StrSellerOrdersState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.s f289547a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.b f289548b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.d f289549c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.p f289550d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.m f289551e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.j f289552f;

    @Inject
    public d(@Y61.k com.avito.android.str_seller_orders.orders_seller.domain.s sVar, @Y61.k com.avito.android.str_seller_orders.orders_seller.domain.b bVar, @Y61.k com.avito.android.str_seller_orders.orders_seller.domain.d dVar, @Y61.k com.avito.android.str_seller_orders.orders_seller.domain.p pVar, @Y61.k com.avito.android.str_seller_orders.orders_seller.domain.m mVar, @Y61.k com.avito.android.str_seller_orders.orders_seller.domain.j jVar) {
        this.f289547a = sVar;
        this.f289548b = bVar;
        this.f289549c = dVar;
        this.f289550d = pVar;
        this.f289551e = mVar;
        this.f289552f = jVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrSellerOrdersInternalAction> b(InterfaceC48745a interfaceC48745a, StrSellerOrdersState strSellerOrdersState) {
        C43210w c43210w;
        boolean z12 = true;
        InterfaceC48745a interfaceC48745a2 = interfaceC48745a;
        StrSellerOrdersState strSellerOrdersState2 = strSellerOrdersState;
        if (interfaceC48745a2 instanceof InterfaceC48745a.C12697a) {
            return new C43210w(StrSellerOrdersInternalAction.CloseScreen.f289562b);
        }
        if (interfaceC48745a2 instanceof InterfaceC48745a.g) {
            return this.f289552f.a(((InterfaceC48745a.g) interfaceC48745a2).f439705a);
        }
        if (interfaceC48745a2 instanceof InterfaceC48745a.b) {
            c43210w = new C43210w(new StrSellerOrdersInternalAction.OpenDeeplink(((InterfaceC48745a.b) interfaceC48745a2).f439700a));
        } else if (interfaceC48745a2 instanceof InterfaceC48745a.c) {
            c43210w = new C43210w(new StrSellerOrdersInternalAction.OpenDeeplink(((InterfaceC48745a.c) interfaceC48745a2).f439701a));
        } else if (interfaceC48745a2 instanceof InterfaceC48745a.h) {
            c43210w = new C43210w(new StrSellerOrdersInternalAction.OpenDeeplink(((InterfaceC48745a.h) interfaceC48745a2).f439706a));
        } else {
            if (!(interfaceC48745a2 instanceof InterfaceC48745a.m)) {
                if (interfaceC48745a2 instanceof InterfaceC48745a.e) {
                    return C43175k.G(new a(strSellerOrdersState2, this, (InterfaceC48745a.e) interfaceC48745a2, null));
                }
                if (interfaceC48745a2 instanceof InterfaceC48745a.f) {
                    return C43175k.G(new b((InterfaceC48745a.f) interfaceC48745a2, strSellerOrdersState2, this, null));
                }
                boolean z13 = interfaceC48745a2 instanceof InterfaceC48745a.i ? true : interfaceC48745a2 instanceof InterfaceC48745a.j;
                com.avito.android.str_seller_orders.orders_seller.domain.s sVar = this.f289547a;
                if (z13) {
                    InterfaceC43160i<StrSellerOrdersInternalAction> interfaceC43160iA = sVar.a(null, strSellerOrdersState2.f289581g, false);
                    com.avito.android.str_seller_orders.orders_seller.domain.b bVar = this.f289548b;
                    bVar.getClass();
                    PageForBanner pageForBanner = PageForBanner.f303306b;
                    return C43175k.N(interfaceC43160iA, new com.avito.android.str_seller_orders.orders_seller.domain.a(bVar.f289330a.b()));
                }
                if (!(interfaceC48745a2 instanceof InterfaceC48745a.k)) {
                    if (interfaceC48745a2 instanceof InterfaceC48745a.l ? true : interfaceC48745a2 instanceof InterfaceC48745a.d) {
                        return sVar.a(null, strSellerOrdersState2.f289581g, true);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                StrSellerOrdersState.LoadingState loadingState = StrSellerOrdersState.LoadingState.f289584b;
                StrSellerOrdersState.LoadingState loadingState2 = strSellerOrdersState2.f289579e;
                if (loadingState2 != loadingState && loadingState2 != StrSellerOrdersState.LoadingState.f289586d && loadingState2 != StrSellerOrdersState.LoadingState.f289585c) {
                    z12 = false;
                }
                if (z12) {
                    return C43175k.w();
                }
                C48445f c48445f = strSellerOrdersState2.f289576b;
                return sVar.a(c48445f != null ? c48445f.f439000e : null, strSellerOrdersState2.f289581g, false);
            }
            c43210w = new C43210w(new StrSellerOrdersInternalAction.OpenDeeplink(((InterfaceC48745a.m) interfaceC48745a2).f439711a));
        }
        return c43210w;
    }
}
