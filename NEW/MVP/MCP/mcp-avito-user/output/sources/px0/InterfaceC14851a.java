package Px0;

import J81.f;
import J81.s;
import J81.t;
import Qx0.C14948a;
import Rx0.C15094a;
import Sx0.C15258g;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: StrBookingApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\n\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LPx0/a;", "", "", "intent", "", "bookingId", "Lcom/avito/android/remote/model/TypedResult;", "LQx0/a;", "b", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderId", "LRx0/a;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSx0/g;", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Px0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14851a {
    @f("2/str/booking/getUpdatedTime")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("orderId") @k String str, @k Continuation<? super TypedResult<C15094a>> continuation);

    @f("1/str/help/chat")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object b(@t("intent") @k String str, @t("bookingId") long j12, @k Continuation<? super TypedResult<C14948a>> continuation);

    @f("4/str/order/seller/{orderId}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@s("orderId") long j12, @k Continuation<? super TypedResult<C15258g>> continuation);
}
