package Ru0;

import Y61.k;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.service_orders.pub.generated.api.orders_api_2.OrdersResponseV3SuccessTabsItemListItem;
import com.google.gson.r;
import dagger.internal.h;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ServiceOrdersJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LRu0/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ru0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15083b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C15083b f14727a = new C15083b();

    @Override // javax.inject.Provider
    public final Object get() {
        C15082a.f14726a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, OrdersResponseV3SuccessTabsItemListItem.class);
        optimalRuntimeTypeAdapterFactoryA.b(OrdersResponseV3SuccessTabsItemListItem.OrdersCalendarLinkV3.class, "ordersCalendarLinkV3");
        optimalRuntimeTypeAdapterFactoryA.b(OrdersResponseV3SuccessTabsItemListItem.OrdersFsActionsV3.class, "ordersFSActionsV3");
        optimalRuntimeTypeAdapterFactoryA.b(OrdersResponseV3SuccessTabsItemListItem.OrdersOrderItemV3.class, "ordersOrderItemV3");
        optimalRuntimeTypeAdapterFactoryA.b(OrdersResponseV3SuccessTabsItemListItem.OrdersReminderBannerV3.class, "ordersReminderBannerV3");
        optimalRuntimeTypeAdapterFactoryA.b(OrdersResponseV3SuccessTabsItemListItem.OrdersStatusGroupNameV3.class, "ordersStatusGroupNameV3");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
