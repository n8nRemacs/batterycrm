package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.J0;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.a;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.b;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sz0.C48445f;

/* compiled from: StrSellerOrdersViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/q;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/p;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f289647a;

    /* compiled from: StrSellerOrdersViewStateBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/q$a;", "", "<init>", "()V", "", "BANNER_ITEM_ID", "Ljava/lang/String;", "", "DEFAULT_STUB_ORDERS_COUNT", "I", "EMPTY_ORDERS_ITEM_ID", "FILTERS_ITEM_ID", "FILTER_STUB_ITEM_ID", "HEADER_STUB_ITEM_ID", "ORDER_STUB_ITEM_ID", "WIDGET_CONTAINER_ITEM_ID", "WIDGET_ITEM_ID", "WIDGET_STUB_ITEM_ID", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrSellerOrdersViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[StrSellerOrdersState.LoadingState.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSellerOrdersState.LoadingState loadingState = StrSellerOrdersState.LoadingState.f289584b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrSellerOrdersState.LoadingState loadingState2 = StrSellerOrdersState.LoadingState.f289584b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                StrSellerOrdersState.LoadingState loadingState3 = StrSellerOrdersState.LoadingState.f289584b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                StrSellerOrdersState.LoadingState loadingState4 = StrSellerOrdersState.LoadingState.f289584b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public q(@Y61.k J0 j02) {
        this.f289647a = j02;
    }

    public static com.avito.android.str_seller_orders.orders_seller.mvi.entity.a c(StrSellerOrdersState strSellerOrdersState) {
        if (!strSellerOrdersState.f289577c) {
            return a.C8725a.f289594a;
        }
        C48445f c48445f = strSellerOrdersState.f289576b;
        return (c48445f != null ? c48445f.f438997b : null) != null ? new a.c(com.avito.android.printable_text.b.f(c48445f.f438997b)) : a.b.f289595a;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01b9  */
    @Override // com.avito.android.str_seller_orders.orders_seller.mvi.p
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState a(@Y61.k com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState r27) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.orders_seller.mvi.q.a(com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState):com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState");
    }

    public final b.a b(StrSellerOrdersState strSellerOrdersState) {
        com.avito.android.str_seller_orders.orders_seller.mvi.entity.a aVarC = c(strSellerOrdersState);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("widget_stub_item");
        J0 j02 = this.f289647a;
        arrayList.add(new com.avito.android.str_seller_orders.orders_seller.items.widget_stub.c(com.avito.android.bxcontent.mvi.entity.f.k(j02, sb2)));
        arrayList.add(new com.avito.android.str_seller_orders.orders_seller.items.header_stub.c(com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("header_stub_item"))));
        arrayList.add(new com.avito.android.str_seller_orders.orders_seller.items.filters_stub.c(com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("filter_stub_item"))));
        arrayList.addAll(d());
        return new b.a(aVarC, arrayList);
    }

    public final ArrayList d() {
        kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, 3);
        ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
        kotlin.ranges.k it = lVarR.iterator();
        while (it.f406910d) {
            it.a();
            arrayList.add(new com.avito.android.str_seller_orders.common.items.order_stub.a(com.avito.android.bxcontent.mvi.entity.f.k(this.f289647a, new StringBuilder("order_stub_item"))));
        }
        return arrayList;
    }
}
