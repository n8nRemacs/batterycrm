package Bs0;

import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking.api.remote.model.details.ServiceBookingItemDetailsResult;
import com.avito.android.service_booking.api.remote.model.onboarding.ServicesOnboarding;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0010J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LBs0/a;", "", "", "action", "type", "id", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "refKey", "c", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cpxContext", "Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding;", "e", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Bs0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13182a {
    @o("1/serviceBooking/calendar/bookingDetails")
    @e
    @l
    Object a(@J81.c("id") @k String str, @k Continuation<? super TypedResult<ServiceBookingItemDetailsResult>> continuation);

    @o("1/serviceBooking/{action}/{type}")
    @e
    @k
    I<TypedResult<SimpleMessageResult>> b(@s("action") @k String action, @s("type") @k String type, @J81.c("id") @k String id2);

    @o("1/serviceBooking/referralLink/register")
    @e
    @k
    I<TypedResult<SimpleMessageResult>> c(@J81.c("refKey") @k String refKey);

    @o("1/serviceBooking/onboarding")
    @l
    Object d(@k Continuation<? super TypedResult<ServicesOnboarding>> continuation);

    @f("1/tariff/services/onboarding")
    @l
    Object e(@t("context") @k String str, @k Continuation<? super TypedResult<ServicesOnboarding>> continuation);
}
