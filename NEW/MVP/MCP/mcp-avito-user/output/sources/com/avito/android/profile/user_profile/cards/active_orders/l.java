package com.avito.android.profile.user_profile.cards.active_orders;

import com.avito.android.activeOrders.Item;
import com.avito.android.activeOrders.ItemType;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ActiveOrdersItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/l;", "Lcom/avito/android/profile/user_profile/cards/active_orders/k;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f224665a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.active_orders_common.items.order.c f224666b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.active_orders_common.items.all_orders.c f224667c;

    /* compiled from: ActiveOrdersItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224668a;

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
            f224668a = iArr;
        }
    }

    @Inject
    public l(@Y61.k n nVar, @Y61.k com.avito.android.active_orders_common.items.order.c cVar, @Y61.k com.avito.android.active_orders_common.items.all_orders.c cVar2) {
        this.f224665a = nVar;
        this.f224666b = cVar;
        this.f224667c = cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.profile.user_profile.cards.active_orders.k
    @Y61.k
    public final CardItem.ActiveOrdersWidgetCardItem a(@Y61.k String str, @Y61.k OrdersNeedActionResponse ordersNeedActionResponse) {
        C42784z0 c42784z0;
        com.avito.conveyor_item.a aVarA;
        String title = ordersNeedActionResponse.getTitle();
        String badgeTitle = ordersNeedActionResponse.getBadgeTitle();
        DeepLink onTapDeepLink = ordersNeedActionResponse.getOnTapDeepLink();
        DeepLink onShowDeepLink = ordersNeedActionResponse.getOnShowDeepLink();
        List<Item> items = ordersNeedActionResponse.getItems();
        List<Item> list = items;
        if (list == null || list.isEmpty()) {
            c42784z0 = C42784z0.f406748b;
        } else {
            List<Item> list2 = items;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Item item = (Item) obj;
                int i14 = a.f224668a[item.getType().ordinal()];
                if (i14 == 1) {
                    aVarA = this.f224666b.a(item.getContent(), i12);
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVarA = this.f224667c.a(item.getContent(), i12);
                }
                arrayList.add(aVarA);
                i12 = i13;
            }
            c42784z0 = arrayList;
        }
        return new CardItem.ActiveOrdersWidgetCardItem(str, title, badgeTitle, onTapDeepLink, onShowDeepLink, c42784z0, this.f224665a.getF224672a());
    }
}
