package E3;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.offlinization.C;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ActiveOrdersApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LE3/a;", "", "", "filter", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/activeOrders/OrdersNeedActionResponse;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_active-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: ActiveOrdersApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E3.a$a, reason: collision with other inner class name */
    public static final class C0212a {
    }

    @C(timeoutMs = 2200)
    @f("1/transactions")
    @l
    Object a(@t("filter") @k String str, @k Continuation<? super TypedResult<OrdersNeedActionResponse>> continuation);
}
