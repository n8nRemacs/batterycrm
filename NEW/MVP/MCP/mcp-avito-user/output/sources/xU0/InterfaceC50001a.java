package xu0;

import J81.e;
import J81.o;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_order_widget.api.model.ServiceOrderRequestResponse;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceOrderRequestApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxu0/a;", "", "", "endpointVersion", "", "formId", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse;", "a", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: xu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC50001a {
    @o("{endpointVersion}/services-requests/order/send")
    @e
    @l
    Object a(@s("endpointVersion") int i12, @J81.c("formId") @k String str, @J81.c("itemId") @k String str2, @k Continuation<? super TypedResult<ServiceOrderRequestResponse>> continuation);
}
