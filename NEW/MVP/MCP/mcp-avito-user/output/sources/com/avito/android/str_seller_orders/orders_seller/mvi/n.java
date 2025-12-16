package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import sz0.C48445f;

/* compiled from: StrSellerOrdersReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements u<StrSellerOrdersInternalAction, StrSellerOrdersState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.g f289641b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.m f289642c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p f289643d;

    @Inject
    public n(@Y61.k com.avito.android.str_seller_orders.orders_seller.domain.g gVar, @Y61.k com.avito.android.str_seller_orders.orders_seller.domain.m mVar, @Y61.k p pVar) {
        this.f289641b = gVar;
        this.f289642c = mVar;
        this.f289643d = pVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final StrSellerOrdersState a(StrSellerOrdersInternalAction strSellerOrdersInternalAction, StrSellerOrdersState strSellerOrdersState) {
        StrSellerOrdersInternalAction strSellerOrdersInternalAction2 = strSellerOrdersInternalAction;
        StrSellerOrdersState strSellerOrdersState2 = strSellerOrdersState;
        boolean z12 = strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.Init;
        p pVar = this.f289643d;
        if (z12) {
            StrSellerOrdersInternalAction.Init init = (StrSellerOrdersInternalAction.Init) strSellerOrdersInternalAction2;
            return pVar.a(StrSellerOrdersState.a(strSellerOrdersState2, null, init.f289568b, false, null, null, init.f289569c, null, null, 445));
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.ContentLoading) {
            StrSellerOrdersInternalAction.ContentLoading contentLoading = (StrSellerOrdersInternalAction.ContentLoading) strSellerOrdersInternalAction2;
            boolean z13 = contentLoading.f289566d;
            return pVar.a(StrSellerOrdersState.a(strSellerOrdersState2, null, false, z13, contentLoading.f289567e ? StrSellerOrdersState.LoadingState.f289585c : z13 ? StrSellerOrdersState.LoadingState.f289584b : StrSellerOrdersState.LoadingState.f289586d, null, null, null, null, 491));
        }
        boolean z14 = strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.ContentLoaded;
        com.avito.android.str_seller_orders.orders_seller.domain.m mVar = this.f289642c;
        if (z14) {
            List<TV0.a> list = strSellerOrdersState2.f289578d ? null : strSellerOrdersState2.f289582h;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            StrSellerOrdersInternalAction.ContentLoaded contentLoaded = (StrSellerOrdersInternalAction.ContentLoaded) strSellerOrdersInternalAction2;
            C48445f c48445f = contentLoaded.f289565b;
            return pVar.a(StrSellerOrdersState.a(strSellerOrdersState2, contentLoaded.f289565b, false, false, StrSellerOrdersState.LoadingState.f289587e, null, mVar.a(c48445f.f438996a), C42745f0.h0(this.f289641b.a(c48445f.f438998c), list), null, 302));
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.ContentError) {
            return pVar.a(StrSellerOrdersState.a(strSellerOrdersState2, null, false, false, StrSellerOrdersState.LoadingState.f289588f, null, null, null, null, 495));
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.BannerLoading) {
            return StrSellerOrdersState.a(strSellerOrdersState2, null, false, false, null, StrSellerOrdersState.a.c.f289593a, null, null, null, 479);
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.BannerLoaded) {
            return pVar.a(StrSellerOrdersState.a(strSellerOrdersState2, null, false, false, null, new StrSellerOrdersState.a.b(((StrSellerOrdersInternalAction.BannerLoaded) strSellerOrdersInternalAction2).f289559b), null, null, null, 479));
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.BannerLoadingError) {
            return pVar.a(StrSellerOrdersState.a(strSellerOrdersState2, null, false, false, null, StrSellerOrdersState.a.C8724a.f289591a, null, null, null, 479));
        }
        if (!(strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.UpdateFilters)) {
            return strSellerOrdersState2;
        }
        StrSellerOrdersInternalAction.UpdateFilters updateFilters = (StrSellerOrdersInternalAction.UpdateFilters) strSellerOrdersInternalAction2;
        LinkedHashMap linkedHashMapA = mVar.a(updateFilters.f289572b);
        C48445f c48445f2 = strSellerOrdersState2.f289576b;
        return pVar.a(StrSellerOrdersState.a(strSellerOrdersState2, c48445f2 != null ? new C48445f(updateFilters.f289572b, c48445f2.f438997b, c48445f2.f438998c, c48445f2.f438999d, c48445f2.f439000e, c48445f2.f439001f, c48445f2.f439002g) : null, false, false, null, null, linkedHashMapA, null, null, 446));
    }
}
