package iF0;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kF0.C42577a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TravelPaymentSelectorApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LiF0/a;", "", "", "bookingId", "Lcom/avito/android/remote/model/TypedResult;", "LkF0/a;", "a", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: iF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC41280a {
    @f("2/str/booking/payment/types")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("bookingId") Long l12, @k Continuation<? super TypedResult<C42577a>> continuation);
}
