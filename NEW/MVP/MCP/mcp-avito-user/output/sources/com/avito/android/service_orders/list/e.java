package com.avito.android.service_orders.list;

import com.avito.android.B2;
import com.avito.android.service_orders.list.blueprints.f;
import com.avito.android.service_orders.pub.generated.api.orders_api_2.OrdersFsActionsV3;
import com.avito.android.service_orders.pub.generated.api.orders_api_2.OrdersFsActionsV3ActionsItem;
import com.avito.android.service_orders.pub.generated.api.orders_api_2.OrdersResponseV3SuccessTabsItemListItem;
import com.avito.android.util.InterfaceC35863o4;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrdersListItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/e;", "Lcom/avito/android/service_orders/list/d;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B2 f279371a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f279372b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_persistence.b f279373c;

    /* compiled from: ServiceOrdersListItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f279374a;

        static {
            int[] iArr = new int[OrdersResponseV3SuccessTabsItemListItem.OrdersOrderItemV3.Status.values().length];
            try {
                iArr[OrdersResponseV3SuccessTabsItemListItem.OrdersOrderItemV3.Status.NeedConfirmation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrdersResponseV3SuccessTabsItemListItem.OrdersOrderItemV3.Status.NeedConfirmationByClient.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrdersResponseV3SuccessTabsItemListItem.OrdersOrderItemV3.Status.Confirmed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrdersResponseV3SuccessTabsItemListItem.OrdersOrderItemV3.Status.Canceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrdersResponseV3SuccessTabsItemListItem.OrdersOrderItemV3.Status.CanceledByClient.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f279374a = iArr;
        }
    }

    @Inject
    public e(@Y61.k B2 b22, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.service_booking_persistence.b bVar) {
        this.f279371a = b22;
        this.f279372b = interfaceC35863o4;
        this.f279373c = bVar;
    }

    @Override // com.avito.android.service_orders.list.d
    @Y61.k
    public final com.avito.android.service_orders.list.blueprints.f a(@Y61.k OrdersFsActionsV3 ordersFsActionsV3) {
        String strA = this.f279372b.a();
        List<OrdersFsActionsV3ActionsItem> listA = ordersFsActionsV3.a();
        int iF2 = P0.f(C42745f0.q(listA, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (OrdersFsActionsV3ActionsItem ordersFsActionsV3ActionsItem : listA) {
            linkedHashMap.put(ordersFsActionsV3ActionsItem.getType().f279696b, new f.a(ordersFsActionsV3ActionsItem.getTitle(), ordersFsActionsV3ActionsItem.getSubtitle(), ordersFsActionsV3ActionsItem.getStatus(), ordersFsActionsV3ActionsItem.getUri(), ordersFsActionsV3ActionsItem.getIcon()));
        }
        return new com.avito.android.service_orders.list.blueprints.f(linkedHashMap, strA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0288  */
    @Override // com.avito.android.service_orders.list.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.conveyor_item.a b(@Y61.k com.avito.android.service_orders.pub.generated.api.orders_api_2.OrdersResponseV3SuccessTabsItemListItem r26) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_orders.list.e.b(com.avito.android.service_orders.pub.generated.api.orders_api_2.OrdersResponseV3SuccessTabsItemListItem):com.avito.conveyor_item.a");
    }
}
