package gk0;

import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.early_access.generated.api.order_status_v_2.OrderStatusV2Response;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import hk0.C40951a;
import hk0.C40952b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: EarlyAccessApi.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgk0/a;", "", "", "key", "Lhk0/b;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Lhk0/a;", "a", "(Ljava/lang/String;Lhk0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "earlyAccessOrderId", "Lcom/avito/android/remote/early_access/generated/api/order_status_v_2/OrderStatusV2Response;", "b", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: gk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC40698a {
    @o("1/realty/earlyAccessPay")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("key") String str, @J81.a @k C40952b c40952b, @k Continuation<? super TypedResult<C40951a>> continuation);

    @f("2/realty/earlyAccessOrderStatus")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@l @t("key") String str, @t("earlyAccessOrderId") long j12, @k Continuation<? super TypedResult<OrderStatusV2Response>> continuation);
}
