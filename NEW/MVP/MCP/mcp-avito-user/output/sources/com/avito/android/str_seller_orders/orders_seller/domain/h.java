package com.avito.android.str_seller_orders.orders_seller.domain;

import com.avito.android.J0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sz0.InterfaceC48440a;

/* compiled from: StrSellerOrdersBookingItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/h;", "Lcom/avito/android/str_seller_orders/orders_seller/domain/g;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f289334a;

    /* compiled from: StrSellerOrdersBookingItemsConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/h$a;", "", "<init>", "()V", "", "INFO_BLOCK_ITEM_ID", "Ljava/lang/String;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public h(@Y61.k J0 j02) {
        this.f289334a = j02;
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.domain.g
    @Y61.k
    public final ArrayList a(@Y61.l List list) {
        com.avito.conveyor_item.a cVar;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        List<InterfaceC48440a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (InterfaceC48440a interfaceC48440a : list2) {
            if (interfaceC48440a instanceof InterfaceC48440a.C12654a) {
                InterfaceC48440a.C12654a c12654a = (InterfaceC48440a.C12654a) interfaceC48440a;
                String str = c12654a.f438961f;
                Image image = c12654a.f438962g;
                Image image2 = c12654a.f438956a;
                AttributedText attributedText = c12654a.f438964i;
                AttributedText attributedText2 = c12654a.f438963h;
                AttributedText attributedText3 = c12654a.f438959d;
                AttributedText attributedText4 = c12654a.f438958c;
                cVar = new com.avito.android.str_seller_orders.orders_seller.items.booking_info.c(image, c12654a.f438957b, attributedText, attributedText2, c12654a.f438960e, str, image2, attributedText3, attributedText4);
            } else {
                if (!(interfaceC48440a instanceof InterfaceC48440a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC48440a.b bVar = (InterfaceC48440a.b) interfaceC48440a;
                cVar = new com.avito.android.str_seller_orders.orders_seller.items.info_block.c(com.avito.android.bxcontent.mvi.entity.f.k(this.f289334a, new StringBuilder("info_block_item")), bVar.f438966b, bVar.f438968d, bVar.f438967c, bVar.f438965a);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
