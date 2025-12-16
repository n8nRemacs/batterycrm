package c50;

import J81.f;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.offlinization.C;
import com.avito.android.orders_aggregation.api.remote.model.OrdersAggregationResult;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: OrdersAggregationApi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc50/a;", "", "", "", "supportedTabs", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_orders-aggregation"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: c50.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC26944a {
    @C(timeoutMs = 1600)
    @f("1/transactions/tabs")
    @l
    Object a(@u @k Map<String, String> map, @k Continuation<? super TypedResult<OrdersAggregationResult>> continuation);
}
