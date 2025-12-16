package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.J0;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import yz0.e;

/* compiled from: StrSellerOrdersViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/t;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/s;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f290064a;

    /* compiled from: StrSellerOrdersViewStateBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/t$a;", "", "<init>", "()V", "", "BANNER_ITEM_ID", "Ljava/lang/String;", "", "DEFAULT_STUB_ORDERS_COUNT", "I", "FILTER_STUB_ITEM_ID", "HEADER_STUB_ITEM_ID", "INLINE_FILTERS_ITEM_ID", "ORDER_STUB_ITEM_ID", "WIDGET_STUB_ITEM_ID", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            int[] iArr = new int[StrSellerOrdersState.LoadingType.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSellerOrdersState.LoadingType loadingType = StrSellerOrdersState.LoadingType.f289898b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrSellerOrdersState.LoadingType loadingType2 = StrSellerOrdersState.LoadingType.f289898b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                StrSellerOrdersState.LoadingType loadingType3 = StrSellerOrdersState.LoadingType.f289898b;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public t(@Y61.k J0 j02) {
        this.f290064a = j02;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.s
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState a(@Y61.k com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState r29) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.strsellerorders.mvi.t.a(com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState):com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState");
    }

    public final e.a b(yz0.d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.widget_stub.a());
        arrayList.add(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.header_stub.a());
        arrayList.add(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.filters_stub.a());
        for (int i12 = 0; i12 < 20; i12++) {
            arrayList.add(new com.avito.android.str_seller_orders.common.items.order_stub.a(com.avito.android.bxcontent.mvi.entity.f.k(this.f290064a, new StringBuilder("order_stub_item_"))));
        }
        return new e.a(dVar, arrayList);
    }
}
