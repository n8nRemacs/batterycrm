package Nx0;

import J81.f;
import J81.s;
import J81.t;
import Ux0.e;
import Y61.k;
import Y61.l;
import com.avito.android.offlinization.C;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: StrBookingApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LNx0/b;", "", "", "orderId", "uxFeedbackEventName", "Lcom/avito/android/remote/model/TypedResult;", "LUx0/c;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LUx0/e;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Nx0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14622b {

    /* compiled from: StrBookingApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nx0.b$a */
    public static final class a {
    }

    @f("1/str/booking/getUpdatedTime")
    @l
    Object a(@t("orderId") @k String str, @k Continuation<? super TypedResult<e>> continuation);

    @C(timeoutMs = 1000)
    @f("1/str/order/buyer/{orderId}")
    @l
    Object b(@s("orderId") @k String str, @l @t("eventName") String str2, @k Continuation<? super TypedResult<Ux0.c>> continuation);
}
