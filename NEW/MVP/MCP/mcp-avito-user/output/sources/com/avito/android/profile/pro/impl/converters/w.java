package com.avito.android.profile.pro.impl.converters;

import com.avito.android.activeOrders.Item;
import com.avito.android.activeOrders.ItemContent;
import com.avito.android.activeOrders.ItemType;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.profile.pro.impl.screen.item.orders.ProfileProOrdersItem;
import com.avito.android.util.O2;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProOrdersConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/w;", "Lcom/avito/android/profile/pro/impl/converters/v;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.active_orders_common.items.order.c f222480a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.active_orders_common.items.all_orders.c f222481b;

    /* compiled from: ProfileProOrdersConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222482a;

        static {
            int[] iArr = new int[ItemType.values().length];
            try {
                iArr[ItemType.GOODS_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemType.SHOW_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f222482a = iArr;
        }
    }

    @Inject
    public w(@Y61.k com.avito.android.active_orders_common.items.order.c cVar, @Y61.k com.avito.android.active_orders_common.items.all_orders.c cVar2) {
        this.f222480a = cVar;
        this.f222481b = cVar2;
    }

    @Override // com.avito.android.profile.pro.impl.converters.v
    @Y61.k
    public final List<ProfileProOrdersItem> a(@Y61.k ProfileTabWidget.h hVar, @Y61.l OrdersNeedActionResponse ordersNeedActionResponse) {
        ProfileTabWidget.h.a aVar;
        if (ordersNeedActionResponse != null && O2.a(ordersNeedActionResponse.getItems())) {
            return Collections.singletonList(new ProfileProOrdersItem("orders", ordersNeedActionResponse.getTitle(), ordersNeedActionResponse.getBadgeTitle(), ordersNeedActionResponse.getOnTapDeepLink(), ordersNeedActionResponse.getOnShowDeepLink(), b(ordersNeedActionResponse.getItems())));
        }
        String str = hVar.f222800b;
        if (str == null || (aVar = hVar.f222801c) == null) {
            return C42784z0.f406748b;
        }
        return Collections.singletonList(new ProfileProOrdersItem("orders", str, null, aVar.f222803b, null, b(Collections.singletonList(new Item(ItemType.SHOW_ALL, new ItemContent(aVar != null ? aVar.f222802a : null, null, aVar != null ? aVar.f222803b : null, null, null, null))))));
    }

    public final List<ParcelableItem> b(List<Item> list) {
        com.avito.conveyor_item.a aVarA;
        ArrayList arrayList = null;
        if (list != null) {
            List<Item> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Item item = (Item) obj;
                int i14 = a.f222482a[item.getType().ordinal()];
                if (i14 == 1) {
                    aVarA = this.f222480a.a(item.getContent(), i12);
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVarA = this.f222481b.a(item.getContent(), i12);
                }
                arrayList2.add(aVarA);
                i12 = i13;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }
}
