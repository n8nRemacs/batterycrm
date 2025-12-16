package com.avito.android.str_seller_orders.strsellerordersdialog.mvi;

import Bz0.C13210c;
import Bz0.C13211d;
import bz0.C25738a;
import com.avito.android.J0;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.StrSellerOrder;
import com.avito.android.remote.model.StrSellerOrdersBuyerInfo;
import com.avito.android.remote.model.StrSellerOrdersEstateInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_seller_orders.strsellerordersdialog.mvi.entity.StrSellerOrdersDialogInternalAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerOrdersDialogReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "LBz0/c;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<StrSellerOrdersDialogInternalAction, C13210c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J0 f290164b;

    /* compiled from: StrSellerOrdersDialogReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/j$a;", "", "<init>", "()V", "", "DEFAULT_STUB_COUNT", "I", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k J0 j02) {
        this.f290164b = j02;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13210c a(StrSellerOrdersDialogInternalAction strSellerOrdersDialogInternalAction, C13210c c13210c) {
        ArrayList arrayList;
        StrSellerOrdersDialogInternalAction strSellerOrdersDialogInternalAction2 = strSellerOrdersDialogInternalAction;
        C13210c c13210c2 = c13210c;
        if (!(strSellerOrdersDialogInternalAction2 instanceof StrSellerOrdersDialogInternalAction.InitWithNewDialogData)) {
            return c13210c2;
        }
        StrSellerOrdersDialogData strSellerOrdersDialogData = ((StrSellerOrdersDialogInternalAction.InitWithNewDialogData) strSellerOrdersDialogInternalAction2).f290151b;
        C13210c c13210cA = C13210c.a(c13210c2, strSellerOrdersDialogData.f290169c, strSellerOrdersDialogData.f290170d, strSellerOrdersDialogData.f290171e, null, 8);
        if (c13210cA.f1840d) {
            arrayList = new ArrayList();
            for (int i12 = 0; i12 < 5; i12++) {
                arrayList.add(new com.avito.android.str_seller_orders.common.items.order_stub.a(com.avito.android.bxcontent.mvi.entity.f.k(this.f290164b, new StringBuilder("stub_item_"))));
            }
            G0 g02 = G0.f406611a;
        } else {
            List<StrSellerOrder> list = c13210cA.f1839c;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (StrSellerOrder strSellerOrder : list) {
                String bookingId = strSellerOrder.getBookingId();
                String title = strSellerOrder.getTitle();
                StrSellerOrdersBuyerInfo buyerInfo = strSellerOrder.getBuyerInfo();
                String review = buyerInfo != null ? buyerInfo.getReview() : null;
                StrSellerOrdersEstateInfo estateInfo = strSellerOrder.getEstateInfo();
                String title2 = estateInfo != null ? estateInfo.getTitle() : null;
                StrSellerOrdersEstateInfo estateInfo2 = strSellerOrder.getEstateInfo();
                String address = estateInfo2 != null ? estateInfo2.getAddress() : null;
                StrSellerOrdersEstateInfo estateInfo3 = strSellerOrder.getEstateInfo();
                AttributedText description = estateInfo3 != null ? estateInfo3.getDescription() : null;
                StrSellerOrdersEstateInfo estateInfo4 = strSellerOrder.getEstateInfo();
                String picUrl = estateInfo4 != null ? estateInfo4.getPicUrl() : null;
                StrSellerOrdersBuyerInfo buyerInfo2 = strSellerOrder.getBuyerInfo();
                arrayList2.add(new C25738a(bookingId, title, review, title2, address, description, picUrl, buyerInfo2 != null ? buyerInfo2.getPicUrl() : null, strSellerOrder.getDeeplink(), strSellerOrder.getButtons()));
            }
            arrayList = arrayList2;
        }
        c13210cA.f1841e.getClass();
        return C13210c.a(c13210cA, null, null, false, new C13211d(arrayList, c13210cA.f1838b), 7);
    }
}
