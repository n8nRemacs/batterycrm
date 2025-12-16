package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import Fz0.c;
import bz0.C25738a;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.error.z;
import com.avito.android.remote.model.StrSellerOrder;
import com.avito.android.remote.model.StrSellerOrdersBuyerInfo;
import com.avito.android.remote.model.StrSellerOrdersEstateInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeState;
import com.avito.android.util.ApiException;
import com.avito.android.util.NetworkException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerOrdersRangeViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/p;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/o;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f290320a;

    /* compiled from: StrSellerOrdersRangeViewStateBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/p$a;", "", "<init>", "()V", "", "DEFAULT_STUB_ORDERS_COUNT", "I", "", "ORDER_STUB_ITEM_ID", "Ljava/lang/String;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrSellerOrdersRangeViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[StrSellerOrdersRangeState.LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSellerOrdersRangeState.LoadingState loadingState = StrSellerOrdersRangeState.LoadingState.f290286b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrSellerOrdersRangeState.LoadingState loadingState2 = StrSellerOrdersRangeState.LoadingState.f290286b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public p(@Y61.k J0 j02) {
        this.f290320a = j02;
    }

    @Override // com.avito.android.str_seller_orders.strsellerordersrange.mvi.o
    @Y61.k
    public final StrSellerOrdersRangeState a(@Y61.k StrSellerOrdersRangeState strSellerOrdersRangeState) {
        Fz0.c dVar;
        int iOrdinal = strSellerOrdersRangeState.f290285i.ordinal();
        if (iOrdinal != 0) {
            String str = null;
            if (iOrdinal == 1) {
                List<StrSellerOrder> list = strSellerOrdersRangeState.f290282f;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (StrSellerOrder strSellerOrder : list) {
                    String bookingId = strSellerOrder.getBookingId();
                    String title = strSellerOrder.getTitle();
                    StrSellerOrdersBuyerInfo buyerInfo = strSellerOrder.getBuyerInfo();
                    String review = buyerInfo != null ? buyerInfo.getReview() : str;
                    StrSellerOrdersEstateInfo estateInfo = strSellerOrder.getEstateInfo();
                    String title2 = estateInfo != null ? estateInfo.getTitle() : str;
                    StrSellerOrdersEstateInfo estateInfo2 = strSellerOrder.getEstateInfo();
                    String address = estateInfo2 != null ? estateInfo2.getAddress() : str;
                    StrSellerOrdersEstateInfo estateInfo3 = strSellerOrder.getEstateInfo();
                    AttributedText description = estateInfo3 != null ? estateInfo3.getDescription() : str;
                    StrSellerOrdersEstateInfo estateInfo4 = strSellerOrder.getEstateInfo();
                    String picUrl = estateInfo4 != null ? estateInfo4.getPicUrl() : str;
                    StrSellerOrdersBuyerInfo buyerInfo2 = strSellerOrder.getBuyerInfo();
                    arrayList.add(new C25738a(bookingId, title, review, title2, address, description, picUrl, buyerInfo2 != null ? buyerInfo2.getPicUrl() : str, strSellerOrder.getDeeplink(), C42784z0.f406748b));
                    str = null;
                }
                String str2 = strSellerOrdersRangeState.f290281e;
                if (str2 == null) {
                    str2 = "";
                }
                dVar = !arrayList.isEmpty() ? new c.a(str2, arrayList) : new c.b(str2);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th2 = strSellerOrdersRangeState.f290283g;
                dVar = th2 instanceof NetworkException ? new c.C0320c(R.attr.img_noInternet, R.string.error_layout_no_internet, null, R.string.error_layout_check_connection) : th2 instanceof ApiException ? new c.C0320c(R.attr.img_unknownError, R.string.error_layout_unknown_error, z.j(th2), R.string.error_layout_try_refresh) : new c.C0320c(R.attr.img_unknownError, R.string.error_layout_unknown_error, null, R.string.error_layout_try_refresh);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < 20; i12++) {
                arrayList2.add(new com.avito.android.str_seller_orders.common.items.order_stub.a(com.avito.android.bxcontent.mvi.entity.f.k(this.f290320a, new StringBuilder("order_stub_item_"))));
            }
            dVar = new c.d(arrayList2);
        }
        return StrSellerOrdersRangeState.a(strSellerOrdersRangeState, null, null, null, dVar, null, 191);
    }
}
