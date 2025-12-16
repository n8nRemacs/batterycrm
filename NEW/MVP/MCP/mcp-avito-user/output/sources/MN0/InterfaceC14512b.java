package Mn0;

import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import com.avito.android.safedeal.remote.model.SafeDealPayoutRedirectResponse;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import uF.d;

/* compiled from: SafeDealApi.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ9\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00060\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00060\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"LMn0/b;", "", "", "orderID", "redirectTo", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/safedeal/remote/model/SafeDealPayoutRedirectResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "itemID", "serviceID", "", "isEnabled", "Lkotlin/G0;", "d", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/z;", "query", "itemLocationId", "Lio/reactivex/rxjava3/core/I;", "LuF/d$c;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "itemId", "context", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockResponse;", "c", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Mn0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14512b {
    @f("1/sd/order/request/payout")
    @k
    z<TypedResult<SafeDealPayoutRedirectResponse>> a(@t("orderId") @k String orderID, @l @t("redirectTo") String redirectTo);

    @f("/api/2/location/suggest/by_query")
    @k
    I<TypedResult<d.c>> b(@t("query") @k String query, @l @t("itemLocationId") String itemLocationId);

    @J81.k({"X-Geo-required: true"})
    @f("1/delivery/order/realOneClick/slider")
    @k
    I<TypedResult<SafeDealPaymentBlockResponse>> c(@t("itemId") @k String itemId, @l @t("context") String context);

    @o("1/attributeAggregator/item/service/toggle")
    @k
    z<TypedResult<G0>> d(@t("itemId") @k String itemID, @t("serviceId") @k String serviceID, @t("isEnabled") boolean isEnabled);
}
