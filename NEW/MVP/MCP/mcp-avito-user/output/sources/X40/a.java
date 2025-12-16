package X40;

import J81.f;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.offlinization.C;
import com.avito.android.offlinization.n;
import com.avito.android.offlinization.o;
import com.avito.android.orders.api.model.BeduinOrdersResponse;
import com.avito.android.orders.api.model.OrdersBadgeResponse;
import com.avito.android.orders.api.model.UpdatedOrderResponse;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: OrdersApi.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\nH'¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LX40/a;", "", "", "orderOwnerType", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/orders/api/model/BeduinOrdersResponse;", "b", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/orders/api/model/OrdersBadgeResponse;", "c", "()Lio/reactivex/rxjava3/core/I;", "orderId", "", "onlyOrder", "Lcom/avito/android/orders/api/model/UpdatedOrderResponse;", "a", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {
    @f("1/profile/orders/listItem")
    @l
    Object a(@t("referenceId") @k String str, @t("onlyOrder") boolean z12, @k Continuation<? super TypedResult<UpdatedOrderResponse>> continuation);

    @C(timeoutMs = 1650)
    @f("2/profile/orders")
    @l
    Object b(@com.avito.android.offlinization.l(defaultValue = ProfileTab.ALL) @l @t("orderOwnerType") String str, @u @k @n(excludeQueryIfDefault = {@o(key = "", name = "query")}) Map<String, String> map, @k Continuation<? super TypedResult<BeduinOrdersResponse>> continuation);

    @f("1/profile/orders/badges")
    @k
    I<TypedResult<OrdersBadgeResponse>> c();
}
